package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(5));
        System.out.println(getDayName(3));
        System.out.println(getDayName(10));
        for (int i = 1; i <9 ; i++) {
            System.out.println(i+" = "+getDayName(i));

        }
        String today =getDayName(6);
        System.out.println("today = " + today);
        String someDay = getDayName(0);
        if(someDay==null)// only with == for null
        {
            System.out.println("someday is null, for invalid day");
        }
    }

    public static String getDayName(int day) {
        switch (day) {
            case 1:
                return "Monday";
                //break; would not work, because return already exit the method. break is unreachable.
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:

                return null;
        }

    }
}