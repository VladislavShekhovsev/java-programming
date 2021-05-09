package repls;

public class ZombieAttack {
    public static void main(String[] args) {
        int CityPop =12;
        int day=0;
        do{
            System.out.println("day"+day+"["+CityPop+"]");
            CityPop=CityPop/2;
            day++;
        }while(CityPop>0);
        System.out.println("Extinct");

    }
}
