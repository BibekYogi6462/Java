/*
 * This is a simple example demonstrating encapsulation in Java.
 * The program defines a class EncapTest with private fields (name and id) and public getter and setter methods.
 * It also includes a main class Encapsulation that creates an object of EncapTest, sets values using setters,
 * and retrieves values using getters to display them.
 */

package Lab_2;

/**
 * Class demonstrating encapsulation with private fields and public getter and setter methods.
 */
class EncapTest {
   private String name; // Private field to store the name.
   private int id;       // Private field to store the id.

   // Getter method to retrieve the name.
   public String getName() {
      return name;
   }

   // Getter method to retrieve the id.
   public int getId() {
      return id;
   }

   // Setter method to set a new name.
   public void setName(String newName) {
      name = newName;
   }

   // Setter method to set a new id.
   public void setId(int newId) {
      id = newId;
   }
}

/**
 * Main class demonstrating the use of encapsulation with the EncapTest class.
 */
public class Encapsulation {
    public static void main(String[] args) {
      // Creating an object of EncapTest.
      EncapTest encap = new EncapTest();

      // Setting values using setter methods.
      encap.setName("Bibek");
      encap.setId(04);

      // Displaying values using getter methods.
      System.out.println("Name: " + encap.getName() + " and " +"Id: " + encap.getId());
   }
}
