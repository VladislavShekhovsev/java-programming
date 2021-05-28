package day_47_constructors;

public class Address {
   private String street;
   private String city;
   private String state;
   private String zipCode;
   private String country ="USA";
   //constructor1
    public Address(){
     String street ="Unknown";
     String city="Unknown";
     String state="Unknown";
     String zipCode="Unknown";
    }
    // constructor2
    public Address(String street,String city,String state, String zipCode){
        this.street = street;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;
    }
    // constructor can be  overloaded
    @Override
    public String toString() {
        return street+", "+city+", "+state+" "+zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if(street.isEmpty()||street.length()>50){
            System.out.println("Error: invalid street");
        }else{
        this.street = street;}

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



}
