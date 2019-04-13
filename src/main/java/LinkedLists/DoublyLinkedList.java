package LinkedLists;

public class DoublyLinkedList {

    private static class Node{

        private Fruit data;
        private Node nextLink;
        private Node prevLink;


        public Node(Fruit data, Node nextLink, Node prevLink){

            this.data = data;
            this.nextLink = nextLink;
            this.prevLink = prevLink;

        }

        public Node(Fruit data){

            this.data = data;
            this.nextLink = null;
            this.prevLink = null;

        }
    }

    private Node head;
    private Node tail;
    private int size;


    public void addAtHead(Fruit data){

        Node newNode = new Node(data);

        if(size() == 0){

            tail = head = newNode;

        }

        else{

            head.prevLink = newNode;
            newNode.nextLink = head;

            head = newNode;

        }

        size++;

    }

    public void addToTail(Fruit data){

        Node newNode = new Node(data, null, null);

        if (size() == 0){

            head = tail = newNode;
        }

        else {

            newNode.prevLink = newNode;
            tail.nextLink = newNode;

            tail = newNode;

        }

        size++;

    }

    public Fruit removeHead() throws IllegalStateException{

        if(isEmpty()){

            throw new IllegalStateException("List Empty");

        }

        Fruit data = head.data;
        head = head.nextLink;

        if(head == null){

            tail = null;

        }

        else {

            head.prevLink = null;

        }

        size--;

        return data;

    }

    public boolean removeNode(Fruit data){

        Node current = head;

        if(current == null){

            return false;
        }

        if(current.data == data){

            head = head.nextLink;
            size--;

            if(current.data == data){

                head = head.nextLink;
                size--;

                if(head == null){

                    head.prevLink = null;

                }

                else {

                    tail = null;

                }

                return true;

            }
        }

        while(current.nextLink != null){

            if(current.nextLink.data == data){

                current.nextLink = current.nextLink.nextLink;

                if(current.nextLink == null){

                    tail = current;

                }
                size--;

                return true;
            }

            current = current.nextLink;

        }

        return false;

    }

    public int size(){

        return size;

    }

    public boolean isEmpty(){

        return size == 0;

    }

    public void print(){

        Node temp = head;

        if(isEmpty()){

            System.out.println("Empty Linked List");
            System.out.println(" ");

        }

        //headings
        System.out.println("Fruit        " + "# of Fruit");
        System.out.println("-------------------------");

        while (temp != null){

            System.out.print(temp.data.getFruitName() + "\t\t\t");
            System.out.println(temp.data.getNumberOfFruit() + "     ");

            temp = temp.nextLink;

        }

        System.out.println("-------------------------");
        System.out.println("Size: " + size());
        System.out.println(" ");


    }
    public void deleteList(){

        head = null;
        tail = null;
        size = 0;

    }


}
