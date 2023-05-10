package Multithreading.Interruption;
/*
    Прерывание потоков - это механизм для безопасной остановки потоков.
    Это достигается путем установки флага прерывания для потока, что указывает потоку, что его работа должна быть прервана.
    Поток может проверять этот флаг в своем коде и выполнять соответствующие действия в случае его установки.

    InterruptedException - это проверяемое исключение,
    которое может быть выброшено, когда поток находится в состоянии ожидания (например, вызовом метода wait() или sleep())
    и был прерван через метод interrupt(). Он также может быть выброшен, когда поток находится в блокировке на мониторе и был прерван.
*/
public class MyThread extends Thread {
    public void run(){
        double sqrtSum = 0;
        for (int i = 0; i < 1000000000; i++){
            if(isInterrupted()){
                System.out.println("Off");
                return;
            }
            sqrtSum += Math.sqrt(i);
            try{
                sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.println("Поток хотят прервать во время сна, давайте завершим его работу!!!");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
