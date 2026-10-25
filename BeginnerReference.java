public class BeginnerReference {
    // ========== Variables & Data Types ==========
    // Java requires explicit type declaration
    int age = 25;              // Integer
    double price = 19.99;      // Double precision floating point
    boolean isActive = true;   // Boolean
    char grade = 'A';          // Character
    String name = "Alice";     // String (reference type)

    // ========== Methods (Functions) ==========
    // Method with parameters and return value
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with no return value (void)
    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    // ========== Main Method (Entry Point) ==========
    public static void main(String[] args) {
        // Call methods
        int result = add(2, 3);
        System.out.println("Sum: " + result);  // Sum: 5

        greet("Bob");  // Hello, Bob

        // Basic control flow
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        // Array
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}