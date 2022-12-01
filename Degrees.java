import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;

public class Degrees {
    private int[] indegree;
    private int[] outdegree;
    ArrayList<Integer> sources = new ArrayList<Integer>();
    ArrayList<Integer> sinks = new ArrayList<Integer>();

    public Degrees(Digraph dg) {
        indegree = new int[dg.V()];
        outdegree = new int[dg.V()];

        for(int i = 0; i< dg.V(); i++){
            for(int j : dg.adj(i)){
                indegree[j]++;
                outdegree[i]++;
            }
        }

        for(int k = 0; k < outdegree.length; k++){
            if(outdegree[k]==0){
                sinks.add(k);
            }
        }

        for(int m = 0; m < indegree.length; m++){
            if(indegree[m]==0){
                sources.add(m);
            }
        }

        StdOut.println(Arrays.toString(indegree)+"\n"+Arrays.toString(outdegree));

    }

    public int indegree(int vertex){
        return indegree[vertex];
    }

    public int outdegree(int vertex){
        return outdegree[vertex];
    }

    public ArrayList<Integer> sources(){
        return sources;
    }

    public ArrayList<Integer> sinks(){
        return sinks;
    }

    public static void main(String args[]){
        Digraph dg = new Digraph(7);
        dg.addEdge(0,1);
        dg.addEdge(0,2);
        dg.addEdge(1,2);
        dg.addEdge(2,0);
        dg.addEdge(2,1);
        dg.addEdge(3,1);
        dg.addEdge(4,5);
        dg.addEdge(5,4);
        dg.addEdge(5,1);
        dg.addEdge(1,4);
        dg.addEdge(5, 6);

        Degrees d = new Degrees(dg);

        for(int v : d.sources()){
            StdOut.print(v+", ");
        }
        StdOut.println();
        for(int v : d.sinks()){
            StdOut.print(v+ ", ");
        }

    }

}
