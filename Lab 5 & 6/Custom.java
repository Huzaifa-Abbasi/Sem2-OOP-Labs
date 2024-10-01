/*Create a custom exception class named NegativeNumberException that extends 
Exception. 
 Write a program that prompts the user for a number and throws a 
NegativeNumberException if the number is negative. 
 Use try-catch to handle this custom exception.  */


import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
public class Custom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        try {
            System.out.println("Enter the Number");
            number = sc.nextInt();
            if (number < 0) {
            
                throw new NegativeNumberException("the number is Negative" + number);
            }else{
                System.out.println("The Number is Positive: "+ number);
            }
            
        } catch (NegativeNumberException e) {
            
            System.out.println(e.getMessage()  );
        } 
    }
}
