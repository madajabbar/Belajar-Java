package com.belajar;

public class java28BreakContinueReturn {
    public static void main(String[] args) {
        int a=0;
        while (true){
            a++;
            if (a==10){
                break;
            }
            else if (a==5){
                continue;
            }
            System.out.println("looping ke - "+a);
        }
    }
}
