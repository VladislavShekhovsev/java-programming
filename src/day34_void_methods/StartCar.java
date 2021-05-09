package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        sitInCAr();
        startTheCAr();
        shiftToDrive();
        pressGasPedal();

    }
    public static void pressGasPedal(){
        System.out.println("Hold Steering wheel with two hans, and press gas. ");
    }
    public static void sitInCAr(){
        System.out.println("Open the door and sit in driver seat");
    }
    public static void startTheCAr(){
        System.out.println("Put your leg on the break, and press one start button");
    }
    public static void shiftToDrive(){
        System.out.println("Shift the gear box to drive");
    }

}
