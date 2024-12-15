// Functional interfaces are interfaces with exactly one abstract method. 
// They are used extensively in Java for lambda expressions and method references.

// This interface A is a functional interface with one abstract method: show().
@FunctionalInterface
interface A {
    void show();
}

// This interface B is another functional interface with one abstract method: display(String message).
@FunctionalInterface
interface B {
    void display(String message);
}

// This interface C is a functional interface that takes two integers and returns their sum.
@FunctionalInterface
interface C {
    int add(int a, int b);
}

// Main class demonstrating the use of functional interfaces and lambda expressions
public class DemoFunctionalInterface {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Implementing interface A using a lambda expression
        // The lambda () -> System.out.println("Lambda: Show method called!") is an inline implementation of the show() method.
        A obj = () -> System.out.println("Lambda: Show method called!");
        obj.show(); // Calling the show() method

        // Implementing interface B using a lambda expression
        // The lambda (message) -> System.out.println("Message: " + message) implements the display method of interface B.
        B obj1 = (message) -> System.out.println("Message: " + message);
        obj1.display("Hello World from Interface B"); // Calling the display() method with a message

        // Implementing interface C using a lambda expression
        // The lambda (a, b) -> a + b provides the logic for the add method of interface C.
        C obj2 = (a, b) -> a + b;
        System.out.println("Sum: " + obj2.add(2, 3)); // Calling the add() method with two numbers
    }
}
