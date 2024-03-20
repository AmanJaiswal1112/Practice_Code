package com.interview.string;

//Given two sorted linked lists consisting of N and M nodes respectively.
// The task is to merge both of the lists (in place) and return the head of the merged list.

//Input: a: 5->10->15, b: 2->3->20
//Output: 2->3->5->10->15->20
//Input: a: 1->1, b: 2->4
//Output: 1->1->2->4

import java.util.List;

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}



public class MergeList {
    public static void main(String[] args) {

        ListNode l1  = new ListNode(5);
        l1.next = new ListNode(10);
        l1.next.next = new ListNode(15);


        ListNode l2  = new ListNode(2);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(20);


        List<Integer> mergeList  = merge(l1 , l2);
    }

    private static List<Integer> merge(ListNode l1, ListNode l2) {

        //take arraylist
        // read val from from l1 ad add into arraylist
        // read val from from l2 ad add into arraylist
        //sort the arrayList
        //loop the value
        

        return  null;
    }
}
