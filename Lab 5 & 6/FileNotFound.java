/*Write a program that reads data from a file. 
 Use try-catch to handle the FileNotFoundException that might occur if the file doesn't exist.  */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileNotFound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file path: ");
        String path = input.nextLine(); 
        File file = new File(path);
        try {
            Scanner sc = new Scanner(file); 
            System.out.println("File Found");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: ");
        }
    }

    
}
