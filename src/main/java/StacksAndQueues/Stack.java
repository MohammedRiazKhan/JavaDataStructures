package StacksAndQueues;

public class Stack {

    //stack using a linked list
    public static class Node{

        private Fruit data;
        private Node nextLink;

        public Node(Fruit data, Node nextLink){

            this.data = data;
            this.nextLink = nextLink;

        }

    }

    private Node head = null;
    private int size = 0;

    //adding an element to the list
    public void push(Fruit data){

        //creates a new object and adds it to the head
        head = new Node(data, head);

        //increases the size of the list
        size++;

    }

    //removing an element from the list
    public Fruit pop() throws IllegalStateException{

        //if list is empty an exception is thrown
        if(isEmpty()){

            throw new IllegalStateException("Stack is Empty");

        }

        //a fruit object is created and the data
        // is stored in the head
        Fruit data = head.data;

        //sets the value of the next link to the head
        //moving the position of the deleted node
        head = head.nextLink;

        //decreasing the size of the list
        size--;

        return data;

    }

    public void deleteStack(){

        size = 0;
        head = null;

    }

    public boolean isEmpty() {

        return size == 0;

    }

    public int getSize() {

        return size;

    }

    public void print(){

        //will display if stack is empty
        if(isEmpty()){

            System.out.println("Stack is Empty!");
            System.out.println(" ");

        }

        //setting whatever is in the head to a temp value
        Node temp = head;

        //headings
        System.out.println("Fruit        " + "# of Fruit");
        System.out.println("-------------------------");
        //while whatever is in the temp isn't null (the list is empty)
        //it will loop
        while (temp != null){

            System.out.print(temp.data.getFruitName() + "\t\t\t");
            System.out.println(temp.data.getNumberOfFruit() + "     ");

            //sets temp to whatever is next in the list
            temp = temp.nextLink;

        }

        System.out.println(" ");

    }

}
