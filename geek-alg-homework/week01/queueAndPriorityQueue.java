import java.util.PriorityQueue;

class QueueAndPriorityQueue {
/**
 * 在Java10中，Queue是一个接口，定义了6种方法
 * add: 如果queue空间足够就可以直接插入，返回true，如果空间不足，就抛异常IllegalStateException
 * offer: 如果插入成功返回true，如果插入不成功，返回false，而不是抛异常，与add不同，例如在限定大小的queue中，插入超过限定值
 * remove 和 poll : 都会remove掉queue的head并且返回该元素，与poll不同的是，如果queue是空的，remove抛异常，但是poll返回null
 * element 和 peek : 都会返回queue的head元素，但是不会删除；不同的是，没有元素的时候，element抛异常，peek返回null
 * 
 * 注意；不要在queue 里面插入null,就算有些实现里面不违法也不要这么做，因为poll 会通过返回null来说明queue已经没有元素了
 */

    // public interface Queue<E> extends Collection<E> {
    //     boolean add(E e);
    //     boolean offer(E e);
    //     E remove();
    //     E poll();
    //     E element();
    //     E peek();
    // }

    /**
     * priorityQue after adding : [1, 3, 2, 4] 
     * priorityQue remove 1 :[2, 3, 4]
     * priorityQue : [2, 3, 4] 
     * priorityQue peek : 2, [2, 3, 4] 
     * priorityQue poll1 : 2, [3, 4] 
     * priorityQue remove 1 : false, [3, 4] 
     * riorityQue poll2 : 3, [4]
     * priorityQue poll3 : 4, [] 
     * priorityQue poll4 : null, [] 
     * Exception in thread "main" java.util.NoSuchElementException at
     * java.base/java.util.AbstractQueue.remove(AbstractQueue.java:117) at
     * PriorityQueueDemo.main(priorityQueueDemo.java:40)
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> priQue = new PriorityQueue<Integer>();
        priQue.add(1);
        priQue.add(4);
        priQue.add(2);
        priQue.offer(3);
        System.out.println("priorityQue after adding : " + priQue);
        priQue.remove(1);
        System.out.println("priorityQue remove 1 :" + priQue);
        System.out.println("priorityQue : " + priQue);
        System.out.println("priorityQue peek : " + priQue.peek() + ", " + priQue);
        System.out.println("priorityQue poll1 : " + priQue.poll() + ", " + priQue);
        System.out.println("priorityQue remove 1 : " + priQue.remove(1) + ", " + priQue);
        System.out.println("priorityQue poll2 : " + priQue.poll() + ", " + priQue);
        System.out.println("priorityQue poll3 : " + priQue.poll() + ", " + priQue);
        System.out.println("priorityQue poll4 : " + priQue.poll() + ", " + priQue);
        System.out.println("priorityQue remove : " + priQue.remove());

    }

}