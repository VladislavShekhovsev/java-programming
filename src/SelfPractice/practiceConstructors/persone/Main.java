package SelfPractice.practiceConstructors.persone;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    String size;
    ArrayList<Pillow>pillows =new ArrayList<Pillow>();
    public Main(String size, int numsOfPillow){
        this.size=size;
        for (int i = 0; i <numsOfPillow ; i++) {
            this.pillows.add(new Pillow());
        }
    }

}
class Pillow{
    String material;

    public static void main(String[] args) {
        Main bed = new Main("King",4);
        System.out.println(bed.pillows.size());

    }
}