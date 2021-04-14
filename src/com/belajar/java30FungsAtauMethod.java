package com.belajar;

public class java30FungsAtauMethod {
    public static void main(String[] args) {
        int y,x;
        x=5;
        y=hitung(x);
        System.out.println("x = "+x+", y = "+y);

        x=8;
        y=hitung(x);
        System.out.println("x = "+x+", y = "+y);

        x=10;
        y=hitung(x);
        System.out.println("x = "+x+", y = "+y);
    }
        static int hitung(int input){
        int hasil;
        hasil = input * input;
        return hasil;
        }
}
