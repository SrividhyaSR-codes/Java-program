package Collections;

public class HashMap {
        public static void main(String[] args) {
            java.util.HashMap<String, Integer> map = new java.util.HashMap<>();

            // Adding key-value pairs to the HashMap
            map.put("One", 1);
            map.put("Two", 2);
            map.put("Three", 3);

            // Accessing values using keys
            System.out.println("Value for 'One': " + map.get("One"));
            System.out.println("Value for 'Two': " + map.get("Two"));

            // Checking if a key exists
            System.out.println("Contains key 'Three': " + map.containsKey("Three"));

            // Removing a key-value pair
            map.remove("Two");
            System.out.println("Contains key 'Two' after removal: " + map.containsKey("Two"));

            // Iterating over the HashMap
            System.out.println("Iterating over HashMap:");
            for (String key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }
        }
}
