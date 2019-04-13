package StacksAndQueues;

public class Driver {

    public static void main(String[] args){

        //Creating stack object
        Stack theStack = new Stack();

        //creating fruit objects to be placed in stack
        Fruit f1 = new Fruit("Banana", 21);
        Fruit f2 = new Fruit("Apple", 43);
        Fruit f3 = new Fruit("Pear", 64);
        Fruit f4 = new Fruit("Mango", 12);
        Fruit f5 = new Fruit("Orange", 144);
        Fruit f6 = new Fruit("Peach", 14);
        Fruit f7 = new Fruit("Melon", 143);

        //adding Fruit objects to stack
        theStack.push(f1);
        theStack.push(f2);
        theStack.push(f3);
        theStack.push(f4);
        theStack.push(f5);
        theStack.push(f6);
        theStack.push(f7);

        //printing out whats in the stack\
        theStack.print();

        //removing the last item put into the stack
        // the melon
        theStack.pop();

        //printing with the top element removed
        System.out.println("Top Element Removed");
        theStack.print();

        //deleting the entire stack
        theStack.deleteStack();

        //printing out empty stack
        theStack.print();


        //Creating Queue object
        Queue theQueue = new Queue();

        //adding Fruit objects to stack
        theQueue.add(f1);
        theQueue.add(f2);
        theQueue.add(f3);
        theQueue.add(f4);
        theQueue.add(f5);
        theQueue.add(f6);
        theQueue.add(f7);

        //printing out whats in the queue
        theQueue.print();

        //removing the first item put into the queue
        // the melon
        theQueue.remove();

        //printing with the top element removed
        System.out.println("First Element Removed");
        theQueue.print();

        //deleting the entire queue
        theQueue.deleteQueue();

        //printing out empty queue
        theQueue.print();

    }

}
