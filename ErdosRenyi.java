/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;

public class ErdosRenyi {
    private static int count(int n) {
        int result = 0;
        // Perform the ErdosRenyi Algorithm
        // Create Union-Find object
        UF uf = new UF(n);

        // Loop through until all connected
        while (true) {  // @TODO: How to check if all connected (use UF.count() for num of comp)
            // @TODO: Generate random pairs of integers from 0 to N-1 (inclusive)

            // @TODO: If they are not connected, then connect them

            // @TODO: Increment result

        }

        return result;
    }


    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdOut.print(count(n));
    }
}
