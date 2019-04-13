package LinkedLists;

public class CircularLinkedList {

    private static class Node{

        private Fruit data;
        private Node nextLink;

        public Node(Fruit data, Node next){

            this.data = data;
            this.nextLink = next;

        }

        public Node(Fruit data){

            this.data = data;
            this.nextLink = null;

        }

    }

    private Node tail;
    private int size;
    private Node first = null;

    public int size(){

        return size;

    }

    public boolean isEmpty(){

        return size == 0;

    }

    public Fruit peek(){

        if(isEmpty()){

            throw
                    new IllegalStateException("Empty List Exception");
        }

        return tail.nextLink.data;
    }

    public void addAtHead(Fruit data){

        Node temp = new Node(data, null);

        if(isEmpty()){

            tail = temp;
            temp.nextLink = temp;

        }

        else {

            temp.nextLink = tail.nextLink;
            tail.nextLink = temp;

        }

        size++;
    }

    public void addToTail(Fruit data){

        Node temp = new Node(data, null);

        if(isEmpty()){

            tail = temp;
            temp.nextLink = temp;

        }

        else {

            temp.nextLink = tail.nextLink;
            tail.nextLink = temp;
            tail = temp;

        }

        size++;
    }

    public Fruit removeHead() throws IllegalStateException{

        if(isEmpty()){

            throw new IllegalStateException("List is Empty");

        }

        Fruit data = tail.nextLink.data;

        if(tail == tail.nextLink){

            tail = null;

        }

        else {

            tail.nextLink = tail.nextLink.nextLink;

        }

        size--;

        return data;
    }


    public void deleteList(){

        tail = null;
        size = 0;

    }

    public boolean removeNode(Fruit data) {

        if (isEmpty()){
            return false;
        }

        Node prev = tail;

        Node current = tail.nextLink;

        Node head = tail.nextLink;

        if (current.data == data) {

            if (current == current.nextLink){

                tail = null;

            }

            else{


                tail.nextLink = tail.nextLink.nextLink;
            }

            return true;

        }

        prev = current;

        current = current.nextLink;

        while (current != head) {

            if (current.data == data) {

                if (current == tail){

                    tail = prev;

                }

                prev.nextLink = current.nextLink;

                return true;
            }

            prev = current;

            current = current.nextLink;

        }

        return false;

    }

    public void print() {
        if(isEmpty()){

            System.out.println("Empty Linked List");
            System.out.println(" ");

        }

        //headings
        System.out.println("Fruit        " + "# of Fruit");
        System.out.println("-------------------------");

        Node temp = tail.nextLink;

        while (temp != null) {

            System.out.print(temp.data.getFruitName() + "\t\t\t");
            System.out.println(temp.data.getNumberOfFruit() + "     ");

            temp = temp.nextLink;

            if(temp == first)
                break;


        }

        System.out.println("-------------------------");
        System.out.println("Size: " + size());
        System.out.println(" ");
    }
}
