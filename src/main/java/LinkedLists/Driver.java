package LinkedLists;

public class Driver {


    public static void main(String[] args){

        //adding hardcoded information to the list
        Fruit f1 = new Fruit("Banana", 21);
        Fruit f2 = new Fruit("Apple", 43);
        Fruit f3 = new Fruit("Pear", 64);
        Fruit f4 = new Fruit("Mango", 12);
        Fruit f5 = new Fruit("Orange", 144);
        Fruit f6 = new Fruit("Peach", 14);
        Fruit f7 = new Fruit("Melon", 143);

        //creating singly linked list
        SinglyLinkedList sList = new SinglyLinkedList();

        //adding values at the head
        sList.addAtHead(f1);
        sList.addAtHead(f2);
        sList.addAtHead(f3);
        sList.addAtHead(f4);
        sList.addAtHead(f5);
        sList.addAtHead(f6);
        sList.addAtHead(f7);

        //list full
        System.out.println("---Full List---");
        sList.print();

        //removing the value at the head
        System.out.println("---After Head Removed---");
        sList.removeHead();
        sList.print();

        //deleting the node
        System.out.println("---After Head Removed---");
        sList.deleteNode(f7);
        sList.print();

        //deleting list
        sList.deleteList();

        //printing out list
        sList.print();



        //creating doubly list
        DoublyLinkedList dList = new DoublyLinkedList();

        //adding values at the head
        dList.addAtHead(f1);
        dList.addAtHead(f2);
        dList.addAtHead(f3);
        dList.addAtHead(f4);
        dList.addAtHead(f5);
        dList.addAtHead(f6);
        dList.addAtHead(f7);

        //list full
        System.out.println("---Full List---");

        dList.print();

        //removing the value at the head
        System.out.println("---After Head Removed---");

        dList.removeHead();
        dList.print();

        //deleting the node
        System.out.println("---After Head Removed---");
        dList.removeNode(f7);
        dList.print();

        //deleting list
        dList.deleteList();

        //printing out list
        dList.print();

        //creating doubly list
        CircularLinkedList cList = new CircularLinkedList();

        //adding values at the head
        cList.addAtHead(f1);
        cList.addAtHead(f2);
        cList.addAtHead(f3);
        cList.addAtHead(f4);
        cList.addAtHead(f5);
        cList.addAtHead(f6);
        cList.addAtHead(f7);

        //list full
        System.out.println("---Full List---");
        cList.print();

        //removing the value at the head
        System.out.println("---After Head Removed---");
        cList.removeHead();
        cList.print();

        //deleting the node
        System.out.println("---After Head Removed---");
        cList.removeNode(f7);
        cList.print();

        //deleting list
        cList.deleteList();

        //printing out list
        cList.print();

        //creating doubly list
        DoublyCircularLinkedList dcList = new DoublyCircularLinkedList();

        //adding values at the head
        dcList.addAtHead(f1);
        dcList.addAtHead(f2);
        dcList.addAtHead(f3);
        dcList.addAtHead(f4);
        dcList.addAtHead(f5);
        dcList.addAtHead(f6);
        dcList.addAtHead(f7);

        //list full
        System.out.println("---Full List---");
        dcList.print();

        //removing the value at the head
        System.out.println("---After Head Removed---");
        dcList.deleteHead();
        dcList.print();

        //deleting the node
        System.out.println("---After Head Removed---");
        dcList.deleteNode(f7);
        dcList.print();

        //deleting list
        dcList.deleteList();

        //printing out list
        dcList.print();





    }


}
