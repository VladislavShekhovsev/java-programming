package day45_oops;

public class TrafficLightObjects {
    public static void main(String[] args) {
        // create traffic light object
        TrafficLights light1 =new TrafficLights();
        light1.changeColor("Red");
        light1.showColor();
        light1.changeColor("green");
        light1.showColor();
        light1.changeColor("red");
        light1.showColor();
        light1.changeColor("black");
        light1.showColor();

    }
}
