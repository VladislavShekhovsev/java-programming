package day16_switch_ternary;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 8;
        if (floorNum == 1) {
         /*   System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks.");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, Nasa, Intelsat.");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Nasa, Bethesda, LG.\"");
        } else {
            System.out.println("Invalid floor"); */

        }
        floorNum=70;
        switch (floorNum){
            case 1:
                System.out.println("floor one selected");
                break;//
            case 2:
                System.out.println("floor two selected");
                break;
            case 3:
                System.out.println("floor tree");
                break;
            case 4:
                System.out.println("floor four");
                break;
            default:
                System.out.println("invalid floor");
                break;
        }

    }
}


