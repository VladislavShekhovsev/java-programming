package day53_inheritance.tesla;

public class CarObjects {
    public static void main(String[] args) {


        ElectricCar ec1 = new ElectricCar("Tesla", "Model Y", 48190.0, 2021, 326);
        ec1.drive(50);
        System.out.println(ec1);
        System.out.println(ec1.getMake());
        System.out.println("ec1 make = " + ec1.getMake());
        System.out.println("ec1 model = " + ec1.getModel());
        System.out.println("ec1 price = " + ec1.getPrice());
        System.out.println("ec1 year = " + ec1.getYear());
        System.out.println("ec1 range = " + ec1.getRange());
        if (ec1.getPrice() > 10000) {
            System.out.println(ec1.getMake() + " - " + ec1.getModel() + " is out of my budget");
        } else {
            System.out.println("purchasing " + ec1.toString());
        }
        System.out.println("Count of electric cars : " + ElectricCar.getCount());


        ElectricCar ec2 = new ElectricCar("Tesla", "CyberTruck", 59900, 2022, 300);
        System.out.println(ec2.toString());
        System.out.println("Count = "+ElectricCar.getCount());//call static method using classname
        System.out.println("Count = "+ec2.getCount());//call static method using object

        Roadster roadster = new Roadster("Roadster",200000,2022,620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount());// static method also inherited

        ModelX modelX = new ModelX("ModelX", 45000,2022,450);
        System.out.println(modelX.toString());
        modelX.drive(350);
        modelX.drive(150);
        System.out.println("range remaining = "+modelX.getRange());
        System.out.println("Total electric cars count "+ElectricCar.getCount());

    }
}
