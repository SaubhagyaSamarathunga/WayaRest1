package javaapplication1;

public class Main {
public static void main(String[] args) {
// Create a new User
User user = new User("A.L.Perera", "perera529@.com", "0787995942", "1988-05-16", "test1234");

// Print initial details
System.out.println("Username: " + user.getUsername());
System.out.println("Email: " + user.getEmail());

// Update some info
user.setEmail("testmail@gmail.com");
user.setPassword("testpw1234");

// Print updated info
System.out.println("Updated Email: " + user.getEmail());
System.out.println("Updated Password: " + user.getPassword());
}
}
