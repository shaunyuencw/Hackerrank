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

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        int largestSum = Integer.MIN_VALUE;
        int sum;
        for(int i = 0; i < arr.size() - 2; i++){
            for (int j = 0; j < arr.get(i).size() - 2; j++){
                sum = 0;
                sum += arr.get(i).get(j);
                sum += arr.get(i).get(j+1);
                sum += arr.get(i).get(j+2);
                sum += arr.get(i+1).get(j+1);
                sum += arr.get(i+2).get(j);
                sum += arr.get(i+2).get(j+1);
                sum += arr.get(i+2).get(j+2);
                if (sum > largestSum)
                    largestSum = sum;
            }
        }
        
        System.out.println(largestSum);
    }
}
