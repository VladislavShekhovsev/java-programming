package day15_logicalops_switch_ternary;

public class OrTeacherClassLogic {
    public static void main(String[] args) {
        String teacher = "Saim";
        if(teacher.equals("Saim")||teacher.equals("Murodil")){
            System.out.println("its java class with "+teacher);
        }else if(teacher.equals("Nadir")){
            System.out.println("its soft skill with "+teacher);
        }else{
            System.out.println("its class with "+teacher);
        }
        }
    }

