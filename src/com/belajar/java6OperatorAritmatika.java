package com.belajar;

public class java6OperatorAritmatika {
    public static void main(String[] args) {
        //operator aritmatika
        int variabel1 = 4;
        int variabel2 = 5;
        int hasil;
        //1. penjumlahan
        System.out.println("Hasil Penjumlahan = "+(hasil=variabel1+variabel2));
        //2. pengurangan
        System.out.println("Hasil Pengurangan = "+(hasil=variabel1-variabel2));
        //3. perkalian
        System.out.println("Hasil Perkalian = "+(hasil=variabel1*variabel2));
        //4. pembagian
        System.out.println("Hasil Pembagian = "+(hasil=variabel1/variabel2));
        //5. modulus
        System.out.println("Hasil Modulus = "+(hasil=variabel1%variabel2));

        //cara lain untuk print
        hasil=variabel1+variabel2;
        System.out.printf("%d + %d = %d",variabel1,variabel2,hasil);
    }
}
