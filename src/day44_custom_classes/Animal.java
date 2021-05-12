package day44_custom_classes;

public class Animal {
    String type;
    public void eat(){
        System.out.println("the "+type+" is eating");
    }
    public void sleep(){
        System.out.println("the "+type+" is sleeping");
    }
    public void eat(String food){
        System.out.println("the "+type+" is eating "+food);
    }
}
