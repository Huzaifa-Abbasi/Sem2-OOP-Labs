import java.util.Scanner;

public class New {
   public Custom() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);

      try {
         System.out.println("Enter the Number");
         int var2 = var1.nextInt();
         if (var2 < 0) {
            throw new NegativeNumberException("the number is Negative" + var2);
         }

         System.out.println("The Number is Positive: " + var2);
         } catch (NegativeNumberException var4) {
         System.out.println(var4.getMessage());
        }

    }
}
