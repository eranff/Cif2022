package edu.nyu.cif2022.class6.jmh;

/**
 *
 */
public class EvenUglier {

    public static void main(String...args) {
        EvenUglier object = new EvenUglier();
        object.addNumbers(5, 6);
        long time = System.currentTimeMillis();
        object.addNumbers(3, 4);
        long delta = System.currentTimeMillis() - time;
        System.out.println(delta);

    }


    public void addNumbers(int a, int b) {
        for (long i = 0; i < 1_000_000_000; ++i) {
            int c = a + b;
        }
    }

}
