package OfficeHours.Practice_06_15_21;

public class Yahoo extends Email{
    static String domain;
    static {domain="yahoo";}

    public Yahoo(String address, int numberOfEmail) {
        super(address, numberOfEmail);
    }
}
