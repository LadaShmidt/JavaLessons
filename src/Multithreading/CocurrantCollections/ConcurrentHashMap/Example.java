package Multithreading.CocurrantCollections.ConcurrentHashMap;
/*
    ConcurrentHashMap имплементирует интерфейс ConcurrentMap, который в свою очередь происходит от интерфейса Map.

    В ConcurrentHashMap любое количество потоков может читать элементы не блокируя его.

    В ConcurrentHashMap, благодаря его сегментированию, при изменении какого-либо элемента блокируется только bucket, в котором он находится.

    В ConcurrentHashMap ни key ни value не могут быть null. 
*/
public class Example {
}
