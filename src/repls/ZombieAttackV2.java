package repls;

import java.util.Arrays;

public class ZombieAttackV2 {
    public static void main(String[] args) {
        int[] pop = {3, 6, 0, 4, 3, 2, 7, 0};
        int days=1;
        System.out.println("Day 0 "+Arrays.toString(pop));
        while (!Arrays.equals(pop, new int[pop.length])) {
            int[] temp = Arrays.copyOf(pop, pop.length);
            for (int i = 0; i < pop.length; i++) {
                if (pop[i] == 0) {
                    if (i == 0) {
                        temp[i + 1] = temp[i + 1] / 2;

                    } else if (i == pop.length - 1) {
                        temp[i - 1] = temp[i - 1] / 2;
                    } else {
                        temp[i + 1] = temp[i + 1] / 2;
                        temp[i - 1] = temp[i - 1] / 2;

                    }
                }


            }
            pop=Arrays.copyOf(temp,temp.length);
            System.out.println("Day " + days++ + " " + Arrays.toString(pop));

        }
        System.out.println("---EXSTINCT---");

    }
}