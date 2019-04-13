package Trees;

public class Main {

    public static void main(String[] args){

        CustomerBinaryTree cBTree = new CustomerBinaryTree();

        Customer c = new Customer("Riaz", "Khan", 1);
        Customer d = new Customer("A", "Khan", 44);
        Customer e = new Customer("B", "Khan", 14);
        Customer f = new Customer("C", "Khan", 22);
        Customer g = new Customer("D", "Khan", 100);
        Customer h = new Customer("F", "Khan", 17);
        Customer i = new Customer("G", "Khan", 19);
        Customer j = new Customer("H", "Khan", 23);
        Customer k = new Customer("I", "Khan", 26);
        Customer l = new Customer("J", "Khan", 2);

        //add nodes
        cBTree.add(c);
        cBTree.add(d);
        cBTree.add(e);
        cBTree.add(f);
        cBTree.add(g);
        cBTree.add(h);
        cBTree.add(i);
        cBTree.add(j);
        cBTree.add(k);
        cBTree.add(l);


        //print nodes
        System.out.println("Customer Age Before Deletion of one node");
        cBTree.printNodes(cBTree.root);
        System.out.println("\n");

        //delete node
        cBTree.delete(g);

        System.out.println("Customer Age After Deletion of one node");
        cBTree.printNodes(cBTree.root);
        System.out.println("\n");

        //traverse in pre order
        System.out.println("Traversing Tree - Pre order");
        cBTree.traversePreOrder(cBTree.root);
        System.out.println("\n");

        //traverse in order
        System.out.println("Traversing Tree - In order");
        cBTree.traverseInOrder(cBTree.root);
        System.out.println("\n");

        //post order
        System.out.println("Traversing Tree - Post order");
        cBTree.traversePostOrder(cBTree.root);
        System.out.println("\n");

        //check if tree contains a node
        System.out.print("Checks if tree contains value 1: ");
        System.out.println(cBTree.containsNode(c));
        System.out.println(" ");

        //returns size of tree
        System.out.print("Size:  -1 -2 -3-4 -5 -6 -7 -8 -9 -10\n");
        System.out.print("Data:  ");
        cBTree.printNodes(cBTree.root);

        System.out.println("\n");
        System.out.println("Size = " + cBTree.size());


    }

}
