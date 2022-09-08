/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class DrawingTest {
    public static void main(String[] args) {
        int N = 10000;
        double[] x = new double[N];
        double[] y = new double[N];
        for (int i = 0; i < N; i++) {
            x[i] = StdRandom.gaussian(0, .25);
            y[i] = StdRandom.gaussian(0, .25);
        }
        // StdDraw.setPenColor(StdDraw.BOOK_RED);
        // StdDraw.filledPolygon(x, y);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.01);
        for (int i = 0; i < N; i++) {
            StdDraw.point(x[i], y[i]);
        }
    }
}
