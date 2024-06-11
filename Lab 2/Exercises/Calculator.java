/*Create a class named Calculator with methods for addition, subtraction, multiplication, and 
division. Each method should take two numbers as parameters and return the result. */


import java.util.Scanner;

class Cal{
    int num1;
    int num2;

    public int addition(int num1, int num2){
        return(num1 + num2);
    }

    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }

    public static int division(int num1, int num2){
        return num1 / num2;
    }


   
    
}
public class Calculator {
    public static void main(String[] args) {
        // set the values
        Cal cal1 = new Cal();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the Num2");
        int num2 = sc.nextInt();
        System.out.println("Enter Opt");
        char opt = sc.next().charAt(0);
        if (opt == '+'){
            System.out.println("THe answer is"+ " "+ cal1.addition(num1, num2));
        }
        else if (opt == '-'){
            System.out.println("THe answer is"+ " "+ cal1.subtraction(num1, num2));
        }
        else if (opt == '*'){
            System.out.println("THe answer is"+ " "+ cal1.multiplication(num1, num2));
        }
        else if (opt == '/'){
            System.out.println("THe answer is"+ " "+ cal1.division(num1, num2));
        }

        
    }
    
}
