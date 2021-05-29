package day48_constructors_static;

public class BassObjects {
    public static void main(String[] args) {
        Bass bus = new Bass();
        bus.driver= new Driver("Abbas");
        bus.engine = new Engine(455);
        System.out.println(bus.toString());
        Bass metrobus = new Bass();
        metrobus.driver= new Driver("Aziz");
        metrobus.engine= new Engine(15);
        System.out.println(metrobus.driver.getName());
    }
}
