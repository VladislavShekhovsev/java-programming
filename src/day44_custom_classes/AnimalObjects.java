package day44_custom_classes;

import java.util.Arrays;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal all = new Animal();
        all.type ="Tiger";
        all.eat();
        all.sleep();
        Animal cheetahObj= new Animal();
        cheetahObj.type = "Cheetah";
        System.out.println(cheetahObj.type);
        cheetahObj.eat("meat");
    }
}
