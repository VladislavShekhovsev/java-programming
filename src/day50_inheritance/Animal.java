package day50_inheritance;

public class Animal {
    String type;
    String name;
    String voice;
    public void speak(){
        System.out.println("the "+type+" says "+voice);
    }
    public void eat(){
        System.out.println("animal eating");
    }
}
