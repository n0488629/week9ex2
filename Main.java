import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // create scanner object
      
      System.out.print("Enter the length of the rectangle: ");
      int length = myObj.nextInt(); // read user input
      System.out.print("Enter the width of the rectangle: ");
      int width = myObj.nextInt(); // read user input
      

      int area = length * width; // calculate total area
      int perimeter = length + length + width + width; // calculate total perimeter kept it simple to avoid mistakes
       System.out.println("Results:");
       System.out.println("Area of the rectangle: " + area); // output for user
       System.out.println("Perimeter of the rectangle: " + perimeter);
      myObj.close(); // close scanner object
    }
  }
