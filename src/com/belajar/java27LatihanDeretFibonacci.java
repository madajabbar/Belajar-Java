package com.belajar;

import java.util.Scanner;

public class java27LatihanDeretFibonacci {
    public static void main(String[] args) {
        int f_n,f_n_1,f_n_2,n;
        Scanner masuk = new Scanner(System.in);
        System.out.print("Mengambil nilai fibonacci ke - : ");
        n= masuk.nextInt();
        f_n_2=0;
        f_n_1=1;
        f_n=1;
        for (int i=0;i<=n;i++){
            System.out.println("Nilai ke -"+i+" adalah "+f_n);
            f_n=f_n_1+f_n_2;
            f_n_2=f_n_1;
            f_n_1=f_n;
        }
    }
}
