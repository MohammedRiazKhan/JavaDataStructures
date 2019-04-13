package Maps;

import java.util.Arrays;

public class MapImplementation<K, V> {

    private int size;
    private int DEF_CAPACITY = 6;

    private MapNode<K, V>[] values = new MapNode[DEF_CAPACITY];

    public V getKey(K key){

        for(int i = 0; i < size; i++){

            if(values[i] != null){

                if(values[i].getKey().equals(key));

            }

        }

        return null;
    }

    public void increaseCap(){

        if(size == values.length){

            int newSize = values.length * 2;
            values = Arrays.copyOf(values, newSize);

        }
    }

    public void reclaimSlot(int start){

        for (int j = start; j < size; j++){

            values[j] = values[j + 1];

        }

    }

    public void put(K key, V value){

        boolean insert = true;

        for (int k = 0; k < size; k++){
            if(values[k].getKey().equals(key)){

                values[k].setValue(value);
                insert = false;

            }

        }

        if(insert){

            increaseCap();
            values[size++] = new MapNode<K, V>(key, value);

        }
    }

    public void remove(K key){

        for(int l = 0; l < size; l++){

            if(values[l].getKey().equals(key)){

                values[l] = null;
                size--;
                reclaimSlot(l);

            }

        }
    }

    public void checkMarks(){

        String valueInKey ;

        for(int i = 0; i < values.length; i++){

             valueInKey = values[i].getValue().toString();

             int val = Integer.parseInt(valueInKey);

            if(val >= 75){

                System.out.println("Subject: " + values[i].getKey() + " " + values[i].getValue() + "%");

            }
            else if(val >= 50){

                System.out.println("Subject: " + values[i].getKey() + " " + values[i].getValue() + "%");


            }

            else {

                remove(values[i].getKey());

            }


        }



    }

    public void print(){

        for (int m = 0; m < size; m++){

            System.out.print("Key: " + values[m].getKey() + " Value: " + values[m].getValue() + "\n");

        }

    }

    public void getLowestMark(){

        System.out.println("0");

    }
}
