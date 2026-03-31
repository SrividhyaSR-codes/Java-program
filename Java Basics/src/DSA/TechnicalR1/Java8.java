package DSA.TechnicalR1;
//Write a Java program using Stream API to find the most expensive product for each category from a list of stores,
// where each store has multiple products.
import java.util.*; // Import all utility classes
import java.util.stream.*; // Import all stream classes

public class Java8 {
    public static void main(String[] args) {
        // Sample data
        List<Store> stores = Arrays.asList( // Create a list of stores
                new Store("Store 1", Arrays.asList( // Store 1 with products
                        new Product("Laptop", "Electronics", 900), // Product: Laptop
                        new Product("Phone", "Electronics", 600), // Product: Phone
                        new Product("Shirt", "Clothing", 50) // Product: Shirt
                )),
                new Store("Store 2", Arrays.asList( // Store 2 with products
                        new Product("TV", "Electronics", 1500), // Product: TV
                        new Product("Fridge", "Appliances", 1200) // Product: Fridge
                )),
                new Store("Store 3", Arrays.asList( // Store 3 with products
                        new Product("Pants", "Clothing", 80), // Product: Pants
                        new Product("Washing Machine", "Appliances", 800), // Product: Washing Machine
                        new Product("Watch", "Accessories", 200) // Product: Watch
                ))
        );

        /*
        Alternate approach using Flatmap java 8 streams:
         Map<String, Product> mostExpensiveByCategory = stores.stream() // Stream of stores
            .flatMap(store -> store.getProducts().stream()) // Flatten products from all stores
            .collect(Collectors.groupingBy( // Group by category
                Product::getCategory, // Use category as key
                Collectors.collectingAndThen( // After grouping
                    Collectors.maxBy(Comparator.comparingInt(Product::getPrice)), // Find max price product
                    Optional::get // Get the product from Optional
                )
            ));
         */
        // Alternative solution without flatMap - using forEach loop
        List<Product> allProducts = new ArrayList<>(); // Create a list to store all products
        stores.forEach(store -> allProducts.addAll(store.getProducts())); // Collect all products from all stores
        
        // Find the most expensive product for each category
        Map<String, Product> mostExpensiveByCategory = allProducts.stream() // Stream of all products
                .collect(Collectors.groupingBy( // Group by category
                        Product::getCategory, // Use category as key
                        Collectors.collectingAndThen( // After grouping
                                Collectors.maxBy(Comparator.comparingInt(Product::getPrice)), // Find max price product
                                Optional::get // Get the product from Optional
                        )
                ));

        // Print the result
        mostExpensiveByCategory.forEach((category, product) -> { // For each category and product
            System.out.println("Category: " + category + ", Product: " + product.getName() + ", Price: " + product.getPrice()); // Print details
        });
    }
}

// Store class
class Store {
    private String name; // Store name
    private List<Product> products; // List of products

    public Store(String name, List<Product> products) { // Constructor
        this.name = name; // Set name
        this.products = products; // Set products
    }

    public List<Product> getProducts() { // Getter for products
        return products; // Return products
    }
}

// Product class
class Product {
    private String name; // Product name
    private String category; // Product category
    private int price; // Product price

    public Product(String name, String category, int price) { // Constructor
        this.name = name; // Set name
        this.category = category; // Set category
        this.price = price; // Set price
    }

    public String getName() { // Getter for name
        return name; // Return name
    }

    public String getCategory() { // Getter for category
        return category; // Return category
    }

    public int getPrice() { // Getter for price
        return price; // Return price
    }
}