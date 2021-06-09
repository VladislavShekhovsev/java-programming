package day53_inheritance.tesla;

public class ElectricCar {

    private String make;
    private String model;
    private double price;
    private int year;
    private int range;
    private static int count;// count is static, all objects will share this variable.
    public static final int MAX_RANGE=7000;

    public final void charge(){
        System.out.println("Charging the Electric car using plug in");
        this.range=MAX_RANGE;
    }
    public ElectricCar(String make, String model, double price, int year, int range) {
        setMake(make);// this.make = make; they are same, useful when setter have spme condition
        //System.out.println(ec1.make); Error make is private
        // System.out.println(ElectricCar.make); Error :make needs to be static
        this.model = model;
        this.price = price;
        this.year = year;
        this.range = range;
        count++;// will increase by one each time when we create object
    }

    protected void drive(int miles){
       if (range==0||range- miles<0){
            System.out.println("Error: cannot drive that far, need to charge");} else{
            range-=miles;
           System.out.println("Driving "+miles+" miles");
            }
        }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(!make.isEmpty()){
        this.make = make;}else{
            System.out.println("Error: make cannot be blank");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public static int getCount() {
        return count;
    }


    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }
}
