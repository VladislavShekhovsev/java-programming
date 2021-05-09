package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
      repeatString("java",5,'|');
    }
    public static void repeatString(String word,int times,char delimeter){
        String temp="";
        for (int i = 0; i < times; i++) {
            temp+=word+delimeter;
        }
        System.out.println(temp.substring(0,temp.length()-1));
    }
}

    /**String retValue = "";
        for(int i = 1; i <= times; i++) {
        //take care of last delimiter:
        if(i == times) { //if last iteration
        retValue += word; //add only word by itself
        } else {
        retValue += word + delimiter; //add with delimiter
        }
        }
        return retValue;*/
