package allOfficeHours.Practice_03_09_2021.OfficeHours_Practice_03_10_2021;

public class OperatorExample {
    public static void main(String[] args) {
        int a = 3, b = 2;
        long c = (long) ((a-- + b) * 2 / 3 % 2);
        //(3+2)*2/3%2;
        //5*2/3%2;
        // 10/3%2
        //3%2
        //           1
        //a=2(only now post decremented) b=2, c=1
        System.out.println("c = "+c);
    }
}