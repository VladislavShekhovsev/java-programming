package allOfficeHours.Practice_03_09_2021.OfficeHours_Practice_03_10_2021;

public class CharIndex {
    public static void main(String[] args) {
        //.length()-1 always last number
        String s ="java";
     //   System.out.println(s.charAt()s.length()); always give StringIndexOutOFBounds error
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        //charAt take number and give char
        // indexOf always take the character and return number (index)
        // they are opposite of each other.
        String v = "vladislav";
        System.out.println(v.indexOf("v"));
        System.out.println(v.indexOf("v")>=0? "contains":"Not contains");
        // u can chain string to boolean but not opposite
        //here invalid would not stop ur program it will just give u -1
    }
}
