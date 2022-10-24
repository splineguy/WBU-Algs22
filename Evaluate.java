import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("(")) ;
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) vals.push(vals.pop() + v);
                else if (op.equals("-")) vals.push(vals.pop() - v);
                else if (op.equals("*")) vals.push(vals.pop() * v);
                else if (op.equals("/")) vals.push(vals.pop() / v);
                else if (op.equals("sqrt")) vals.push(Math.sqrt(v));
            }
            else vals.push(Double.parseDouble(s));
            StdOut.println(ops);
            StdOut.println(vals);
        }
        StdOut.println(vals.pop());
    }
}
