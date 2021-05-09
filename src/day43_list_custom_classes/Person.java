package day43_list_custom_classes;

public class Person {// can be only one public
    //Data -> Variables
String firstName;
int age;
char gender;
//Behaviour
public void speak(){
    System.out.println("Person is speaking");
}
}
class people{// class for running with main method
    public static void main(String[] args) {
        //crated object of Person class- Instantiate Person class
      Person person1 =new Person();
      person1.firstName= "Bob";
      person1.age =33;
      person1.gender='M';
      System.out.println(person1.firstName);
      System.out.println(person1.age);
      Person person2= new Person();
      person2.firstName ="Mike";
      person2.age =12;
      person2.gender='M';
      person2.speak();
      System.out.println(person2.firstName);
      System.out.println(person2.age);
      System.out.println("person one first name : "+person1.firstName);
      System.out.println("person one data:\nFirst name :"+person1.firstName+"\nGender: "+person1.gender+"\nAge: "+person1.age);
      person1.speak();
    }
}
