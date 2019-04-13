package Graphs;

public class Main {

    public static void main(String[] args){

        AdjacentList matrix = new AdjacentList();

        Customer first = new Customer("Riaz", "Khan", 22123);
        Customer second = new Customer("Mohammed", "Khan", 2121);
        Customer third = new Customer("MR", "Khan", 3122);
        Customer four = new Customer("M", "Khan", 212);
        Customer first1 = new Customer("Riaz", "Khan", 22);
        Customer second1 = new Customer("Mohammed", "Khan", 21231);
        Customer third1 = new Customer("MR", "Khan", 32123);
        Customer four1 = new Customer("M", "Khan", 1232);
        Customer first2 = new Customer("Riaz", "Khan", 22123);
        Customer second2 = new Customer("Mohammed", "Khan", 12321);
        Customer third2 = new Customer("MR", "Khan", 32123);
        Customer four2 = new Customer("M", "Khan", 2123);
        Customer first3 = new Customer("Riaz", "Khan", 2132);
        Customer second3 = new Customer("Mohammd", "Khan", 212);
        Customer third3 = new Customer("MR", "Khan", 31232);
        Customer fourth3 = new Customer("MR", "Khan", 31932);



        matrix.init(16);

        //adding objects to graph
        matrix.setValue(0, first);
        matrix.setValue(1, second);
        matrix.setValue(2, third);
        matrix.setValue(3, four);
        matrix.setValue(4, first1);
        matrix.setValue(5, second1);
        matrix.setValue(6, third1);
        matrix.setValue(7, four1);
        matrix.setValue(8, first2);
        matrix.setValue(9, second2);
        matrix.setValue(10, third2);
        matrix.setValue(11, four2);
        matrix.setValue(12, first3);
        matrix.setValue(13, second3);
        matrix.setValue(14, third3);
        matrix.setValue(15, fourth3);

        //getting the number of vertices
        System.out.println("Values in Graph: " + matrix.nodeCount());

        //edges
        System.out.println("Edges: " + matrix.edgeCount());

        System.out.println(" ");

        System.out.println("Values in Graph");
        //value at node with index
        for(int i = 0; i < matrix.nodeCount(); i++){

            System.out.println(matrix.getValue(i).getPhoneNum());

        }

        //adds an edge
        matrix.addEdge(0, 1, 1);
        matrix.addEdge(1, 1, 1);

        System.out.println(" ");

        //show how many edged
        System.out.println("Edges after adding: " + matrix.edgeCount());

        System.out.println(" ");

        //removes an edge
        matrix.removeEdge(0, 1);

        //prints what is in the edges
        System.out.println("Edges left: " + matrix.edgeCount());


        //checks if it has an edge at a position
        System.out.println("Has Edge: " + matrix.hasEdge(1, 1));

        //checks neighbours
        System.out.println("Value: " + 12);

    }

}
