import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        String binary = Integer.toBinaryString(n);
        
        int longestConsec = 1;
        int currentConsec = 0;
        char prevChar = binary.charAt(0);
        if (prevChar == '1')
            currentConsec = 1;
        
        for (int i = 1; i < binary.length(); i++){
            if (prevChar == binary.charAt(i) && binary.charAt(i) == '1'){
                currentConsec++;
            }
            else{
                if (currentConsec > longestConsec)
                    longestConsec = currentConsec;
                currentConsec = 1;
            }
            prevChar = binary.charAt(i);
        }
        
        if (currentConsec > longestConsec)
            longestConsec = currentConsec;
        
        System.out.println(longestConsec);
    }
}
