package com.belajar;

public class java11OperatorLogika {
    public static void main(String[] args) {
        //AND, OR, XOR, NEGASI
        //BOOLEAN TERDIRI DARI DUA YAITU TRUE DAN FALSE
        //TRUE =1, FALSE =0
        //AND ITU PERKALIAN
        //OR ITU PENJUMLAHAN
        //XOR TERJADI APABILA SALAH SATU BERNILAI 1 ATAU BERBEDA MAKA DIA BERNILAI 1
        //JIKA KEDUANYA SAMA MAKA 0
        //*materi tsd,elektro,sistem mikro

        boolean a,b,c;


        //OR / atau (||)
        System.out.println("===== OR (||) =====");
        a=false;
        b=false;
        c=(a||b);
        System.out.println(a+ " || "+b+" = "+c);
        a=false;
        b=true;
        c=(a||b);
        System.out.println(a+ " || "+b+" = "+c);
        a=true;
        b=false;
        c=(a||b);
        System.out.println(a+ " || "+b+" = "+c);
        a=true;
        b=true;
        c=(a||b);
        System.out.println(a+ " || "+b+" = "+c);


        //AND (&&)
        System.out.println("===== AND (&&) =====");
        a=false;
        b=false;
        c=(a&&b);
        System.out.println(a+ " && "+b+" = "+c);
        a=false;
        b=true;
        c=(a&&b);
        System.out.println(a+ " && "+b+" = "+c);
        a=true;
        b=false;
        c=(a&&b);
        System.out.println(a+ " && "+b+" = "+c);
        a=true;
        b=true;
        c=(a&&b);
        System.out.println(a+ " && "+b+" = "+c);

        //XOR exclusive or (^)
        System.out.println("===== XOR (^) =====");
        a=false;
        b=false;
        c=(a^b);
        System.out.println(a+ " ^ "+b+" = "+c);
        a=false;
        b=true;
        c=(a^b);
        System.out.println(a+ " ^ "+b+" = "+c);
        a=true;
        b=false;
        c=(a^b);
        System.out.println(a+ " ^ "+b+" = "+c);
        a=true;
        b=true;
        c=(a^b);
        System.out.println(a+ " ^ "+b+" = "+c);

        //NOT atau negasi (!)

        System.out.println("==== NEGASI (!) ====");
        a=true;
        c= !a;
        System.out.println(a+ " --> = "+c);
        a= false;
        c= !a;
        System.out.println(a+ " --> = "+c);
    }
}
