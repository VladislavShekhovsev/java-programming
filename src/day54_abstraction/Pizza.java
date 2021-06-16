package day54_abstraction;

public class Pizza extends MenuItem {

    @Override
        public void prepare () {
            System.out.println("preparing");
        }
        @Override
        public void serve(){
            System.out.println("serving");
        }
        @Override
        public void charge(){
            System.out.println("charging");
        }


}
