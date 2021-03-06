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
        if (pointer >= dynamicArray.length -1){
            extendSize();
        }
        pointer++;
        dynamicArray[pointer] = record;
    }

    public void remove(int index) {
        if (index < 0 || index > pointer){
            throw new ArrayIndexOutOfBoundsException("Wrong index to remove.");
        }

        for (int i = index; i < pointer; i++){
            dynamicArray[i] = dynamicArray[i+1];
        }
        pointer--;
    }

    public void insert(int index, int value) {
        if (index > pointer) {
            add(value);
        } else {
            if (pointer >= dynamicArray.length - 1) {
                extendSize();
            }

            for (int i = pointer+1 ; i > index; i--) {
                dynamicArray[i] = dynamicArray[i-1];

            }
            dynamicArray[index] = value;
            pointer++;
        }
    }

    public String toString(){
        if (pointer>-1) {
            StringBuilder recordsToString = new StringBuilder();

            for (int i = 0; i < pointer + 1 ; i++){
                recordsToString.append( " " + dynamicArray[i]);
            }
            return recordsToString.toString();
        }
        else {
            return "";
        }
    }

    private void extendSize(){
        int arrayLength = dynamicArray.length;
        arrayLength = arrayLength * 2;
        int[] extendedArray = new int[arrayLength];
        dynamicArray = copyRecords(extendedArray);
    }

    private int[] copyRecords(int[] newRecords){
        for (int i=0 ; i < dynamicArray.length; i++){
            newRecords[i] = dynamicArray[i];
        }
        return newRecords;
    }

}
