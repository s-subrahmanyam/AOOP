// Main.java
public class Main {
    public static void main(String[] args) {
        // Integer Priority Queue
        PriorityQueue<Integer> intQueue = new PriorityQueue<>();
        intQueue.enqueue(50);
        intQueue.enqueue(20);
        intQueue.enqueue(40);

        System.out.println("Integer Priority Queue - Peek: " + intQueue.peek());
        System.out.println("Integer Priority Queue - Dequeue: " + intQueue.dequeue());
        System.out.println("Integer Priority Queue - Dequeue: " + intQueue.dequeue());

        // Double Priority Queue
        PriorityQueue<Double> doubleQueue = new PriorityQueue<>();
        doubleQueue.enqueue(1.2);
        doubleQueue.enqueue(3.4);
        doubleQueue.enqueue(0.9);

        System.out.println("Double Priority Queue - Peek: " + doubleQueue.peek());
        System.out.println("Double Priority Queue - Dequeue: " + doubleQueue.dequeue());
        System.out.println("Double Priority Queue - Dequeue: " + doubleQueue.dequeue());

        // String Priority Queue
        PriorityQueue<String> stringQueue = new PriorityQueue<>();
        stringQueue.enqueue("Apple");
        stringQueue.enqueue("Banana");
        stringQueue.enqueue("Orange");

        System.out.println("String Priority Queue - Peek: " + stringQueue.peek());
        System.out.println("String Priority Queue - Dequeue: " + stringQueue.dequeue());
        System.out.println("String Priority Queue - Dequeue: " + stringQueue.dequeue());
    }
}
