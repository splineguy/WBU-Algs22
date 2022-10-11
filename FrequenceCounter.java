/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdIn;

public class FrequenceCounter {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        ST<String, Integer> st = new ST<String, Integer>();
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            if (!st.contains(word)) {
                st.put(word);
            }
            else {
                st.put(word) = st.get(word) + 1;
            }
        }
    }
}
