package OfficeHours.practice_06_14_21;

public class Candy {
    private String brand;
    private int quantity;
    private boolean hasPeanuts;
    private static int totalNumberOfCandies;//purpose -> know how many candy objects was made

    public Candy(String brand,int quantity,boolean hasPeanuts){
        this.brand=brand;
        setQuantity(quantity);
        this.hasPeanuts=hasPeanuts;
        totalNumberOfCandies++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>0){
        this.quantity = quantity;}else{
            System.out.println("Error please set correct quantity");
        }
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public static int getTotalNumberOfCandies() {
        return totalNumberOfCandies;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
