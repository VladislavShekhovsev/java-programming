package day23_string_manipulation_while_loop;

import java.util.Locale;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [ Saim ] From Number<3343347032> Message:{Hello, lets code some java}";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start + 1, end));
        String sender = message.substring(start + 1, end);
        System.out.println("sender= " + sender);
        String mobile = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println("mobile "+mobile);
        String text =message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("text "+text);
        System.out.println(" Saim\t".trim());// remove spaces and tabs \t and new line character \n from sides
        sender=sender.trim();//removed the side spaces.
        if (sender.equals("Saim")){
            System.out.println("message from Saim about homework");
        }else{
            System.out.println("other call");
        }
        String wordWithSpaces = ("         Vlad          ");
        System.out.println(wordWithSpaces.trim());// trim the side spaces (like strip it)
        wordWithSpaces =wordWithSpaces.replace(" ","");// another way to remove the spaces
        System.out.println("name "+wordWithSpaces);
   if(wordWithSpaces.toUpperCase().replace(" ","").equals("VLAD")){
       System.out.println("good chain");
   }else{
       System.out.println("bad chain");
   }
        }
    }
