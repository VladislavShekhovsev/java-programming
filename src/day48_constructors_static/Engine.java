package day48_constructors_static;

public class Engine {
    private int cylindres;

    @Override
    public String toString() {
        return "Engine{" +
                "celinder='" + cylindres + '\'' +
                '}';
    }

    public int getCylindres() {
        return cylindres;
    }

    public void setCylindres(int cylindres) {
        this.cylindres = cylindres;
    }
}
