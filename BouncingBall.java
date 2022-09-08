/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdDraw;

public class BouncingBall {
    public static void main(String[] args) {
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.enableDoubleBuffering();

        // initial values
        double rx = 0.480, ry = 0.860;   // position
        double vx = 0.023, vy = 0.023;   // velocity
        double radius = 0.025;            // radius

        // main animation loop
        while (true) {

            // bounce of wall according to law of elastic collision
            if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
            if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;

            rx += vx;
            ry += vy;

            StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.filledSquare(0, 0, 1.0);

            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rx, ry, radius)
            ;

            StdDraw.show();
            StdDraw.pause(10);
        }
    }
}
