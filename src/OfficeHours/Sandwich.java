package OfficeHours;

public class Sandwich {
    public static void main(String[] args) {
        String str = "breadbread";// can place between bread it will print
        boolean isVAlid =false;
        if(str.contains("bread")){
            int firstBread=str.indexOf("bread");
            if(str.substring(firstBread+5).contains("bread")){//jambread
            System.out.println("2 bread");
            int secondBread = str.lastIndexOf("bread");
                String result=str.substring(firstBread+5,secondBread);
                if(result.isEmpty()){
                    System.out.println("nothing");
                }else {
                    System.out.println(result);
                }
            }else{
                System.out.println("nothing");
            }
        }
        else{
            System.out.println("nothing");
        }


        }
    }

