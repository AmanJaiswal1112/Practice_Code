package com.synechron;

public class CustomDeque<T> {
    private Node<T> head;
    private Node<T> tail;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
        }
    }

    public CustomDeque() {
        head = null;
        tail = null;
    }

    // Push an element at the end of the deque
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Pop an element from the beginning of the deque
    public T pop() {
        if (head == null) {
            throw new IllegalStateException("Deque is empty");
        }
        T data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        return data;
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Peek the element at the beginning of the deque without removing it
    public T peek() {
        if (head == null) {
            throw new IllegalStateException("Deque is empty");
        }
        return head.data;
    }

    public static void main(String[] args) {
        CustomDeque<Integer> deque = new CustomDeque<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println("Pop: " + deque.pop()); // Output: Pop: 1
        System.out.println("Pop: " + deque.pop()); // Output: Pop: 2
        deque.push(4);
        System.out.println("Pop: " + deque.pop()); // Output: Pop: 3
        System.out.println("Pop: " + deque.pop()); // Output: Pop: 4
    }
}
