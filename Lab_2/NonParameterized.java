package Lab_2;

class Test1 {
  
    
    // Non-parameterized (no-argument) constructor
    Test1() {
        System.out.println("No argument Constructor");
    }
}

/**
 * Main class demonstrating the use of a non-parameterized constructor.
 */
public class NonParameterized {
    public static void main(String[] args) {
        // Creating an object of Test1 class using the non-parameterized constructor.
        Test1 t = new Test1();
        
        // The constructor prints "No argument Constructor" when an object is created.
    }
}
