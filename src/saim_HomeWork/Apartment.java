package saim_HomeWork;

import java.sql.SQLOutput;

public class Apartment {
    public static void main(String[] args) {
        String street = "2953 Marnat Rd,";
        String city = " Baltimore,";
        String state = " MD ,";
        Short zip = 21119;
        String ownerName = "Vladislav";
        byte numberOfUnits = 1;
        short apSize = 1000;
        int monthlyRent = 1_500;
        boolean washer = true;
        boolean drier = true;
        boolean allowPets = true;
        boolean pool = false;
        String lengthOfLease = "year";
        byte leaseYears = 1;
        byte residenceInBuilding = 4;
        long numberOfOwner = 443_334_7032L;
        boolean gasStationNear = true;
        byte numberOfFloors = 2;
        boolean basement = false;
        boolean airConditioning = true;
        byte numberOfParkingSpaces = 2;
        boolean wheelChairAccess = false;
        String numberOfReviewStars = "5 star review rating ";
        double rentafter3years = (monthlyRent-(monthlyRent*0.1));
        double monthllyrentafter6years=(monthlyRent-(monthlyRent*0.2));
        System.out.println("*************APARTMENT**FOR**RENT*************");
        System.out.println("Address: "+street+city+state+zip);
        System.out.println("Number of units: "+numberOfUnits);
        System.out.println("Size: "+apSize+"sf");
        System.out.println("Residence in building: "+residenceInBuilding);
        System.out.println("Lease: "+leaseYears+lengthOfLease);
        System.out.println("Washer :"+washer);
        System.out.println("Drier: "+drier);
        System.out.println("Pets allowed: "+allowPets);
        System.out.println("Air conditioner in apartment: "+airConditioning);
        System.out.println("Parking spaces: "+numberOfParkingSpaces);
        System.out.println("Gas station near: "+gasStationNear);
        System.out.println("Number of floor in the building: "+numberOfFloors);
        System.out.println("Wheelchair access: "+wheelChairAccess);
        System.out.println("Basement: "+basement);
        System.out.println("Pool: "+pool);
        System.out.println("Name of the owner: "+ownerName);
        System.out.println("Owner phone Number: "+numberOfOwner);
        System.out.println("Monthly rent: $"+monthlyRent);
        System.out.println("Monthly rent after three years: $"+rentafter3years);
        System.out.println("Monthly rent after six years: $"+monthllyrentafter6years);
        System.out.println("Number of review stars: "+numberOfReviewStars);
        System.out.println("**********************************************");


    }
}
