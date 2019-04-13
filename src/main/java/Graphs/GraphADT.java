package Graphs;

public interface GraphADT {

    void init(int n);

    int nodeCount();

    int edgeCount();

    Customer getValue(int v);

    void setValue(int v, Customer data);

    void addEdge(int v, int w, int wgt);

    int weight(int v, int w);

    void removeEdge(int v, int w);

    boolean hasEdge(int v, int w);

    int[] neighbours(int v);


}
