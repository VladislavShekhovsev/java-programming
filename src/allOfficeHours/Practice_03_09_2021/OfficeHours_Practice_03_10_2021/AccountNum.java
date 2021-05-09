package allOfficeHours.Practice_03_09_2021.OfficeHours_Practice_03_10_2021;

public class AccountNum {
    public static void main(String[] args) {
        String accountNumber ="5000000";
              if(accountNumber.startsWith("2")) {//if(accountNumber.charAt(0)=='2')
                 if(accountNumber.length()==7){
                   System.out.println("valid 2 digit account number");
                    }else{System.out.println("not a valid 2 digit account number");
            }
        } else if(accountNumber.startsWith("5")){
            if(accountNumber.length()==7){
            System.out.println("valid 5 digit account number");}else
                {
                System.out.println("not a valid 2 digit account number");
                }

        }else{
            System.out.println("not a valid account number");
        }
    }
}
