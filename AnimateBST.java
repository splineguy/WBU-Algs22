/* *****************************************************************************
 *  Name:    Ada Lovelace
 *  PCID:    000123456
 *  Assignment:     Set 1
 *
 *  Description:  Prints 'Hello, World' to the terminal window.
 *                By tradition, this is everyone's first program.
 *                Prof. Brian Kernighan initiated this tradition in 1974.
 *
 **************************************************************************** */

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import labs.BSTDrawable;

public class AnimateBST {
    public static void main(String[] args) {
        BSTDrawable<Double, String> myBST = new BSTDrawable<>();

        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(1600, 800);

        for (int i = 1; i <= 1000; i++) {
            Double x = StdRandom.uniform();
            myBST.put(x, String.valueOf(x));


        }

        for (int i = 1; true; i++) {
            int rank = StdRandom.uniform(myBST.size());
            myBST.delete(myBST.select(rank));

            Double x = StdRandom.uniform();
            myBST.put(x, String.valueOf(x));

            StdDraw.clear();
            myBST.drawSimple();
            StdDraw.show();
            // StdDraw.pause(10);
        }


    }
}
