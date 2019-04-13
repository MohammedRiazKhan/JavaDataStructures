package LinkedLists;

public class DoublyCircularLinkedList {

    private static class Node {

        private Fruit data;
        private Node nextLink;
        private Node prevLink;

        public Node(Fruit data, Node next, Node prev) {

            this.data = data;
            this.nextLink = next;
            this.nextLink = prev;

        }

        public Node(Fruit data) {

            this.data = data;
            this.nextLink = this;
            this.prevLink = this;
        }

    }

    private Node head = null;
    private Node tail = null;
    private int size;

    public int size() {

        return size;

    }

    public boolean isEmpty() {

        return size == 0;

    }

    public void addAtHead(Fruit data){

        Node newNode = new Node(data, null, null);

        if(size() == 0){

            tail = head = newNode;

            newNode.nextLink = newNode;
            newNode.prevLink = newNode;

        }

        else{

            newNode.nextLink = head;
            newNode.prevLink = head.prevLink;

            head.prevLink = newNode;

            newNode.prevLink.nextLink = newNode;

            head = newNode;

        }

        size++;

    }

    public void addToTail(Fruit data) {

        Node newNode = new Node(data, null, null);

        if (size() == 0) {

            head = tail = newNode;
            newNode.nextLink = newNode;
            newNode.prevLink = newNode;

        }

        else {

            newNode.nextLink = tail.nextLink;
            newNode.prevLink = tail;
            tail.nextLink = newNode;
            newNode.nextLink.prevLink = newNode;
            tail = newNode;

        }

        size++;

    }

    public Fruit peek() {

        if (isEmpty()){

            throw new IllegalStateException("Empty List Exception");

        }

        return head.data;
    }

    public Fruit deleteHead(){

        if(size() == 0){

            throw new IllegalStateException("List is empty");

        }

        Fruit data = head.data;
        size--;

        if(size() == 0){

            head = null;
            tail = null;
            return data;
        }

        Node nextNode = head.nextLink;
        nextNode.prevLink = tail;

        tail.nextLink =nextNode;

        head = nextNode;

        return data;


    }

    public Fruit deleteNode(Fruit data){


        return data;
    }

    public void deleteList(){


    }

    public Fruit deleteTail(){

        if(size() == 0){

            throw  new IllegalStateException("List is empty");

        }

        Fruit data = tail.data;
        size--;

        if(size() == 0){

            head = null;
            tail = null;

            return data;

        }

        Node prevNode = tail.prevLink;
        prevNode.nextLink = head;
        head.prevLink = prevNode;
        tail = prevNode;

        return data;

    }

    public void print() {

        if(isEmpty()){

            return;

        }

        Node temp = head;

        while (temp != null) {

            System.out.println("Fruit Name: " + temp.data.getFruitName() + ", " + " No. of Fruit Available: "  + temp.data.getNumberOfFruit());

            temp = temp.nextLink;
        }
    }

}
