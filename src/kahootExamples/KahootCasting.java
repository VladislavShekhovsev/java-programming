package kahootExamples;

public class KahootCasting {
    public static void main(String[] args) {
        byte a =             100;

        short b=             a;

        byte c =    (byte)   b;
        int d =              c;
        long e =             d;
        byte f =       (byte)e;
        int g =              f;
        short h =     (short)g;
        System.out.println(h);

    }
}
