/*Create a program that accesses an array element using an index provided by the user. 
 Use try-catch to handle the ArrayIndexOutOfBoundsException that might occur if the 
index is invalid. */

import java.util.Scanner;
public class ArrayIndexOutofBounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        String fruits[] = new String[5];
        fruits[0]= "apple";
        fruits[1]= "Mango";
        fruits[2]= "Cherry";
        fruits[3]= "Banana";
        fruits[4]= "orange";

        try {
            System.out.println("Enter the Index: ");
            num = sc.nextInt();
            
            System.out.println("The Fruit is: "+fruits[num]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Element Not Found");
            
        }sc.close();

    }
    
}
