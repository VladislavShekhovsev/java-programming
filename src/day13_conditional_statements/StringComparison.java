package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        //the correct way to do boolean on String is
        //if(city.equals("los-angeles")){print"it is LA}else{print "it is not la"}
        // it is key Sensitive
        String city = "Los Angeles";
        if (city.equals("Los Angeles")) {
            System.out.println("It is La");
        } else {
            System.out.println("It is not La");
        }
        String weather = "sunny";
        // if(weather=="sunny){ works but avoid using it because sometimes fail.
        if (weather.equals("sunny")) {
            System.out.println("Lets go and code Java");
        }else{
            System.out.println("learn Java anyway ;-)");
        }
    }
}