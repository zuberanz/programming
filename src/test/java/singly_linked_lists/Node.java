package singly_linked_lists;

public class Node {

    public int data;
    public Node next;

    public Node() {
    }

    public Node(int data){
        this.data=data;
        next = null;
    }

    public Node create_list_of_size(int size){
        Node head = new Node(1);
        Node temp =head;

        for(int i=1;i<size;i++){
            temp.next = new Node(i+1);
            temp = temp.next;
        }
        return head;

    }


}
