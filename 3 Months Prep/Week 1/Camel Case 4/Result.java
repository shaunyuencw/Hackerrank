import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input;
        while(sc.hasNext()){
            input = sc.nextLine();
            camelCase(input);
        }
        
        sc.close();
    }

    public static void camelCase(String input){
        // S: Split, C: Combine
        // M: method, C: class, V: variable
        String[] splitArr = input.split(";", 3);
        String[] splitStr = splitArr[2].split(" ", 0);
        ArrayList<Character> tempStr = new ArrayList<Character>();
        String printStr = "";
        int i;
        
        if (splitArr[0].equals("S")){
            // Should be one word
            if (splitArr[1].equals("M")){
                // Remove () at the end
                splitArr[2] = splitArr[2].substring(0, splitArr[2].length() - 2);
            }
            
            char[] charStr = splitArr[2].toCharArray();
            for (int j = 0; j < charStr.length; j++){
                if (Character.isUpperCase(charStr[j]) && j != 0){
                    printStr += " " + Character.toLowerCase(charStr[j]);
                }
                else
                    printStr += Character.toLowerCase(charStr[j]);
            }   
        }
        else if (splitArr[0].equals("C")){
            if (splitArr[1].equals("V") || splitArr[1].equals("M")){
                printStr += splitStr[0];
                i = 1; // start with lowerCase
            }
            else if (splitArr[1].equals("C"))
                i = 0; // start with upperCase
            else
                return;
                
            while (i < splitStr.length){
                char[] charStr = splitStr[i].toCharArray();
                charStr[0] = Character.toUpperCase(charStr[0]);
                printStr += new String(charStr);
                i++;                
            }

            
            if (splitArr[1].equals("M")){
                // Add () at the end
                printStr += "()";
            }
        }
        else
            return;
        
        System.out.println(printStr);
    }
}
