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

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        char [] sCharArr = s.toCharArray();
        String APM = new String(sCharArr, 8, 2);
        int hr = Integer.parseInt(new String(sCharArr, 0, 2));
        
        if (APM.equals("PM") && hr != 12){
            return hr + 12 + new String(sCharArr,2,6);
        }
        else if (APM.equals("AM") && hr == 12){
            return "00" + new String(sCharArr,2,6);
        }
        else{
            return new String(sCharArr, 0, 8);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
