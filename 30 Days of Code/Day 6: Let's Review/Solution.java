import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numStrings = sc.nextInt();
        
        for (int j = 0; j < numStrings; j++){
            String input = sc.next();
        
            String odd = "";
            String even = "";
            for (int i = 0; i < input.length(); i ++){
                if (i % 2 == 0){
                    even += input.charAt(i);
                }
                else{
                    odd += input.charAt(i);
                } 
            }
            
            System.out.print(even + " ");
            System.out.print(odd + "\n");
        }
        
        sc.close();
    }
}
