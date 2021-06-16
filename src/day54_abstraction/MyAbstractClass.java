package day54_abstraction;

public abstract class MyAbstractClass {
    int num =55;
    public void learn() {
    System.out.println("learning");
  }
    public abstract void close();


}



    class Sub extends MyAbstractClass{
    public void close(){
        System.out.println("close abstract method implementation");
    }


}


    class MyObjects{
             public static void main(String[] args) {
            // MyAbstractClass mac = new MyAbstractClass();ERROR: cannot create objects from abstract classes
            Sub sub = new Sub();
            sub.learn();
            System.out.println(sub.num);
    }
}
