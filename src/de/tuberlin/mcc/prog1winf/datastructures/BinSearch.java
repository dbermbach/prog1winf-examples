package de.tuberlin.mcc.prog1winf.datastructures;

import java.util.Arrays;

public class BinSearch {

    public static int binSearchIterative(int[] arr, int val) {
        System.out.println("Searching for " + val + " in " + Arrays.toString(arr));
        int left = 0, right = arr.length - 1, middle = (right - left) / 2 + left;
        while (true) {
            System.out.println("Checking index position " + middle);
            if (arr[middle] == val) return middle;
            if (arr[middle] > val) {
                System.out.print(arr[middle] + " is greater than " + val);
                right = middle - 1;
                middle = (right - left) / 2 + left;
                System.out.println(", now checking with left=" + left + ", middle=" + middle + ", right=" + right);
            } else {
                System.out.print(arr[middle] + " is smaller than " + val);
                left = middle + 1;
                middle = (right - left) / 2 + left;
                System.out.println(", now checking with left=" + left + ", middle=" + middle + ", right=" + right);
            }
        }
    }

    public static int binSearchRecursive(int[] arr, int val) {
        return binSearchRecursive(arr, val, 0,arr.length-1);
    }

    private static int binSearchRecursive(int[] arr, int val, int left, int right) {
        int middle = (right - left) / 2 + left;
        System.out.println("Checking with left=" + left + ", middle=" + middle + ", right=" + right);
        if (arr[middle] == val) return middle;
        if (arr[middle] > val) {
            System.out.println(arr[middle] + " is greater than " + val);
            return binSearchRecursive(arr, val, left, middle - 1);
        } else {
            System.out.println(arr[middle] + " is smaller than " + val);
            return binSearchRecursive(arr, val, middle + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int val = 6;
        System.out.println("Found " + val + " at position " + binSearchIterative(arr, val));
        System.out.println("Found " + val + " at position " + binSearchRecursive(arr, val));
    }

}
