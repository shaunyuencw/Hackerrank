import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int inInt;
        double inDub;
        String inStr;
        /* Declare second integer, double, and String variables. */

        inInt = scan.nextInt();
        
        inDub = scan.nextDouble();
        scan.nextLine();
        
        inStr = scan.nextLine();
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        System.out.println(i + inInt);
        /* Print the sum of both integer variables on a new line. */

        System.out.println(d + inDub);
        /* Print the sum of the double variables on a new line. */
		
        System.out.println(s + inStr);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}
