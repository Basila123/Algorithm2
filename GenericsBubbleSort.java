package com.bridgelabzOops;

import java.util.Arrays;

public class GenericsBubbleSort<T extends Comparable<? super T>> {
    T[] array;
    GenericsBubbleSort(T[] array){
        this.array = array;
    }

    private T[] bubbleSort(){
        for(int i = array.length; i > 1; i--){
            for(int j = 0; j < i - 1; j++){
                //if greater swap elements
                if(array[j].compareTo(array[j+1]) > 0){
                    swapElements(j, array);
                }
            }
        }
        return array;
    }
    private void swapElements(int index, T[] arr){
        T temp = arr[index];
        arr[index] = arr[index+1];
        arr[index+1] = temp;
    }
    public static void main(String[] args) {
        Integer[] intArr = {47, 85, 62, 34, 7, 10, 92, 106, 2, 54};
        GenericsBubbleSort<Integer> bsg1 = new GenericsBubbleSort<Integer>(intArr);
        Integer[] sa1 = bsg1.bubbleSort();
        System.out.println("Sorted array- " + Arrays.toString(sa1));

        String[] strArr = {"Earl", "Robert", "Asha", "Arthur"};
        GenericsBubbleSort<String> bsg2 = new GenericsBubbleSort<>(strArr);
        String[] sa2 = bsg2.bubbleSort();
        System.out.println("Sorted array- " + Arrays.toString(sa2));

        Double[] arrayOfDoubles = {0.35, 0.02, 0.36, 0.82, 0.27, 0.49, 0.41, 0.17, 0.30, 0.89, 0.37, 0.66, 0.82, 0.17, 0.20, 0.96, 0.18, 0.25, 0.37, 0.52};
        GenericsBubbleSort<Double> doubleSorter   = new GenericsBubbleSort<>(arrayOfDoubles);
        doubleSorter.bubbleSort();
        System.out.println(java.util.Arrays.toString(arrayOfDoubles));
    }
}