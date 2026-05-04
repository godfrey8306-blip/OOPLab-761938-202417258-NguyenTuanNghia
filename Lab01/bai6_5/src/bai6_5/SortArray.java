package bai6_5;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] my_array1 = new int[n];

        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            my_array1[i] = sc.nextInt();
        }

        Arrays.sort(my_array1);

        int sum = 0;
        for (int x : my_array1) {
            sum += x;
        }
        double average = (double) sum / n;

        System.out.println("Sorted array: " + Arrays.toString(my_array1));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}