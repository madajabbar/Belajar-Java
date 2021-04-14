package com.belajar;
import java.util.Arrays;
public class java39ArrayPassByReference {
    public static void main(String[] args) {
        int[] arrayAngka = {1,2,3,4,5};
        int[] arrayAngka2 =  new int[5];
        arrayAngka2=arrayAngka;
        System.out.println(Arrays.toString(arrayAngka));
        System.out.println(Arrays.toString(arrayAngka2));
    }
}
