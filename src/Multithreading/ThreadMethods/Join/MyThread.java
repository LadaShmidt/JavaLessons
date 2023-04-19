package Multithreading.ThreadMethods.Join;
/*
    Метод join() относится к классу Thread и позволяет заставить текущий поток ждать завершения выполнения другого потока.
    Вызов метода join() блокирует выполнение текущего потока до тех пор, пока поток, на который вызывается join(), не завершится.
    Если поток, на который вызывается join(), уже завершился, то вызов join() завершается немедленно.
*/
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
