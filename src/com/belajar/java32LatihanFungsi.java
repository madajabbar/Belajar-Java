package com.belajar;

import java.util.Scanner;

public class java32LatihanFungsi {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        System.out.print("Panjang : ");
        int panjang = masuk.nextInt();
        System.out.print("Lebar : ");
        int lebar = masuk.nextInt();
        gambar(panjang,lebar);
        tampilHasil(panjang,lebar);
    }
    static void gambar(int panjang, int lebar){
        for (int i = 0; i<lebar;i++){
            for (int j = 0; j<panjang;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    static int luas (int inputPanjang, int inputLebar){
        int hasil = inputPanjang*inputLebar;
        return hasil;
    }
    static int keliling (int inputPanjang, int inputLebar){
        int hasil = (inputPanjang*inputLebar)*2;
        return hasil;
    }
    static void tampilHasil (int inputPanjang, int inputLebar){
        System.out.println("Luas : "+luas(inputPanjang,inputLebar));
        System.out.println("Keliling : "+keliling(inputPanjang,inputLebar));
    }
}
