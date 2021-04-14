package com.belajar;

public class java23WhileLoop {
    public static void main(String[] args) {
        int a = 1;
        boolean kondisi = true;
        System.out.println("Awal Program");
        while (kondisi){
            System.out.println("Loop ke-"+a);

            if (a==10){
                kondisi=false;
            }
            a++;
        }
    }
}
