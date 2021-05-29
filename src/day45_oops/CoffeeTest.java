package day45_oops;

public class CoffeeTest {
    public static void main(String[] args) {
        // using methods instead of touching the variable
        CoffeeTemplate firstCoffee = new CoffeeTemplate();
        firstCoffee.refill();
        System.out.println("amount after refill  = "+firstCoffee.getAmount()+"%");
        firstCoffee.drink(10);
        System.out.println("amount after we drink 10%  = "+firstCoffee.getAmount()+"%");
        firstCoffee.setType("Latte");
        System.out.println("type of coffee = "+firstCoffee.getType());
        System.out.println(firstCoffee.toString());
        CoffeeTemplate secondCoffee =new CoffeeTemplate();
        secondCoffee.refill();
        secondCoffee.drink(50);
        System.out.println("amount after we drink 50% = "+secondCoffee.getAmount()+"%");
        secondCoffee.setType("Turkish coffee");
        System.out.println("type of coffee "+secondCoffee.getType());
        // we didnt created new object of coffee, we just created new reference like name to same object of second coffee
        CoffeeTemplate thirdCoffee = secondCoffee;
        System.out.println("third coffee = "+secondCoffee.getType());
        secondCoffee.setType("Espresso");
        System.out.println("second coffee = "+secondCoffee.getType());
        System.out.println("third coffee = "+secondCoffee.getType());
        CoffeeTemplate fourthCoffee =new CoffeeTemplate();
        fourthCoffee=secondCoffee;
        System.out.println("fourth coffee = "+fourthCoffee.getType());
        CoffeeTemplate coffee5 =null;
        // coffee 5 do not point on any object (null stay inside stack memory) so wee get null pointer exception
      //  coffee5.setType("black coffee");

    }
}
