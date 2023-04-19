package Multithreading.DeadLock;
/*
    Deadlock - ситуация, когда два и более потоков залочены навсегда, ожидают друг друга и ничего не делают.

    Livelock - ситуация, когда два и более потоков залочены навсегда, ожидают друг друга, проделывая какю-то работу,
    но без какого-либо прогресса.

    Lock starvation - ситуация, когда менее приоритетные потоки ждут долгое время или все время для того,
    чтобы иметь возможность запуститься.
*/
public class DeadLock {
    public static final Object firstLock = new Object();
    public static final Object secondLock = new Object();
}
