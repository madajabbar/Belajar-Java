package com.belajar;

import java.util.Scanner;

public class java33FungsiRekursif {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan Nilai : ");
        int nilai = masuk.nextInt();
        System.out.println("anda memasukan nilai "+nilai);

        print(nilai);
        int jumlah =jumlahNilai(nilai);
        System.out.println("Jumlah = "+jumlah);
        int factorial =factorial(nilai);
        System.out.println("Factorial = "+factorial);
    }
    static int jumlahNilai(int parameter){
        System.out.println("parameter = "+parameter);
        if (parameter == 0){
            return parameter;
        }
        return parameter + jumlahNilai(parameter-1);
    }
    static int factorial(int parameter){
        System.out.println("parameter = "+parameter);
        if (parameter == 1){
            return parameter;
        }
        return parameter * factorial(parameter-1);
    }



    public static void print(int parameter){
        System.out.println("nilai = "+parameter);
        if (parameter==0){
        return;}
        parameter--;
        print(parameter);
    }
}
