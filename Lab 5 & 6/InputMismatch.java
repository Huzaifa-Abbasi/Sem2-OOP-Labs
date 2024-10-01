/*Write a program that reads an integer from the user using Scanner. 
 Use try-catch to handle the InputMismatchException that might occur if the user enters 
a non-integer value.  */

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int given_num;
        int num;

        try {
            System.out.print("Enter the first number: ");
            given_num = sc.nextInt(); 

            System.out.print("Enter the second number: ");
            num = sc.nextInt();  

            
            if (given_num == num) {
                System.out.println("The numbers are equal."); 
            } else {
                System.out.println("The numbers are not equal."); 
            }
        } catch (InputMismatchException e) {
            System.out.println("The Value is not integer");
            
        }
    }
    
}
