package Multithreading.ThreadPool.SumNumber;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    private static long value = 1_000_000_000;
    private static long sum = 0;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureResult = new ArrayList<>();
        long valueDividedBy10  = value/10;
        for (int i = 0; i < 10; i++){
            long from = valueDividedBy10*i+1;
            long to =  valueDividedBy10*(i+1);
            PartialSum task = new PartialSum(from, to);
            Future<Long> future = executorService.submit(task);
            futureResult.add(future);
        }
        for (Future<Long> item : futureResult){
            try{
                sum += item.get();
            }catch (InterruptedException e){
                e.printStackTrace();
            }catch (ExecutionException e){
                e.printStackTrace();
            }finally{
                executorService.shutdown();
            }
        }
        System.out.println(sum);
    }
}
