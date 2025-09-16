package task2;

import java.lang.Thread;

public class Summation extends Thread {
    int[] array;
    int iLo, iHi;
    int summa;

    /* constructor gets the matrix and the indices specifying what section to examine */
    Summation(int[] array, int iLo, int iHi) {
        this.array = array;
        this.iLo = iLo;
        this.iHi = iHi;

        summa = 0;
    }
    /* examine a section of a 2D matrix and count the number of positive elements */
    public void run() {
//        System.out.println("something here");
        for (int i = iLo; i <= iHi; i++) {
//            System.out.println(array[i]);
            summa+=array[i];

            // to give the possibility for other threads to run
            Thread.yield();
        }
    }

    public int getSumma() {
        return summa;
    }
}
