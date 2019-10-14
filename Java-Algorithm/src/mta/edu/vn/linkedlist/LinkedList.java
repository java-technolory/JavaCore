package mta.edu.vn.linkedlist;

public class LinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void storedInsert(Node new_node){
        Node current;

        if(head == null || head.data >= new_node.data){
            new_node.next = head;
            head = new_node;
        } else {
            current = head;
            while (current.next != null){

            }
        }
    }

}
