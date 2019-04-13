package StacksAndQueues;

public class Queue {

    private static class Node{

        private Fruit data;
        private Node next;

        public Node(Fruit f, Node n){

            data = f;
            next = n;

        }

    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public boolean isEmpty(){

        return size == 0;

    }

    public int size(){

        return size;

    }

    public void add(Fruit data){

        Node temp = new Node(data, null);

        if(head == null){

            head = tail = temp;

        }
        else {

            tail.next = temp;
            tail = temp;

        }
        size++;
    }

    public Fruit remove() throws IllegalStateException{

        if(isEmpty()){
            throw new IllegalStateException("Queue Empty");
        }

        Fruit value = head.data;

        head = head.next;

        size--;

        return value;

    }


    public void deleteQueue(){

        head = null;
        size = 0;
        tail = null;

    }

    public void print(){

        //will display if stack is empty
        if(isEmpty()){

            System.out.println("Queue is Empty!");
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
            temp = temp.next;

        }

        System.out.println(" ");

    }
}
