package com.synechron;

import java.util.ArrayList;

public class CustomDataStructure {
    private ArrayList<Integer> data;
    private int start;

    public CustomDataStructure() {
        this.data = new ArrayList<>();
        this.start = 0;
    }

    // Push an element at the end
    public void push(int element) {
        data.add(element);
    }

    // Pop the element from the beginning
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("The data structure is empty.");
        }
        int element = data.get(start);
        start++;
        // Optional: Clean up memory if start is too large
        if (start > data.size() / 2) {
            data = new ArrayList<>(data.subList(start, data.size()));
            start = 0;
        }
        return element;
    }

    // Seek an element at index i
    public int seek(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        return data.get(start + i);
    }

    // Check if the data structure is empty
    public boolean isEmpty() {
        return start >= data.size();
    }

    // Get the size of the data structure
    public int size() {
        return data.size() - start;
    }

    public static void main(String[] args) {
        CustomDataStructure ds = new CustomDataStructure();
        ds.push(10);
        ds.push(20);
        ds.push(30);

        System.out.println(ds.seek(0)); // Output: 10
        System.out.println(ds.seek(1)); // Output: 20
        System.out.println(ds.seek(2)); // Output: 30

        System.out.println(ds.pop()); // Output: 10
        System.out.println(ds.pop()); // Output: 20

        ds.push(40);
        ds.push(50);

        System.out.println(ds.seek(0)); // Output: 30
        System.out.println(ds.seek(1)); // Output: 40
        System.out.println(ds.seek(2)); // Output: 50

        System.out.println(ds.pop()); // Output: 30
        System.out.println(ds.pop()); // Output: 40
        System.out.println(ds.pop()); // Output: 50
    }
}
