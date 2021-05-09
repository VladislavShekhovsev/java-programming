package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Maryland";
        double salary = 120_000;
        boolean isRemote = true;
        boolean benefits = true;
        if(location.equals("Maryland")&&salary>=120_000&&isRemote&&benefits){
            System.out.println("I take this job ");
        }else{
            System.out.println("keep searching for job");}
    }
}
