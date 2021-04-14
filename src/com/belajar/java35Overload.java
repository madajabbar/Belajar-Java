package com.belajar;

public class java35Overload {
    public static void main(String[] args) {
        //intinya method yang berbeda argument
        //contohnya
        System.out.println(a(2));
        System.out.println(a(3.3));
        //wajib ada double a kalo tidak error
    }
    static int a(int a){
        return a;
    }
    static double a(double a){
        return a;
    }
}
