package Lesson7;

import java.util.LinkedList;

public class DepthStackFirstPaths {
    private boolean[] marked;
    private int[] edgeTo;
    private int source;

    public DepthStackFirstPaths(Graph g, int source){
        if(source < 0){
            throw new IllegalArgumentException();
        }
        if(source >= g.vertexCount()){
            throw new IndexOutOfBoundsException();
        }
        this.source = source;
        edgeTo = new int[g.vertexCount()];
        marked = new boolean[g.vertexCount()];
        dfs(g, source);
    }
    private void dfs(Graph g, int v){

        LinkedList<Integer> stack = new LinkedList<>();
        stack.addLast(v);
        marked[v] = true;

        while(!stack.isEmpty()){
            int vertex = stack.peekLast();
            if(!g.adjList(vertex).isEmpty()){
                for (int w: g.adjList(vertex)) {
                    if(!marked[w]){
                        marked[w] = true;
                        edgeTo[w] = vertex;
                        stack.addLast(w);
                        break;
                    }
                }
            }
            if (stack.peekLast() == vertex){
                stack.removeLast();
            }
        }
    }

    public boolean hasPathTo(int dist){
        if(dist < 0){
            throw new IllegalArgumentException();
        }
        if(dist >= marked.length){
            throw new IndexOutOfBoundsException();
        }
        return marked[dist];
    }

    public LinkedList pathTo(int dist){
        if (!hasPathTo(dist)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();

        int vertex = dist;
        while(vertex != source){
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }
}
