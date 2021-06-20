package SelfPractice.practiceConstructors;

public class Dog {
    String type;

    public Dog(String type,int tyu){
        this.type=type;
        System.out.println("the dog is"+type);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                '}';
    }
}
