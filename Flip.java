import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Flip {
    public static void main(String[] args) {
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            if (StdRandom.uniformInt(2) == 0) heads.increment();
            else tails.increment();
        }
        StdOut.println(heads);
        StdOut.println(tails);

    }
}
