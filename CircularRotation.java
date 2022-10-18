/* *****************************************************************************
 *  Name:              Scott Franklin
 *  Coursera User ID:  000001182
 *  Last modified:     October 3, 2022
 **************************************************************************** */

public class CircularRotation {
    public static void main(String[] args) {

    }

    public static boolean isCircularRotation(String s, String t) {
        return (s.length() == t.length()) && (s + s).contains(t);
    }
}
