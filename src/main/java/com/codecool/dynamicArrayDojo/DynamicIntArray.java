package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {
    private int[] dynamicArray;
    public void DinamicIntArray(){
        dynamicArray = new int[10];
    }

    private void extendSize(){
        int arrayLength = dynamicArray.length;
        arrayLength = arrayLength * 2;
        int[] extendedArray = new int[arrayLength];

    }
}
