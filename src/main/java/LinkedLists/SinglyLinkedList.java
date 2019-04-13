package LinkedLists;

public class SinglyLinkedList {

    //inner class
    private static class Node{

        private Fruit data;
        private Node nextLink;


        public Node(Fruit data, Node nextLink){

            this.data = data;
            this.nextLink = nextLink;

        }

        public Node(Fruit data){

            this.data = data;
            this.nextLink = null;

        }

    }


    private Node head;
    private int size;

    public int size(){

        return size;

    }

    public boolean isEmpty(){

        return size == 0;

    }

    public void addAtHead(Fruit data){

        head = new Node(data, head);
        size++;

    }

    public Fruit removeHead() throws IllegalStateException{

        if(isEmpty()){

            throw  new IllegalStateException("List is empty");

        }

        Fruit data = head.data;

        head = head.nextLink;

        size--;

        return data;


    }

    public void addToTail(Fruit data){

        Node newNode = new Node(data);

        Node curr = head;

        if(head == null){

            head = newNode;

        }

        while (curr.nextLink != null){


            curr = curr.nextLink;

        }

        curr.nextLink = newNode;


    }

    public boolean deleteNode(Fruit deleteData){

        Node temp = head;

        if(isEmpty()){

            return false;

        }

        if(deleteData == head.data){

            head = head.nextLink;
            size--;
            return true;
        }

        while(temp.nextLink != null){

            if(temp.nextLink.data == deleteData){

                temp.nextLink = temp.nextLink.nextLink;
                size--;

                return true;

            }

            temp = temp.nextLink;

        }

        return false;

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
        size = 0;

    }


}
