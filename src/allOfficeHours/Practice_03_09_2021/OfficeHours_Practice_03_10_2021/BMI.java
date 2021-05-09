package allOfficeHours.Practice_03_09_2021.OfficeHours_Practice_03_10_2021;

public class BMI {
    public static void main(String[] args) {
        double mass = 100.0;
        double height = 1.88;
        double bmi = mass / (height * height);
        if (bmi > 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight");

        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Over weight");
        } else {
            System.out.println("Obese");
        }
    }
}
