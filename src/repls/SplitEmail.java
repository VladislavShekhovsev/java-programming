package repls;

import java.util.Arrays;

public class SplitEmail {
    public static void main(String[] args) {
        String email = "Vladislav13457@gmail.com";
        int count = 0;
        for (int i = 0; i < email.length(); i++) {
         if(email.charAt(i)==('@')){
             count++;
          }
        }
        if(count==1){
            String[] arrMail = email.split("@");
            System.out.println("Email id " + arrMail[0]);
            System.out.println("Email domain: " + arrMail[1]);
        }else{
            System.out.println("invalid email");
        }
    }
}

