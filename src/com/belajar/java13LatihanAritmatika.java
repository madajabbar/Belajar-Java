package com.belajar;

import java.util.Scanner;

public class java13LatihanAritmatika {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        //membuat perhitungan luas persegi panjang
        //luas = panjang * lebar
        System.out.print("Masukan Panjang : ");
        int panjang = userInput.nextInt();
        System.out.print("Masukan Lebar : ");
        int lebar = userInput.nextInt();

        int luas = panjang*lebar;
        System.out.printf("HASILNYA : %d * %d = %d \n",panjang,lebar,luas);

        //menghitung volumes
        //volume = panjang * lebar * tinggi
        System.out.print("Masukan Tinggi : ");
        int tinggi = userInput.nextInt();
        int volume = panjang*lebar*tinggi;
        System.out.printf("HASILNYA : %d * %d * %d = %d \n",panjang,lebar,tinggi,volume);
    }
}
