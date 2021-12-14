import java.lang.*;

public class Stopwatch {

    public static void main(String[] args) {
        long start = stopwatch();
        System.out.println("Start time = " + start + " millisecond");
        for(int i =0; i<1000; i++){
            System.out.print(" ");
        }
        System.out.println(" ");
        long stop = stopwatch();
        System.out.println("End time = " + stop + " millisecond");
        long time_elapse = elapsedTime(start, stop);
        System.out.println("Elapsed time = " + time_elapse);
    }
    public static long stopwatch() {
        long time = System.currentTimeMillis();
        return time;
    }
    public static long elapsedTime(long start, long stop) {
        long time = stop-start;
       return time;
    }
}