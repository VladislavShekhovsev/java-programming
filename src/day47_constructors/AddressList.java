package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
       /** Address cybertekAddress = new Address();// calling the constructor automatically
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("CyberteckSchool address: "+cybertekAddress.toString());
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3200");
        System.out.println("Cyberteck address update: "+cybertekAddress);
        System.out.println("street info = "+cybertekAddress.getStreet());

        Address newAddress = new Address();
        newAddress.setStreet("7921 Jones branch dr Suite 200");
        newAddress.setCity("Mclean");
        newAddress.setState("VA");
        newAddress.setZipCode("22102");
        System.out.println(newAddress.toString());*/

        Address papaJon = new Address("8501 Tyco Rd Ste 1A","Vienna","VA","22182");
        System.out.println(papaJon.toString());

    }
}
