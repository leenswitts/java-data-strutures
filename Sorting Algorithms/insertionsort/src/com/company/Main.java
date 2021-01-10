package com.company;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        for (int fistUnsortedIndex = 1; fistUnsortedIndex < intArray.length; fistUnsortedIndex++){

            int newElement = intArray[fistUnsortedIndex];

            int i;

            for (i = fistUnsortedIndex; i > 0 &&  intArray[ i - 1] > newElement; i--){
                intArray[i] = intArray[ i - 1];
            }
            intArray[i] = newElement;
        }

        for (int j : intArray) {
            System.out.println(j);
        }
    }
}
