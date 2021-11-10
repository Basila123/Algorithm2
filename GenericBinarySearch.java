package com.bridgelabzOops;

import java.util.ArrayList;

public class GenericBinarySearch<T> {
    private T[] a;

    public GenericBinarySearch(T[] words) {
        a = words;
    }

    public int search(Comparable<T> v) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            T midVal = a[mid];
            int result = v.compareTo(midVal);

            if (result < 0) {
                high = mid - 1;
            }

            else if (result > 0) {
                low = mid + 1;
            }

            else {
                return mid;
            }
        }

        return -1;
    }
}

class BinarySearchTester {
    public static void main(String[] args) {
        String[] words = {"Alpha", "Bravo", "Charlie", "Delta", "Echo",
                "Foxtrot", "Golf", "Hotel", "India", "Juliet", "Kilo", "Lima",
                "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo",
                "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "X-Ray",
                "Yankee", "Zulu"};
        GenericBinarySearch<String> searcher = new GenericBinarySearch<String>(words);
        System.out.println(searcher.search("November"));
       // System.out.println("Expected: 13");
        System.out.println(searcher.search("October"));
        //System.out.println("Expected: -1");
    }
}