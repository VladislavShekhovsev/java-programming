package OfficeHours.practice_05_18_21;

public class AnimalSpecies {

        String name;
        int population;
        int growRate;
        public void setInfo(String setName,int setPopulation, int setGrowRate){
            name= setName;
            population=setPopulation;
            growRate=setGrowRate;
        }
        public String getName(){
            if(name==null){
                System.out.println("no name defined!");
            }
            return name;
        }
        public int getPopulation(){
            return population;
        }
        public int getGrowRate(){
            return growRate;
        }

    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population =" + population +"million"+
                ", growRate=" + growRate +"%"+
                '}';
    }
}
