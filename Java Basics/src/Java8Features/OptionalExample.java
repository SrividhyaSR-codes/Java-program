package Java8Features;

//Optional chaining — avoid NPE

import java.util.Optional;

public class OptionalExample {

    record Address(String city) {}
    record User(String name, Address address) {}

    public static void main(String[] args) {
        User user1 = new User("Sri", new Address("Coimbatore"));
        User user2 = new User("Raj", null);

        // Without Optional → NullPointerException risk
        // user2.address.city → NPE!

        // With Optional — safe chaining
        String city1 = Optional.ofNullable(user1)
                .map(User::address)
                .map(Address::city)
                .orElse("City not found");

        String city2 = Optional.ofNullable(user2)
                .map(User::address)
                .map(Address::city)
                .orElse("City not found");

        System.out.println("User1 city: " + city1); // Coimbatore
        System.out.println("User2 city: " + city2); // City not found
    }
}