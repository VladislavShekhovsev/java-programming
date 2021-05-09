package allOfficeHours.Practice_03_09_2021.OfficeHours_Practice_03_10_2021;

public class Hgroup {
    public static void main(String[] args) {
        int age = 10;
        if (age > 0 && age < 120) {
            if(age<+2){
                System.out.println("infant");

            }else if(age>3&&age<=5){
                System.out.println("toddler");
            }


        } else {
            System.out.println("invalid age");
        }
    }
}