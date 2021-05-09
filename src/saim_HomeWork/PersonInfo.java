package saim_HomeWork;

public class PersonInfo {
    public static void main(String[] args) {


        String name = "Vladislav", fullBirthDate, favoriteQuote;
        byte age = 32;
        char gender = 'M';
        boolean student = true;
        short numberOfSiblings= 5;
        long favoriteNumber = 13457;
        int numberOfSeasons = 4, year = 1988;
        double birthDate = 10.06;
        fullBirthDate = "" + birthDate + "." + year;
//        Assignment of data
        System.out.println("NAme: "+name);
        System.out.println("Age "+age);
        System.out.println(fullBirthDate);
        // add "." to make contamination instead of math
    }
}