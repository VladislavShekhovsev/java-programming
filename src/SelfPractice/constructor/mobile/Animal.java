package SelfPractice.constructor.mobile;

import com.sun.javafx.stage.StageHelper;

public class Animal {

  private   String bread;
  private   String type;
  private   boolean ableToFly;
  private   double weight;
  private   int age;
  public static int teeth;




   public  Animal(){
       System.out.println("Please enter animal parameters");
       teeth++;
   }
   public Animal(String bread,String type,boolean ableToFly,double weight,int age){
    this.bread =bread;
    this.type=type;
    this.ableToFly=ableToFly;
    setWeight(weight);
    this.age=age;
    teeth++;

   }


    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean AbleToFly() {
        return ableToFly;
    }

    public void setAbleToFly(boolean ableToFly) {
        this.ableToFly = ableToFly;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight<2){
            System.out.println("Error; please enter valid weight");
        }else{
        this.weight = weight;}
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "bread='" + bread + '\'' +
                ", type='" + type + '\'' +
                ", ableToFly=" + ableToFly +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
