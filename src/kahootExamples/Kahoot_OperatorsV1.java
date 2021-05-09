package kahootExamples;

public class Kahoot_OperatorsV1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a++ + a-- + a * 10 + a + ++a;
        System.out.println("b = "+b);

        double c =1.5;
        double d = c++ +c*2 + c;
        System.out.println("d = "+d);

        int e =100;
        int f = e-10;
        int g = e-f;
        int h = g++ + e*10 + f + --e+ --f+g - (e%10)+ --f;
        System.out.println(h);
        int x = g++ + e*10 + f + --e+ --f+g +--f;
        System.out.println(100%10);
        System.out.println(h+"  "+x);
        int y =100;
        int z= --y+(y%10);
        System.out.println(z);
         int ab =5;
         int ac =ab-1;
         int ad = ab++ + --ac + ab;
        System.out.println(ad);



    }
}
