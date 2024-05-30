package com.synechron;

import java.util.LinkedList;

public class CustomHashSet<T> {
    private static final int INITIAL_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;

    private LinkedList<T>[] buckets;
    private int size = 0;
    private int threshold;

    public CustomHashSet() {
        buckets = new LinkedList[INITIAL_CAPACITY];
        threshold = (int) (INITIAL_CAPACITY * LOAD_FACTOR);
    }

    public boolean add(T value) {
        if (contains(value)) {
            return false;
        }

        if (size >= threshold) {
            resize();
        }

        int index = getIndex(value);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        buckets[index].add(value);
        size++;
        return true;
    }

    public boolean contains(T value) {
        int index = getIndex(value);
        LinkedList<T> bucket = buckets[index];
        if (bucket == null) {
            return false;
        }
        return bucket.contains(value);
    }

    public boolean remove(T value) {
        int index = getIndex(value);
        LinkedList<T> bucket = buckets[index];
        if (bucket == null || !bucket.remove(value)) {
            return false;
        }
        size--;
        return true;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int getIndex(T value) {
        return (value.hashCode() & 0x7FFFFFFF) % buckets.length;
    }

    private void resize() {
        LinkedList<T>[] oldBuckets = buckets;
        buckets = new LinkedList[oldBuckets.length * 2];
        size = 0;
        threshold = (int) (buckets.length * LOAD_FACTOR);

        for (LinkedList<T> bucket : oldBuckets) {
            if (bucket != null) {
                for (T value : bucket) {
                    add(value);
                }
            }
        }
    }

    public static void main(String[] args) {
        CustomHashSet<Integer> set = new CustomHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("Set size: " + set.size()); // Output: Set size: 3
        System.out.println("Contains 2? " + set.contains(2)); // Output: Contains 2? true
        set.remove(2);
        System.out.println("Contains 2 after removal? " + set.contains(2)); // Output: Contains 2 after removal? false
        System.out.println("Set size after removal: " + set.size()); // Output: Set size after removal: 2
    }
}
