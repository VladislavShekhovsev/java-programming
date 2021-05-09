package day18_conditions_practice_strings_intro;

public class findTheBiggestNum {
    public static void main(String[] args) {
        int num1=30;
        int num2=40;
        int num3=40;
        if(num1>=num2&&num1>=num3){
            System.out.println(num1+" its biggest");
        }else if(num2>=num1&&num2>=num3){
            System.out.println(num2+" its biggest");
        }else if(num3>=num1&&num3>=num2){
            System.out.println(num3+" its biggest");
        }
    }
}
