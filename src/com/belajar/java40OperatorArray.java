package com.belajar;
import java.util.Arrays;

public class java40OperatorArray {
    public static void main(String[] args) {
        int [] arrayAngka = {1,2,3,4,5};
        //merubah array menjadi string
        System.out.println("\n merubah array menjadi string \n ==============");
        printArray(arrayAngka);

        //mengcopy array menjadi string
        System.out.println("\n mengcopy array \n ==============");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka);
        printArray(arrayAngka2);
        System.out.println("mengcopy dengan loop");
        for (int i = 0; i < arrayAngka2.length; i++) {
            arrayAngka2[i]=arrayAngka[i];
        }
        printArray(arrayAngka);
        printArray(arrayAngka2);

        System.out.println("mengcopy dengan copyOf");
        int[]arrayAngka3 = Arrays.copyOf(arrayAngka, 2);
        printArray(arrayAngka);
        printArray(arrayAngka2);
        printArray(arrayAngka3);

        System.out.println("mengcopy dengan copyOfRange");
        int[]arrayAngka4 = Arrays.copyOfRange(arrayAngka, 2, 5);
        printArray(arrayAngka);
        printArray(arrayAngka2);
        printArray(arrayAngka3);
        printArray(arrayAngka4);

        //fill array
        System.out.println("fill Array");
        int[]arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,5);
        printArray(arrayAngka5);

        //komparasi array
        System.out.println("komparasi array");
        int[]arrayAngka6 = {1,2,3,4,4};
        int[]arrayAngka7 = {1,2,3,4,5};
        System.out.println();
        if (Arrays.equals(arrayAngka6,arrayAngka7)){
            System.out.println("Array ini sama");
        }
        else {
            System.out.println("Array ini beda");
        }
        System.out.println("\ncek array mana yang lebih besar");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

        System.out.println("\n cek index array yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));
        //sort Array
        int[]arrayAngka8 = {1,2,31,3,12,34,5,6,7,78};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);


        //search Array
        System.out.println("search dengan array");
        int cari = 3;
        int index = Arrays.binarySearch(arrayAngka8,cari);
        System.out.println("angka "+cari+" ada di index "+index);

        //sort kebalik

    }
    private static void printArray (int[]dataArray){
        System.out.println("Angka = "+ Arrays.toString(dataArray));
    }
}
