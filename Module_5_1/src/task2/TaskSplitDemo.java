package task2;

import java.util.ArrayList;

public class TaskSplitDemo {
    private static final int N = 1000000;

    public static void execute(int[] array, int cores) {
        /* split the task to individual threads */
        ArrayList<Summation> mathunters = new ArrayList<>();
        double dy = N/cores; //amount of elements for 1 core
        for (int i = 0; i < cores; i++) {
            /* Divide columns to roughly equally sized groups. The last column may be a little larger due rounding */
            int slicestart = (int)Math.round(i*dy);//i=0 slicestart = 0 , i = 1 slicestart = 250
            int sliceend = N;
            if (i < cores-1)
                sliceend = (int)Math.round((i+1)*dy);

            /* Then create Summation thread/job for that part of the array */
            mathunters.add(new Summation(array, slicestart, sliceend-1));
        }

        /* start treads */
        long start = System.nanoTime();
        for (Summation mh : mathunters)
            mh.start();

        /* wait for them to complete their tasks, and collect results */
        int result = 0;
        for (Summation mh : mathunters) {
            try {
                mh.join();
            } catch (InterruptedException e) {
                // thread was interrupted, the result may be incorrect
                e.printStackTrace();
            }
            result += mh.getSumma();
        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println("Time elapsed " + timeElapsed/10e6 + " ms. The result is " + result);
    }

    public static void main(String[] args) {
        int[] array = new int[N];

        /* create an array having random number from 0 to 10 */
        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random()*10);
        }

/*        for (int i = 0; i < N; i++) {
            System.out.println(array[i]);
        }*/

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Our system has " + cores + " processor cores\n");
        System.out.print("1 Thread(s): "); execute(array, 1);
        System.out.print("1 Thread(s): "); execute(array, 1);
        System.out.print(cores + " Thread(s): "); execute(array, cores);
    }
}
