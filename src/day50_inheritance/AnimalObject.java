package day50_inheritance;

public class AnimalObject {
    public static void main(String[] args) {
        Dog malish = new Dog();
        malish.name ="Snupi";
        malish.type="pincher";
        malish.voice=" gav-gav";
        malish.run();
        malish.speak();
        malish.eat();
        Cat cat1 =new Cat();
        cat1.name="Push";
        cat1.type="Persian";
        cat1.voice="Miay";
        cat1.jump();
        cat1.speak();
        cat1.eat();
        Animal animal = new Animal();
        animal.name =" Gray";
        animal.type="Pitbul";
        animal.voice="RRRRR";
        animal.speak();
    }
}
