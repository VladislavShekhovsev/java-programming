package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args){
/*     adding variables names
       1. we cant use static for example because it was taken by java
       but we use fo example Static, statiVar,static$ or static2
       2.also cannot start with number Ex: 1stmonth  (not allowed)
       but we can change to month1.
       3. do not use _ or $ as names by themself
       can be used in middle or end.
 */
        String description = "HIC wooden wpoon";
        int ratingCount = 181;
        double price = 5.99;
        String seller = "amazon.com";
        boolean prime = true;
        // if only 2 value yes or no/truce or false, use boolean
        System.out.println("PRODUCT INFORMATION");
        System.out.println(description);
        System.err.println("*********************");
        System.out.println(ratingCount);
    }
}
