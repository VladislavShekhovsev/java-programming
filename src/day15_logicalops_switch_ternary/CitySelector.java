package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";
        String teacher = "Saim";
        if (city.equals("Moscow") || city.equals("Paris")) {
            System.out.println("Willing to relocated to one of them");
        } else {
            System.out.println("Not considering "+city);
        }
        if(teacher.equals("Saim")||teacher.equals("Murodil")){
            System.out.println("Its java class with "+teacher);}else{
            System.out.println("its soft skill with"+ teacher);
        }


    }
}
