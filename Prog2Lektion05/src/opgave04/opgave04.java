package opgave04;

import opgave03.Runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class opgave04 {
    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.addAll(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)));
        System.out.println(runners);
        System.out.println();

        // OBS: Throws exception.
        //for (Runner runner : runners) {
         //   if (runner.getLapTime() > 40)
              //  runners.remove(runner);
      //  }
        //Smider en fejl fordi man fjerne runners imens man itererer over den.


        Iterator<Runner> it = runners.iterator();
        while (it.hasNext()) {
            Runner runner = it.next();
            if (runner.getLapTime() >= 40) {
                it.remove();
            }
        }
        System.out.println(runners);

        //en anden løsning med lambda
        //runners.removeIf(runner -> runner.getLapTime() > 40);
        //System.out.println(runners);

        System.out.println();

    }
}