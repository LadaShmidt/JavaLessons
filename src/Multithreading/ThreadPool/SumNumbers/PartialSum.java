package Multithreading.ThreadPool.SumNumbers;
import java.util.concurrent.Callable;

public class PartialSum implements Callable<Long> {
    long from;
    long to;
    long localSum;
    PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }
    @Override
    public Long call() {
        for(long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("Sum from " + from + " to " + to + " = " + localSum);
        return localSum;
    }
}
