package day10_shorthand_operators;

public class ShortHand_Operators {
    public static void main(String[] args) {
        int cars= 10;
        System.out.println("cars in the parking lot; = "+cars);
        cars+=2;//its like cars = cars +2 but shorthand
        System.out.println("cars in the parking lot; = "+cars);
        cars-=6;
        System.out.println("cars in the parking lot; = "+cars);
        cars = cars -1;
        cars-= 1;
        System.out.println("cars in the parking lot; = "+cars);
        int electricCars = 13;
        cars = electricCars +  cars;
        System.out.println("cars in the parking lot; = "+cars);
        cars+=electricCars;
        System.out.println("cars in the parking lot; = "+cars);
        String word = "java";
        System.out.println("word "+word);
        word = word+" programming";
        System.out.println("word "+word);
        word+= " is fun";
        System.out.println(word);
        String selenium = " but selenium is more fun.";
        System.out.println(word+selenium);
        word+=selenium;
        System.out.println(word);
        word+=12345; // it will concatenate (soedenit v svazku v zep)
        System.out.println(word);
        char letter = 'A';
        System.out.println("letter= "+letter);
        letter+=3;
        System.out.println("letter= "+letter);
        letter+=1;
        System.out.println("letter= "+letter);
        double parkingFee = 7.5;
        System.out.println("parking fee "+parkingFee);
        parkingFee/=2;
        System.out.println("parking fee "+parkingFee);
        parkingFee-=parkingFee;
        System.out.println("parking fee"+parkingFee);

//increase decrease operators
/* ++(adding one) --(decreasing one)
 */
        int i =44;
        i--;
        System.out.println(i);
        // tree ways to add one
        int num =11;
      num =num+1;
              num+=1;
      num++;
        System.out.println(num);
    }
}
