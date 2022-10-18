import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

public class MyJosephus {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        for (int i = 0; i < N; i++) {
            q.enqueue(i);
        }
        int counter = 1;
        while (q.size() > 0) {
            if (counter == M) {
                StdOut.print(q.dequeue() + " ");
                counter = 1;
            }
            else {
                q.enqueue(q.dequeue());
                counter += 1;
            }
        }
        StdOut.println();
    }
}
