package com.synechron;

import java.util.Arrays;

public class CustomArrayList<T>{
    private static final int INITIAL_CAPACITY = 2;
    private Object[] elemnets;
    private int size = 0;

    public CustomArrayList() {
        elemnets = new Object[INITIAL_CAPACITY];
    }

    public void add(T elemnet){
        checkCapacity();
        elemnets[size++] = elemnet;
    }

    private T get(int index) {
        checkIndex(index);
       return (T) elemnets[index];
    }

    private void clear(){
        for(int i= 0 ; i < size ; i++){
            elemnets[i] = null;
        }
        size = 0;

       // elemnets = new Object[INITIAL_CAPACITY];
    }

    private boolean isEmpty()
    {
        return size == 0;
    }

    private int size()
    {
        return size;
    }

    private void checkIndex(int index) {
        if(index >= size){
            throw new IndexOutOfBoundsException(index);
        }
    }

    private void checkCapacity() {
        if(size == elemnets.length){
            int newCapacity = elemnets.length*2;

            elemnets = Arrays.copyOf(elemnets, newCapacity);
        }
    }

    public static void main(String[] aererp){
        CustomArrayList<Integer> list = new CustomArrayList<>();
//Add operation
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        //check list empty or not
        list.isEmpty();

        // check size of list
        list.size();

        //Find Obj at perticular index
        list.get(2);

        // clear the list
        list.clear();
    }


}


