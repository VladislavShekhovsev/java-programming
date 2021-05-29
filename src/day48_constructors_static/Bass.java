package day48_constructors_static;

public class Bass {
    Driver driver;
    Engine engine;

    public String toString(){
        return driver.getName()+" | "+engine.getCylindres();
    }

}
