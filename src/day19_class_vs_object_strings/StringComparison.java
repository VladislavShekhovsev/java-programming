package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        // equals() method - CASE SENSITIVE
        System.out.println(city.equals("Chicago"));//true
        System.out.println(city.equals("chicago"));//false
        System.out.println(city.equals("Chicago "));//false because space its also character (space in the end)
        //EQUALSIGNORECASE() method - case insensitive comparison
        System.out.println(city.equalsIgnoreCase("CHICAGO"));//true its ignore the upper case
        System.out.println(city.equalsIgnoreCase("Chicago")); //true
        System.out.println(city.equalsIgnoreCase("chicago"));// true
        System.out.println(city.equalsIgnoreCase("chi cago"));// false  because of space character
        System.out.println(city.equalsIgnoreCase("chiicago"));// false another character i


    }
}
