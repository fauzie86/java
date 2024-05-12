import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // 1. Printing a message to the console
        System.out.println("Hello, World!");

        // 2. Declaring and initializing variables of different data types
        int age = 25;
        String name = "Joaquin";

        // Using variables in a statement
        System.out.println("My name is " + name + " and I am " + age + " years old.");

        // 3. Using an if-else statement to check a condition
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // 4. Using a for loop to iterate a certain number of times
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop iteration: " + (i + 1));
        }

        // 5. Getting user input using Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int userInputAge = scanner.nextInt();
        System.out.println("Your entered age is: " + userInputAge);

        // Close the scanner object to prevent resource leak
        scanner.close();
    }
}



