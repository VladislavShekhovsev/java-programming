package repls;

import java.util.Arrays;

public class InnerAndOuter {
    public static void main(String[] args) {
        int[] outer= {1, 2, 4, 6};
        int[] inner= {2,4};
        boolean containSame = false;
        for (int i = 0; i < outer.length ; i++) {

            for (int j = 0; j <inner.length ; j++) {
                if (outer[i] == inner[j]) {
                    containSame=true;

                }

            }

        }
        System.out.println(containSame);
    }
}
