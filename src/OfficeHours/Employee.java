package OfficeHours;

public class Employee {
    public static void main(String[] args) {
        String firstName  = "Vladislav";
        String lastName = "Shekhovsev";
        String company = "Bethesda";
        int salary = 151_840;
        byte startDay = 10;
        byte startMonth =  3;
        short startYear = 2022;
        boolean fullTime = true;
        byte hourSalary = 73;
        int salaryWeak = hourSalary*40;
        long salaryYear = (salaryWeak *52);
        String jobTitle = "Developer";
        String address = "1370 Piccard Drive No-120 Rockville,\nMD 20850, United States.";
        String fullName = lastName+" "+lastName;
        System.out.println("**********EMPLOYEE CARD************");
        System.out.println("Name: "+fullName);
        System.out.println("Title :"+jobTitle);
        System.out.println("Full time status: "+fullTime);
        System.out.println("Valid since: "+startDay+".0"+startMonth+"."+startYear);
        System.out.println("Email; "+firstName+startDay+startMonth+startYear+company+".com");
        System.out.println("Hourly rate: "+hourSalary);
        System.out.println("Salary in 3 years: "+(salaryYear*3));
        System.out.println("***********************************");
//





    }
}
