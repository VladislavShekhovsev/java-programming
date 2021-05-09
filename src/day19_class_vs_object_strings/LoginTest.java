package day19_class_vs_object_strings;

import java.time.Instant;

public class LoginTest {
    public static void main(String[] args) {
        String userName = "cybertek";
        String passWord = "Abc123";
        String expUserName = "Cybertek";
        String expPass = "Abc123";
        if(expUserName.equalsIgnoreCase("cybertek")&&expPass.equals("Abc123")){
            System.out.println("welcome to your account "+ Instant.now());
        }else if (!expUserName.equalsIgnoreCase("cybertek")){
            System.out.println("incorrect username");
        }else if(!expPass.equals("Abc123")){
            System.out.println("pass incorrect");

        }
    }
}
