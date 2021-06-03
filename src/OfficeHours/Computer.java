package OfficeHours;

public class Computer {
    public static void main(String [] args){
        String brand = "Alienware";
        String cpu = "Intel® Core™ i7 10700KF";
        String ram = "64GB";
        String description = "The Alienware Aurora R11 is engineered with 10th Gen Intel® Core™ processors,\noptional liquid-cooled graphics and multiple upgrade options to achieve peak performance that lasts.";
        String cPu = "(8-Core, 16MB Cache, 3.8GHz to 5.1GHz w/Turbo Boost Max 3.0)";
        String color = "lunar light";
        double price= 2639.99;
        boolean monitor = false;
        boolean wifi = true;
        boolean usb = true;
        byte usbSlot = 4;
        byte monitorSlots = 3;

        System.out.println("PC brand: "+brand);
        System.out.println("Processor: "+cpu);
        System.out.println("RAM memory :"+ram);
        System.out.println("descriprion: "+description);
        System.out.println("cpu: "+cPu);
        System.out.println("color: "+color);
        System.out.println("Comes with monitor: "+monitor);
        System.out.println("Comes with wifi card: "+wifi);
        System.out.println("Has USB 3.0: "+usb);
        System.out.println("Number of USB slots: "+usbSlot);
        System.out.println("Number of monitor slots: "+monitorSlots);
        System.out.println("Price: "+price);



    }
}
