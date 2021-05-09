package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word="i will became SDET later this year"; String word2 ="UlIBOK TEBE DED MAKAR";
        for(int i=0;i<word.length();i++) {
            System.out.println(i+"  "+word.charAt(i));
            // Vlad = .length(4) because 4 characters,
        }   // Vlad = charAt(3) because ots starts from 0 not from 1
            // Vlad = Substring also 3 because  substring works by index
            // Vlad = indexOF(V)= 0, indexOf(l)=1,indexOF(a)= 2, indexOf(d)=3
        for(int a =word2.length()-1; a>=0;a--){
            System.out.print(word2.charAt(a));
        }

    }
}
