package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        byte numberOfBedrooms;
        int startingPrice=1;
        switch(startingPrice){
            case 0: startingPrice=1454;numberOfBedrooms=0;
                System.out.println("studio apartment selected price; "+startingPrice);
                break;
            case 1: startingPrice=1725; numberOfBedrooms=1;
                System.out.println("studio apartment selected price: "+startingPrice);
                break;
            case 2: startingPrice=2899;numberOfBedrooms=2;
                System.out.println("studio apartment selected price: "+startingPrice);
                break;
            default:
                System.out.println("invalid command");
          // return; exit main method


        }

    }
}
