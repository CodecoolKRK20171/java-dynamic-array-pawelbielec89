package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {
    private int[] dynamicArray;
    private int pointer = -1;

    public DynamicIntArray(){
        dynamicArray = new int[10];
    }
    public DynamicIntArray(int size){
        dynamicArray = new int[size];
    }

    public void add(int record){
        if (pointer == dynamicArray.length -1){
            extendSize();
        }
        pointer++;
        dynamicArray[pointer] = record;
    }

    public void remove(int index){
        for (int i = index; i < pointer; i++){
            dynamicArray[index] = dynamicArray[index+1];
        }
        pointer--;
    }

    private void extendSize(){
        int arrayLength = dynamicArray.length;
        arrayLength = arrayLength * 2;
        int[] extendedArray = new int[arrayLength];
        copyRecords(extendedArray);
    }

    private void copyRecords(int[] newRecords){
        for (int i=0 ; i < dynamicArray.length; i++){
            newRecords[i] = dynamicArray[i];
        }
    }
}
