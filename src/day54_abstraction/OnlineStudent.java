package day54_abstraction;

/**
 * onlineCStudent  class will extend abstract Student class
 */
public class OnlineStudent extends Student {
@Override
    public void attendClass(){
    System.out.println("Online student is attending the class using Zoom");
}
}
