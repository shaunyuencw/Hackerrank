import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
      
    public Difference(int [] a){
        elements = a;
        maximumDifference = Integer.MIN_VALUE;
    }

	// Add your code here
    public void computeDifference(){
        int front;
        int temp;
        
        for (int i = 0; i < elements.length; i++){
            front = elements[i];
            for (int j = elements.length - 1; j > i; j--){
                temp = Math.abs(front - elements[j]);
                if (temp > maximumDifference)
                    maximumDifference = temp;
            }
        }

    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
