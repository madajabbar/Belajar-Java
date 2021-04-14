package com.belajar;

public class java12OperatorBitwise {
    public static void main(String[] args) {
        //8bit = 1 byte
        //cek konversi desimal ke bit

        byte a=3;
        byte b,c;
        String a_bits,b_bits,c_bits;
        // Operator SHIFT LEFT
        System.out.println("===== SHIFT LEFT");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits,a);
        b=(byte)(a<<3);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits,b);

        // operator SHIFT RIGHT
        System.out.println("===== SHIFT RIGHT");
        a= 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits,a);
        b=(byte)(a>>2);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits,b);

        //operator bitwise OR
        System.out.println("===== BITWISE OR");
        a= 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits,a);
        b=12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("--------------OR");
        c = (byte) (a|b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bits,c);

        //operator bitwise AND
        System.out.println("===== BITWISE OR");
        a= 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits,a);
        b=12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("--------------AND");
        c = (byte) (a&b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bits,c);

        //operator bitwise XOR
        System.out.println("===== BITWISE OR");
        a= 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits,a);
        b=12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("--------------XOR");
        c = (byte) (a^b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bits,c);

        //operator bitwise NOT
        System.out.println("===== BITWISE NOT");
        a= 24;
        b= (byte) (~a);
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits,a);
        System.out.println("==============NOT");
        b_bits = String.format("%8s",Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d \n",b_bits,b);
    }
}
