package Multithreading.SynchronizedBlocks;
/*
    Пример синхронизации разных методов на экране одного класса. 
*/
public class Calling {
    static final Object lock = new Object();

    public void mobileCall() {
        synchronized(lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile calls ends");
        }
    }
    public void skypeCall() {
        synchronized(lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype calls ends");
        }
    }
    public void whatsAppCall() {
        synchronized(lock) {
            System.out.println("WhatsApp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WhatsApp calls ends");
        }
    }
}
