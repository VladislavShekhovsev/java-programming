package day06_arithmetic_operators;

public class MoreMathOprerators {
    public static void main(String [] args){
        int toyotas = 431;
        int hondas = 233;
        int vw =2;
        int tesla = 20;
        int nissan = 1;
        int bnw = 155;
        int totalCarsInParking = toyotas+hondas+vw+tesla+nissan+bnw;
        System.out.println("there are "+totalCarsInParking+" cars in the parking lots");
        String pizza = "Hawaiian";
        int slices =8;
        int people =4;
        System.out.println("There are "+slices/people+" slices per person");
        System.out.println("We ordered "+ pizza+" pizza with " +slices+" slices and we eat "+slices/people+" slices per person");


    }
}
