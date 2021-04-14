package com.belajar;
import java.util.*;
public class java20TernaryOperator {
    public static void main(String[] args) {
        //ternary operator
        //variabel x=ekspresi ? statement true : statement false
        //ini adalah ternary operator, hal ini lebih mudah jika hanya ada 2 statement

        int input,x;
        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukan Nilai : ");
        input=masuk.nextInt();

        x= (input==10) ? (input*input):(input/2);
        System.out.println("Hasilnya : "+x);
    }
}
