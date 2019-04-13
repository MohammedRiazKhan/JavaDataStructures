package Graphs;

public class AdjacentList implements GraphADT{

    private class Edge { // Doubly linked list node
        int vertex, weight;
        Edge prev, next;

        Edge(int v, int w, Edge p, Edge n) {
            vertex = v;
            weight = w;
            prev = p;
            next = n;
        }
    }

    private Edge[] nodeArray;
    private Customer[] nodeValues;
    private int numEdge;

    // Initialize the graph with n vertices
    public void init(int n) {
        nodeArray = new Edge[n];
        // List headers;
        for (int i=0; i<n; i++) nodeArray[i] = new Edge(-1, -1, null, null);
        nodeValues = new Customer[n];
        numEdge = 0;

    }

    public int nodeCount() {
        return nodeArray.length;
    }

    public int edgeCount() {
        return numEdge;
    }

    public Customer getValue(int v) {
        return nodeValues[v];
    }

    public void setValue(int v, Customer data) {
    nodeValues[v]=data;
    }

    // Return the link in v's neighbor list that proceeds the
    // one with w (or where it would be)
    private Edge find (int v, int w) {
        Edge curr = nodeArray[v];
        while ((curr.next != null) && (curr.next.vertex < w))
            curr = curr.next;
        return curr;
    }

    public void addEdge(int v, int w, int wgt) {
        if (wgt == 0) return; // Can't store weight of 0
        Edge curr = find(v, w);
        if ((curr.next != null) && (curr.next.vertex == w))
            curr.next.weight = wgt;
        else {
            curr.next = new Edge(w, wgt, curr, curr.next);
            if (curr.next.next != null) curr.next.next.prev = curr.next;
        }
        numEdge++;
    }

    public int weight(int v, int w) {
        Edge curr = find(v, w);
        if ((curr.next == null) || (curr.next.vertex != w)) return 0;
        else return curr.next.weight;
    }

    public void removeEdge(int v, int w) {
        Edge curr = find(v, w);
        if ((curr.next == null) || curr.next.vertex != w) return;
        else {
            curr.next = curr.next.next;
            if (curr.next != null) curr.next.prev = curr;
        }
        numEdge--;
    }

    public boolean hasEdge(int v, int w) {
        return weight(v, w) != 0;
    }

    public int[] neighbours(int v) {
        int cnt = 0;
        Edge curr;
        for (curr = nodeArray[v].next; curr != null; curr = curr.next)
            cnt++;
        int[] temp = new int[cnt];
        cnt = 0;
        for (curr = nodeArray[v].next; curr != null; curr = curr.next)
            temp[cnt++] = curr.vertex;
        return temp;
    }
}
