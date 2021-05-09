package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = "+(!true));
        System.out.println("!false = "+(!true));
        int age =2;
        if (!(age<7)){
            System.out.println("use seat belts");
        }else{
            System.out.println("do not use seat belt");
        }
        boolean isAllowedToSmoke = true;
        if(!isAllowedToSmoke){
            System.out.println("Smoking is not allowed here");

        }else{
            System.out.println("allowed to smoke here");
        }
        boolean isAffortble = true;
        if(!(isAffortble)){
            System.out.println("by it");
        }
           String model = "tesla";
        if(!model.equals("tesla")){
            System.out.println("not interested in "+model);
        }
        String secretPassword ="1loveLera";

                if(!secretPassword.equals("1loveLera")){
                    System.out.println("Wrong password");
                    System.out.println("you typed "+secretPassword);
                }else{
                    System.out.println("welcome");
                }
    }
}
