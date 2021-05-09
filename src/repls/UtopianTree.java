package repls;

public class UtopianTree {
    public static void main(String[] args) {
        int size = 0;
        int growth = 0;
        for (int year = 1; year <=3; year++) {
            growth=1;
            size++;
            System.out.println("year " + year + " - growth " + growth + " cm\ntree size: " + size+"cm");}
        for (int yearA = 4; yearA <=10; yearA++) {
            growth=2;
            size += 2;
            System.out.println("year " + yearA + " - growth " + growth + " cm\ntree size: " + size+"cm");
        }
    }
}