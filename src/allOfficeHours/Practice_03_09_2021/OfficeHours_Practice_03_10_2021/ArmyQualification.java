package allOfficeHours.Practice_03_09_2021.OfficeHours_Practice_03_10_2021;

public class ArmyQualification {
    public static void main(String[] args) {
        String citizenship = "usa";
        boolean resident =true;


        if(citizenship.equalsIgnoreCase("usa")||resident){
            int age = 18;
            if(age>=18&&age<35){
                boolean hasDiplome =true;
                if(hasDiplome){
                    System.out.println("you are qualified to serve");
                }else{
                    System.out.println("you must a have high school diploma.");
                }
            }else{
                System.out.println("u have to be in valid age");
            }
        }else{
            System.out.println("you must be a U.S citizen or a resident");
        }
    }
}
