import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;


public class Solution {
    public static int MaxElementIndex(int[] input) {
        int result = 0;
        for (int i = 0; i < input.length; i++) if (input[i] > input[result]) result = i;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + "th element");
            input[i] = sc.nextInt();
        }
        int result = MaxElementIndex(input);
        System.out.println("The max value is " + input[result]);
        System.out.println("The max value index is " + result);
        sc.close();
    }
}