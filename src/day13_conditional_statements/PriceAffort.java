package day13_conditional_statements;

public class PriceAffort {
    public static void main(String[] args) {
        double price = 130.44;
        boolean isAffordable = price <= 200;
        if (isAffordable) {
            System.out.println("i can buy it");
        } else {
            System.out.println("i cant buy it");
        }
        Boolean isRemotejob = false;
        if (isRemotejob){
            System.out.println("agree");
        }else{
            System.out.println("bye bye");
        }

    }
}

