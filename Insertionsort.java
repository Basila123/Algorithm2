package com.bridgelabzOops;
import java.util.Arrays;
public class Insertionsort {
    public static void main(String[] args){
        insert();
    }
       public static void insert() {
            int lineNumber = 5;
            int i,j;
            String key;
            String[] inputArray = {"E","D","C","B","A","B"};
            System.out.println(Arrays.toString(inputArray));
            for (j = 1; j < lineNumber; j++) {
                key = inputArray[j];
                i = j - 1;
                while (i >= 0) {
                    if (key.compareTo(inputArray[i]) < 0) {
                        break;
                    }
                    inputArray[i + 1] = inputArray[i];
                    i--;
                }
                inputArray[i + 1] = key;
                System.out.println(Arrays.toString(inputArray));
            }
            System.out.println(Arrays.toString(inputArray));
        }
}
