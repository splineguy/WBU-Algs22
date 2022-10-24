import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ex1 {
    public static void main(String[] args) {
        Queue<String> names = new Queue<String>();
        Queue<Integer> x = new Queue<Integer>();
        Queue<Integer> y = new Queue<Integer>();

        while (!StdIn.isEmpty()) {
            names.enqueue(StdIn.readString());
            x.enqueue(StdIn.readInt());
            y.enqueue(StdIn.readInt());
        }
        while (!names.isEmpty()) {
            int n1 = x.dequeue();
            int n2 = y.dequeue();
            String name = names.dequeue();
            double quotient = (double) n1 / (double) n2;
            StdOut.printf("%15s %3d %3d %5.3f\n", name, n1, n2, quotient);
        }


    }
}
