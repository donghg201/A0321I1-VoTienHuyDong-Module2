package bai11_StackAndQueue.bai_tap.UseQueue;

public class SolutionClient {
    public static void main(String[] args) {
        Solution.Queue q = new Solution.Queue();
        q.front = q.rear = null;

        Solution.enQueue(q, 14);
        Solution.enQueue(q, 22);
        Solution.enQueue(q, 6);

        Solution.displayQueue(q);

        System.out.printf(" Deleted value = % d ", Solution.deQueue(q));
        System.out.printf(" Deleted value = % d ", Solution.deQueue(q));
        Solution.displayQueue(q);

        Solution.enQueue(q, 9);
        Solution.enQueue(q, 20);
        Solution.displayQueue(q);
    }
}
