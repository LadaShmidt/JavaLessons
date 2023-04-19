package Multithreading.ThreadMethods.Name;
/*
    Метод setName и getName относятся к классу Thread.
    setName(String name) - метод устанавливает имя потока, которое будет использоваться для идентификации потока.
    Если имя не задано явно, то потоку будет присвоено системное имя по умолчанию.

    getName() - метод возвращает имя потока.
*/
class MyThread extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}
