package com.belajar;
import java.util.*;
public class java21LatihanKalkulatorSederhana {
    public static void main(String[] args) {
        // a operator b
        Scanner masuk = new Scanner(System.in);
        float a,b,hasil;
        char operator;

        System.out.print("Nilai a = ");
        a= masuk.nextFloat();
        System.out.print("Operator = ");
        operator = masuk.next().charAt(0);
        System.out.print("Nilai b = ");
        b= masuk.nextFloat();
        System.out.println("Input user : " + a + " " + operator + " " + b );

        if (operator == '+'){
            //penjumlahan
            hasil = a+b;
            System.out.println("HASIL = "+hasil);
        }
        else if (operator == '-'){
            //pengurangan
            hasil = a-b;
            System.out.println("HASIL = "+hasil);
        }
        else if (operator == '*'){
            //perkalian
            hasil = a*b;
            System.out.println("HASIL = "+hasil);
        }
        else if (operator == '/'){
            //pembagian
            if (b==0){
                System.out.println("Pembagi nol menghasilkan tak hingga");
            }
            else {
                hasil = a / b;
                System.out.println("HASIL = " + hasil);
            }
        }
        else {
            System.out.println("Operator tidak ditemukan");
        }
    }
}
