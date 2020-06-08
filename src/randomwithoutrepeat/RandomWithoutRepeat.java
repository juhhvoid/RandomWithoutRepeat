package randomwithoutrepeat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomWithoutRepeat {

    public static void main(String[] args) {
        int find = 0;
        int c, i = 0; 
        ArrayList num = new ArrayList();
        Random rdm = new Random();

//construindo o array sem repetição
        for (i = 0; i < 5; i++) {
            find = rdm.nextInt(80) + 1;
            if (i == 0) {
                num.add(find);
            } else {
                c = 0;
                while (c < i) {
                    if (num.get(c).equals(find)) {
                        find = rdm.nextInt(5) + 1;
                        c = 0;
                    } else {
                        c++;
                    }
                }
                num.add(find);
            }
            //Ordenando a lista
            Collections.sort(num);
        }
        //imprimindo a lista
        System.out.print(num);

    }

}
