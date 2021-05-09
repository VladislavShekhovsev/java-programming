package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry=true;
        int babanas =0;
        int countToFull=3;
         while (isHungry) {
             babanas++;
             System.out.println("eating a banana \uD83C\uDF4C" + babanas);
             if(babanas==countToFull){
                 isHungry=false;
             }
         }
        }
    }

