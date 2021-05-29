package day45_oops;

public class TrafficLights {
    String color;

    public void showColor(){
        System.out.println("current color = "+color);
    }
    // this method update the value of color variable
    public void changeColor(String newColor){
        if(newColor.equalsIgnoreCase("red")||
                newColor.equalsIgnoreCase("yellow")||
                        newColor.equalsIgnoreCase("green")){
        color=newColor;
        System.out.println("changing color to "+newColor);}else{
            System.out.println("not valid color");
        }
    }
}
