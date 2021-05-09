package day33_ArraysWithTwoVariables;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("Starting ETSY smoke test");
        openBrowser();
        navigateToEtsyUrl();
        homePageDisplayedVerification();
        searchForWoodenSpoonItem();
        verifyIfSearchingPassed();

    }
    public static void openBrowser(){
        System.out.println("Launching Chrome browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Enter www.etsy.com in the url");
    }
    public static void homePageDisplayedVerification(){
        System.out.println("PASS: the homepage displayed!");

    }
    public static void searchForWoodenSpoonItem(){
        System.out.println("Enter wooden spoon in the item search line");
    }
    public static void verifyIfSearchingPassed(){
        System.out.println("PASS: search process complete, and items displayed!");
    }
}
