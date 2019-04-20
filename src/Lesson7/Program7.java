package Lesson7;

public class Program7 {
    public static void main(String[] args) {
        Graph g = new Graph(10);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 3);
        g.addEdge(2, 8);
        g.addEdge(3, 6);
        g.addEdge(3, 8);
        g.addEdge(4, 5);
        g.addEdge(4, 7);
        g.addEdge(5, 6);
        g.addEdge(6, 7);
        g.addEdge(7, 9);
        g.addEdge(8, 9);

//        BreadthFirstPath bfp = new BreadthFirstPath(g, 0);
//        System.out.println(bfp.distTo(7));

        DepthStackFirstPaths dsfp = new DepthStackFirstPaths(g, 0);
        System.out.println(dsfp.pathTo(8));
    }
}
