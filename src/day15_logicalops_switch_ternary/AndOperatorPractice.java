package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
            boolean onSale = true;
            boolean freeShipping =true;
            String itemName="Wooden spoon";
            if (onSale&&freeShipping&&itemName.equals("Wooden spoon")){
                System.out.println("Add yo card "+itemName);

            }else {
                System.out.println("Continue shopping for good deals on "+itemName);
            }
    }
}
