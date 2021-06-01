package SelfPractice.parctice05_29_21;

import java.util.ArrayList;
import java.util.List;

public class PlainTemp {
   private String model;
   private String pilot;
   private List<String> passengers;
   private int flightNum;
   private boolean roundFlight;
  PlainTemp(){
       this.model = "please assign model name ";
       this.pilot = "please assign pilot name ";
       this.flightNum = -1;
       this.roundFlight = false;

   }
   PlainTemp (String model,String pilot,int flightNum,boolean roundFlight){
      this.model =model;
      this.pilot=pilot;
      this.flightNum=flightNum;
      this.roundFlight=roundFlight;

   }

    public List<String> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<String> passengers) {
        this.passengers=passengers;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }

    public boolean isRoundFlight() {
        return roundFlight;
    }

    public void setRoundFlight(boolean roundFlight) {
        this.roundFlight = roundFlight;
    }

    @Override
    public String toString() {
        return "PlainTemp{" +
                "model='" + model + '\'' +
                ", pilot='" + pilot + '\'' +
                ", passengers='" + passengers + '\'' +
                ", flightNum=" + flightNum +
                ", roundFlight=" + roundFlight +
                '}';
    }
}
