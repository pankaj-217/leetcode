import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {
    private Queue<Integer> queue = new ArrayDeque<>();

    public void push(int x) {
        queue.offer(x);
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.element();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}