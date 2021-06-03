package OfficeHours.practice_05_19_21;

public class MyBackYard {
    public static void main(String[] args) {
        Birds birdOne =new Birds();
        Birds birdTwo =new Birds();
        birdOne.setCanFly(true);
        System.out.println(birdTwo.canFly());
        birdTwo.setBeakLength(-1);

    }
}
