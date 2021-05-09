package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "cat,car,cat_car,java,selenium";


       for(int i=0;i<list.length()-2;i++){
           System.out.println(list.substring(i,i+3));
           String part =list.substring(i,i+3);
           if(part.equals("cas")||part.equals("car")){
               System.out.println("cat or car");
           }
        }




        // 0,3 in substring . the substring dot read the last character so it like 0,1,2 of index

        /*System.out.println(list.substring(i,i+3));
        i++;
        System.out.println(list.substring(i,i+3));
        i++;
        System.out.println(list.substring(i,i+3));
        i++;
        System.out.println(list.substring(0,3));
        System.out.println(list.substring(1,4));
        System.out.println(list.substring(2,5));
        System.out.println(list.substring(3,6));
        System.out.println(list.substring(4,7));*/
    }
}
