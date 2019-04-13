package LinkedLists;

public class Fruit {


    private String fruitName;
    private int numberOfFruit;


    public Fruit(String fruitName, int numberOfFruit){

        this.fruitName = fruitName;
        this.numberOfFruit = numberOfFruit;

    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getNumberOfFruit() {
        return numberOfFruit;
    }

    public void setNumberOfFruit(int numberOfFruit) {
        this.numberOfFruit = numberOfFruit;
    }

}
