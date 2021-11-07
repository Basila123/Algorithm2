package com.bridgelabzOops;
import java.util.Arrays;
public class PerrmutationSort {

        // Utility function to swap the characters in a character array
        private static void swap(char[] arr, int i, int j)
        {
            char c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
        }

        // Utility function to reverse a char array between specified indices
        private static void reverse(char[] arr, int i, int j)
        {
            // do till two endpoints intersect
            while (i < j) {
                swap(arr, i++, j--);
            }
        }

        // Iterative function to find permutations of a string in Java
        public static void permutations(String str)
        {
            // base case
            if (str == null || str.length() == 0) {
                return;
            }

            // base case
            if (str.length() == 1) {
                System.out.print(str);
                return;
            }

            // sort the string in a natural order
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            // get length of the string
            int n = str.length();

            while (true)
            {
                // print the current permutation
                System.out.print(String.valueOf(chars) + " ");

                int i = n - 1;
                while (chars[i-1] >= chars[i])
                {
                    if (--i == 0) {
                        return;
                    }
                }

                // find the highest index `j` to the right of index `i` such that
                // `chars[j] > chars[i-1]` (`chars[i…n-1]` is sorted in reverse order)

                int j = n - 1;
                while (j > i && chars[j] <= chars[i-1]) {
                    j--;
                }

                // swap character at index `i-1` with index `j`
                swap(chars, i - 1, j);

                // reverse substring `chars[i…n-1]`
                reverse (chars, i, n - 1);
            }
        }

        public static void main(String[] args)
        {
            String s = "ABC";
            permutations(s);
        }
    }
