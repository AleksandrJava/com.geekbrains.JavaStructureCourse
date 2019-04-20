package Lesson7;

import java.util.LinkedList;

public class Graph {
    private int vertexCount;
    private int edgeCount;
    private LinkedList<Integer>[] adjList;

    public Graph(int vertexCount){
        if(vertexCount < 0){
            throw new IllegalArgumentException();
        }
        this.vertexCount = vertexCount;
        adjList = new LinkedList[vertexCount];
        for (int i = 0; i < vertexCount ; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public int vertexCount(){
        return vertexCount;
    }

    public int edgeCount(){
        return edgeCount;
    }

    public void addEdge(int v1, int v2){
        if(v1 < 0 || v2 < 0){
            throw new IllegalArgumentException();
        }
        if(v1 >= vertexCount || v2 >=vertexCount){
            throw new IndexOutOfBoundsException();
        }
        adjList[v1].add(v2);
        adjList[v2].add(v1);
    }

    public LinkedList<Integer> adjList(int vertex){
        return adjList[vertex];
    }
}
