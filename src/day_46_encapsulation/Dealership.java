package day_46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 =new Car();
        // car1.model= "Nissan Almera" Error its private variable, we cant call it
        car1.setModel("Nissan Almera");
        System.out.println("car1 model = "+car1.getModel());
        car1.setYear(2020);
        System.out.println("car1 year = "+car1.getYear());
        car1.setMileage(99_000);
        System.out.println("car1 mileage ="+car1.getMileage());
        System.out.println(car1.toString());
        System.out.println(car1);
    }
}
