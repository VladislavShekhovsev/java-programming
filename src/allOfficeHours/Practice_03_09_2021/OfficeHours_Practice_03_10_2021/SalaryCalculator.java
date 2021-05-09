package allOfficeHours.Practice_03_09_2021.OfficeHours_Practice_03_10_2021;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 10;
        int weeklyHours = 40;
        int numberOfWeeks = 52;
        boolean hourlyRateIsValid = hourlyRate>0;
        boolean weeklyHoursAreValid = weeklyHours>0&&weeklyHours<=65;
        boolean numberOfWeeksAreValid = numberOfWeeks>0&&numberOfWeeks<=52;
        if (hourlyRateIsValid){
            // check other conditions
            if (weeklyHoursAreValid){
                if(numberOfWeeksAreValid){
                    System.out.println(hourlyRate+weeklyHours+numberOfWeeks);

                }else{
                    System.out.println("number of weeks cannot be less then one, and more then 52");
                }

            }
            System.out.println("number of hours cannot be zero ,or more then 65");
        }else{
            System.out.println("hourly rate cannot be Negative or zero");
        }
    }//
}
