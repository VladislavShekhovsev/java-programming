package day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("********WELCOME TO M&T BANK********");
         int secretPinCode = 2233;
         int inputPinCode = 2233;
         if(inputPinCode==secretPinCode){
             System.out.println("Welcome to your account ");
             System.out.println("withdrew");
             System.out.println("deposit");
         }else{
             System.out.println("Incorrect pincode!: please try again."+inputPinCode);
         }

    }
}
