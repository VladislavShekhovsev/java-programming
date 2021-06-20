package SelfPractice.practiceConstructors;

public class Puppy extends Dog{

    int years;

    public Puppy(int years){
        super("buldog",678);
        this.years=years;
        System.out.println("the puppy is"+years);

    }
}
