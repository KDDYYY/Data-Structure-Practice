package deque;

import java.util.Queue;

public class PriorityQueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new java.util.PriorityQueue<>();

        queue.offer(1);
        queue.offer(6);
        queue.offer(2);
        System.out.println(queue);

        //데이터 조회
        System.out.println("queue.peek() = " + queue.peek());

        //데이터 꺼내기
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
    }
}
