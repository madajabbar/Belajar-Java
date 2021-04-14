package com.belajar;
import java.util.*;
public class java36LatihanFungsiMenghitungMenggambar {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan Input Panjang = ");
        int inputPanjang = masuk.nextInt();
        System.out.print("Masukan Input Lebar = ");
        int inputLebar = masuk.nextInt();
        gambar(inputPanjang,inputLebar);
    }
    public static void gambar(int panjang, int lebar){
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
