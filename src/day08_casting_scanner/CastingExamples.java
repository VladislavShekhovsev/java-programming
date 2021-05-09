package day08_casting_scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class CastingExamples {
    public static void main(String[] args) {
//        bite->short->int->long
        byte num1 = 50;
        short num2 = num1;
        int num3 = num1;
        int num4 = 1000;
        long num5 = num4;
        float num7 = 124.4F;
        double mun8 = num7;
        double num9 = num3;
        System.out.println(num9);// added zero
        int num10 = 55;
        byte num11= (byte)num10;
        short num12 = (short)num10;
        System.out.println(num12);
        double num14 = 55.3;
        float num15 = (float)num14;
        System.out.println(num15);
        double num16 = 13457.7;
                int num17= (int)num16;
        System.out.println(num17);
        int num18 = 300;
        byte num19 = (byte)num18;
        System.out.println(num19);
        //System.out.println(); //sout shortcut
        char letter='V';
        int numLetter = letter;
        System.out.println(numLetter);
    }
}
