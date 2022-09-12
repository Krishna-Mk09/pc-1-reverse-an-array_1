package com.jap;

public class ReverseArrayDemo {
    public static void main(String[] args) {
        //Declare and initialize values of an array.
        int[] array = {23, 34, 43, 56, 67, 78, 43, 35};
        //Create an object of the class ReverseArrayDemo.
        ReverseArrayDemo reverseArrayDemo = new ReverseArrayDemo();
        //Call the method getReverseArray and pass the array as parameter
        int[] reverse = reverseArrayDemo.getReverseArray(array);
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }
    }
    //Write the logic to reverse the given array inside the below
    // method and return the reverse array.

    /**
     * It reverses the array.
     *
     * @param array the array to be reversed
     * @return The reverse of the array.
     */
    public int[] getReverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            for (int j = 0; j < array.length - index; j++) {
                reverseArray[j] = array[index];
            }
        }
        return reverseArray;
    }
}
