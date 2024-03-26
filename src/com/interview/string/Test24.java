package com.interview.string;
class LinkedList{
    private static Node head;
    public LinkedList() {
        head=null;
    }

    public static void addFront(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
            return;
        }

        node.next = head;

        node.prev =null;
        head = node;
    }

    public void delete( int index){
        if(head == null){
            System.out.println("emptly");
            return;
        }


        if(index == 0){
            Node curr = head.next;
             curr.prev = null;
             head = curr;
        }

        Node curr = head;
        Node temp = head;
        Node prev = null;
        int count = 0;

        while(index != count){
            curr = curr.next;
            curr.prev = temp;
            count++;
            temp = temp.next;
        }

        curr = curr.next;
        temp.prev =curr;

    }

    public  void display(){
        Node curr = head;
        while(curr!=null){
          //  System.out.print(curr.prev+"->"+curr.data+"->"+curr.next);
            System.out.print(curr);
            curr = curr.next;
        }
      //  System.out.println();
    }

    static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    ", prev=" + prev +
                    '}';
        }

        public void add(int data){
            Node node = new Node(data);

            if(head == null){
                head = node;
                return;
            }

            Node curr = head;

            while(curr.next != null ){
                curr = curr.next;
            }
            curr.next = node;
        }
    }
}


public class Test24 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFront(4);
        linkedList.addFront(5);

        linkedList.delete(0);
        linkedList.display();
    }


}