package day28_loops;

public class JavaCityCases {
    public static void main(String[] args) {
        int newCases = 0;
        for(int day=1;day<=30;day++){
            if(day%7==0){
                newCases+=500;
            }else{
                newCases+=200;
            }

        }
        System.out.println("unfortunately we have "+newCases);
    }
}
