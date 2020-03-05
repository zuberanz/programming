package singly_linked_lists;

import Arrays.Print_all_subarrays;
import sun.lwawt.macosx.CSystemTray;

import javax.sound.midi.Soundbank;

public class Create_Insert_Del_search_Linked_List {

    public static Node Insert_Node(Node head, int data){

        if(head==null){
            head = new Node(data);
            return head;
        }
        Node current = head;
        Node previous=null;
        while(current!=null){
            previous=current;
            current = current.next;
        }
        previous.next = new Node(data);
        return head;

    }

    public static Node Insert_Node_recur(Node head, int data){
        if(head == null){
            return new Node(data);
        }else{
            head.next = Insert_Node(head.next,data);
        }

        return head;
    }


    public static  void Print_List(Node head){
        if(head == null){
            System.out.println();
            return;
        }
        System.out.print(head.data+" ");
        Print_List(head.next);


    }

    public static Node Insert_at_Beginning(Node head, int data){
        if(head == null){
            return new Node(data);
        }
        Node current = new Node(data);
        current.next = head;
        return current;

    }

    public static Node Insert_at_Index(Node head,int index, int data){
        if(index < 0){
            System.out.println(" The index is invalid ,please input valid index");
            return head;
        }
        if(head == null && index > 0){
            System.out.println("The index should not be more than elements present");
            return head;
        }
        if(head == null && index == 0){
            return new Node(data);
        }
        if(index == 0){
            Node New_Node = new Node(data);
            New_Node.next = head;
            return New_Node;
        }

        head.next = Insert_at_Index(head.next,index-1,data);
        return head;

    }

    public static Node Insert_at_Index_Iterative(Node head, int index, int data){

            Node newNode = new Node(data);
            if(index < 0){
                System.out.println("Please input a valid postion");
                return head;
            }

            if(head==null && index > 0){
                System.out.println("Please input a valid postion");
                return head;
            }

            if(head==null && index==0){
                return newNode;
            }

            if(head!=null && index==0){
                newNode.next = head;
                return newNode;
            }

            int ctr=0;
            Node current=head;
            Node prev=head;
            while(current.next!=null){
                prev=current;
                current=current.next;
                if(++ctr == index){
                    break;
                }
            }

            if(ctr != index){
                System.out.println("Please input a valid postion");
                return head;
            }

            prev.next = newNode;
            newNode.next = current;

            return head;
    }

    public static Node delete_LastNode_iterative(Node head){
        if(head == null || head.next==null){
            System.out.println("The given list is empty");
            return null;
        }
        Node current = head;
        Node prev = head;
        while(current.next != null){
            prev = current;
            current = current.next;
        }

        prev.next=null;
        return head;

    }

   public static Node delete_first_node(Node head){
        if(head == null || head.next == null ){
            return head;
        }

        Node next_node = head.next;
        head  = null;

        return next_node;

   }

   public static Node delete_at_given_position(Node head, int index){

        if(head ==  null ){
            System.out.println("List is empty");
            return null;
        }

        if(index == 0){
            return head.next;
        }

        int ctr = 0;
        Node current = head;
        Node prev=head;
        while(current.next != null){
            prev = current;
            current=current.next;
            if(++ctr == index){
                break;
            }
        }

        if(ctr != index){
            System.out.println("Invalid position");
            return head;
        }
        if(current.next == null) {
            prev.next = null;
        }else{
            prev.next=current.next;
        }

        return head;


   }

   public static Node delete_at_index_recur(Node head, int index){
        if(index < 0){
            System.out.println("invalid postion");
            return head;
        }

        if(head==null && index > 0){
            System.out.println("invalid postion");
            return head;
        }

        if(index == 0){
            return head.next;
        }

        head.next = delete_at_index_recur(head.next,index-1);
        return head;
   }

   public static int size_of_list_recur(Node head){
        if(head==null){
            return 0;
        }

        return 1 + size_of_list_recur(head.next);
   }

   public static boolean is_element_present(Node head ,int element){
        if(head==null){
            return false;
        }

        if(head.data == element){
            return true;
        }

        return is_element_present(head.next,element);

   }


    public static void main(String[] args){

        Node head = null;
        head = Insert_Node_recur(head,12);
        head = Insert_Node_recur(head,14);
        head = Insert_Node_recur(head,15);
        Print_List(head);
        head = Insert_at_Beginning(head,1);
        Print_List(head);
        head = Insert_at_Index(head,2,13);
        Print_List(head);
        head = Insert_at_Index(head,6,16);
        Print_List(head);
        head = Insert_at_Index(head,5,16);
        Print_List(head);

        System.out.println("Iterative insertion");
        head = Insert_at_Index_Iterative(head,0,0);
        Print_List(head);
        head = Insert_at_Index_Iterative(head,2,2);
        Print_List(head);
        head = Insert_at_Index_Iterative(head,20,23);
        Print_List(head);

        System.out.println("Deleting Last Node");
        head = delete_LastNode_iterative(head);
        Print_List(head);
        System.out.println("Deleting First Node");
        head = delete_first_node(head);
        Print_List(head);
        head = delete_at_given_position(head,7);
        Print_List(head);
        head = delete_at_index_recur(head,0);
        Print_List(head);
        System.out.println(size_of_list_recur(head));
        System.out.println("Searching an Element");
        System.out.println(is_element_present(head,104));



    }


}
