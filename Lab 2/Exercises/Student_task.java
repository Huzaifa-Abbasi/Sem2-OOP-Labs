/*. Create a class named Student with member variables for name, roll number, and marks in three 
subjects. Write a constructor to initialize these variables. */

import java.util.Scanner;

class Student {
   String name;
   int rollno;
   int[] marks;

   public Student(String name, int rollno) {
      this.name = name;
      this.rollno = rollno;
      this.marks = new int[3];
   }
   public int Calculate(){
      Scanner sc = new Scanner(System.in);
      int totalMarks = 0;

      for(int i=0; i<3; i++){
         System.out.println("Enter marks for subject " + (i + 1) + ": ");
         marks[i] = sc.nextInt();
         totalMarks += marks[i];
      }
      return totalMarks;
   }
}   
public class Student_task {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the name of the student:");
   String name = sc.next();
   System.out.println("Enter the Roll Number: ");
   int rollno = sc.nextInt();

   Student student1 = new Student(name, rollno);
   int totalMarks = student1.Calculate();
   System.out.println(student1);
   System.out.println("Total Marks: " + totalMarks);

      
   }
   

}
