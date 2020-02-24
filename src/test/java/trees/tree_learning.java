package trees;

import sun.jvm.hotspot.utilities.Interval;

import java.util.Random;
import java.util.Stack;



public class tree_learning {

    //root of the binary tree
    Node root;

    //constructor
    public tree_learning(int item){
        root = new Node(item);
    }

    public tree_learning(){
        root = null;
    }

    //preorder  =  nlr
    public static void pre_order_tree_print(Node tree){
        if(tree == null){
            return;
        }
        System.out.print(tree.key+ " ");
        pre_order_tree_print(tree.left);
        pre_order_tree_print(tree.right);

    }


    //inorder  =  lnr
    public static void In_order_tree_print(Node tree){
        if(tree == null){
            return;
        }
        In_order_tree_print(tree.left);
        System.out.print(tree.key+ " ");
        In_order_tree_print(tree.right);

    }

    //postorder  =  lrn
    public static void Post_order_tree_print(Node tree){
        if(tree == null){
            return;
        }
        Post_order_tree_print(tree.left);
        Post_order_tree_print(tree.right);
        System.out.print(tree.key+ " ");

    }

    public static void InorderByStack(Node tree){

        if(tree == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node current = tree;

        while( current != null || stack.size() != 0) {


            //reaching the left most node in the tree
            while (current != null) {
                stack.push(current);
                current = current.left;

            }


            //here the current must be null so go back to non-null node
            current = stack.pop();
            //print the value of the node
            System.out.print(current.key + " ");

            //now at this point we have traversed all the left nodes
            //now its right subtree turn
            current = current.right;
        }
    }

    public static int print_sum_of_all_nodes(Node tree){
        if(tree == null){
            return 0;
        }

        return tree.key + print_sum_of_all_nodes(tree.left) + print_sum_of_all_nodes(tree.right);

    }

    public static int print_difference_odd_even_level(Node tree){
        if(tree == null){
            return 0;
        }

        return tree.key - print_difference_odd_even_level(tree.left) - print_difference_odd_even_level(tree.right);

    }

    public static void main(String[] args) throws InterruptedException {

        tree_learning tree =  new tree_learning();

        tree.root = new Node(10);

        tree.root.left = new Node(5);
        tree.root.right = new Node(14);

        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(6);

        tree.root.right.left = new Node(12);
        tree.root.right.right = new Node(15);



        System.out.print("Pre Order Traversal : ");
        pre_order_tree_print(tree.root);
        System.out.println();
        System.out.print("In Order Traversal : ");
        In_order_tree_print(tree.root);
        System.out.println();
        System.out.print("Post Order Traversal : ");
        Post_order_tree_print(tree.root);
        System.out.println();

        System.out.println("In order traversal by using a stack");
        InorderByStack(tree.root);
        System.out.println("In order traversal by using a stack");
        InorderByStack(tree.root);
        System.out.println();
        System.out.println("Sum of all nodes in the tree : "+print_sum_of_all_nodes(tree.root));
        System.out.println();
        System.out.println("Diff of odd and even level nodes in the tree : "+print_difference_odd_even_level(tree.root));


    }



}
