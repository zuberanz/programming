package singly_linked_lists;

public class Rotate_Lists {

    //pubic

    public static Node List_Rotate_ClockWise_K_nodes(Node head, int k){

        if(head == null || k == 0){
            return head;
        }

       // int size = get_List_Size(Node head);

        return new Node(12);

    }


    public static void main(String[] args){

      Node head = new Node();
      head = head.create_list_of_size(8);

      head = List_Rotate_ClockWise_K_nodes(head,2);




    }

}
