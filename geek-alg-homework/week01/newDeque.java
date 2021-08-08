import java.util.Deque;
import java.util.LinkedList;

class NewDeque {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        deque.addLast("1");
        deque.addLast("2");
        deque.addLast("3");
        System.out.println("deque: " + deque);
    
        String str = deque.peek();
        System.out.print("peek: " + str);
        System.out.println(", peekFirst: " + deque.peekFirst());
        System.out.println("deque: " + deque);
    
        while (deque.size() > 0) {
            System.out.print("pop: " + deque.pop());
            System.out.println(", removeFirst: " + deque.removeFirst());
        }
        System.out.println("deque: " + deque);
    }
}





