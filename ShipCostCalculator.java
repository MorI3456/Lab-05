//This code is made by Connor Casey 9/26/24

import java.util.Scanner; // Import scanner

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); // use scanner to read input 

        // Get the item price
        System.out.print("Enter the price of your item: "); // input
        double price = x.nextDouble(); // Read the input as a double

        double shippingCost;
        double totalPrice;

        // if else statements
        if (price >= 100) {  // If-else for shipping cost
            shippingCost = 0; // Free shipping 
        } else {
            shippingCost = price * 0.02; // 2% shipping 
        }

        // Calculate total cost
        totalPrice = price + shippingCost;

        // Display results
        System.out.println("Shipping Cost: $" + shippingCost);
        System.out.println("Total Price: $" + totalPrice);

        x.close(); // Close the scanner
    }
}





        
