package Multithreading.ThreadPool.SumNumber;

import java.util.concurrent.Callable;

public class PartialSum implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }
    public Long call (){
        for (long i = from; i <= to; i++){
            localSum += i;
        }
        System.out.println("Sum from " + from + " Sum to " + to + " = " + localSum);
        return localSum;
    }
}
