package edu.nyu.cif2022.class6.jmh;

/**
 *
 */
public class LessUgly {

    public static void main(String...args) {
        LessUgly object = new LessUgly();
        object.addNumbers(5, 6);
        long time = System.currentTimeMillis();
        int tmp = object.addNumbers(3, 4);
        long delta = System.currentTimeMillis() - time;
        System.out.println(delta + " " + tmp);

    }


    public int addNumbers(int a, int b) {
        int tmp = 0;
        for (int i = 0; i < 1_000_000_000; ++i) {
            tmp += a + b;
        }
        return tmp;
    }

}
