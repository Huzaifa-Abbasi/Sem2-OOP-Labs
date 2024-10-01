/*Create a program that prompts the user for two numbers and divides them. 
 Use try-catch to handle the ArithmeticException that might occur if the denominator is zero.  */
import java.util.Scanner;



public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        try{
            System.out.println("Enter the Number 1 ");
            num1 = sc.nextInt();

            System.out.println("Enter the Number 2 ");
            num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Result "+result);

        }catch(ArithmeticException e){
            System.out.println("Divide by zero Not Allow");
        }sc.close();
    }
    
}
