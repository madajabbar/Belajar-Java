package com.belajar;

public class java31FungsiVoid {
    public static void main(String[] args) {
        //void adalah hampa/kosong
        //void adalah tipe data kosong
        System.out.println(simpel());
        fungsiVoid("apapun");
        selamatPagi("mada");
        selamatPagi("jabbar");
        selamatPagi("palapa");
        selamatPagi("hakim");
    }
    //fungsi dengan kembalian
    static void fungsiVoid(String input){
        System.out.println(input);
    }
    static void selamatPagi(String nama){
        System.out.println("Selamat Pagi "+nama);
    }

    //fungsi atau method dengan kembalian
    //sehingga menggunakan return untuk
    //mengembalikan nilainya
    static float simpel(){
        return 10.0f;
    }
}
