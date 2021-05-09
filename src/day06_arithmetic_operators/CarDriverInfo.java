package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String [] args){
        String carModel = "Lexus";
        String driverName= "Vladislav";
        String licenceNum = "S-212-371833";
        short speed = 100;
        char licenceType= 'c';
        boolean auto = true;
        System.out.println("Car model\t\t\t"+carModel);
        System.out.println("Driver name\t\t\t"+driverName);
        System.out.println("Licence number\t\t"+licenceNum);
        System.out.println("Speed\t\t\t\t"+speed);
        System.out.println("Licence type:\t\t"+'c');
        System.out.println("type of car\t\t\t"+auto);
        System.out.println(driverName+" is driving "+carModel);
        System.out.println(driverName+" is driving "+speed+" mph");
        System.out.println(licenceType+" "+auto);
        System.out.println(5+10);
//        num +num is good
//        string plus string is good
//        string plus boolean or char will not work unless u put " " in middle to separate

    }
}
