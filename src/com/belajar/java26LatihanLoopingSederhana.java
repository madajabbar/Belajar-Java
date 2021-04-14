package com.belajar;

import java.util.Scanner;

public class java26LatihanLoopingSederhana {
    public static void main(String[] args) {
        int nilaiAwal,nilaiAkhir,total;

        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan Nilai awal : ");
        nilaiAwal = masuk.nextInt();
        System.out.print("Masukan Nilai akhir : " );
        nilaiAkhir = masuk.nextInt();
        total=0;
        while (nilaiAwal<=nilaiAkhir){
            total=total+nilaiAwal;
            System.out.println("ditambah "+nilaiAwal+" menjadi "+total);
            nilaiAwal++;
        }
    }
}
