import edu.princeton.cs.algs4.Out;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomLetters {
    public static void main(String[] args) {
        Out out = new Out("random_letters.txt");


        int N = Integer.parseInt(args[0]);
        for (int i = 0; i < N; i++) {
            int x = StdRandom.uniform(65, 91);
            StdOut.println(x + ": " + (char) x);
            out.println((char) x);
        }
        out.close();
    }
}
