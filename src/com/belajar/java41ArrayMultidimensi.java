package com.belajar;
import java.util.Arrays;
public class java41ArrayMultidimensi {
    public static void main(String[] args) {
        int[][] array2D = new int[5][4];
        printArray(array2D);
    }
    public static void printArray(int[][]dataArray){
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}
