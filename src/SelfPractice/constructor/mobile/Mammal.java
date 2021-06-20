package SelfPractice.constructor.mobile;

public class Mammal extends Animal{



        int montOfPregnancy;

        public void bite(){
            System.out.println(" the "+getType()+" is biting ");
        }

    public int getMontOfPregnancy() {
        return montOfPregnancy;
    }

    public void setMontOfPregnancy(int montOfPregnancy) {
        this.montOfPregnancy = montOfPregnancy;
    }
    public static void main(String[] args) {
        Animal elephant = new Animal();
        Animal wolf = new Animal();
        wolf.setType("European");
        wolf.setAbleToFly(false);
        wolf.setAge(3);
        wolf.setBread("fghjk");
        System.out.println(wolf);

        Animal horse = new Animal();
        Animal dodo = new Animal("bird","extinct",false,2,5);
        System.out.println(dodo);
        System.out.println(Animal.teeth);
        Animal shark = new Animal();
        System.out.println(Animal.teeth);
        System.out.println(wolf.teeth);
        Animal fif = new Animal("bird","extinct",false,500,5);
        System.out.println(Animal.teeth);




    }

}
