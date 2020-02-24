package trees;

import java.util.LinkedList;
import java.util.Stack;

public class tree_traversals_stack {

    public static void inorder_traversal_stack(Node tree) {

        if(tree == null){
            return;
        }
        Node current = tree;
        Stack<Node> stack = new Stack<>();

        //break while loop if anyone of the condition fails
        while( current!=null || !stack.isEmpty()){

            //as per preOrder we need to loop traverse uptill the last left node from current node
            while( current != null){
                //keep pushing left current node
                stack.push(current);
                //travese to next available left node
                current = current.left;

            }


            current = stack.pop();

            System.out.print(current.key+" ");

            current = current.right;


        }



    }
        public static void preorder_traversal_stack(Node tree){


            }

    public static void postOrder_traversal_2stacks(Node tree){
        if(tree==null){
            return;
        }
        Node current;
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(tree);
        while(! s1.isEmpty()) {

            current = s1.pop();
            s2.push(current);

            if (current.left != null) {
                s1.push(current.left);
            }
            if (current.right != null) {
                s1.push(current.right);
            }
        }

        while(! s2.isEmpty()){
            System.out.print(s2.pop().key+" ");
        }

    }







    public static void main(String[] args) throws InterruptedException {

        tree_learning tree = new tree_learning();

        tree.root = new Node(10);

        tree.root.left = new Node(5);
        tree.root.right = new Node(14);

        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(6);

        tree.root.right.left = new Node(12);
        tree.root.right.right = new Node(15);


        System.out.println("Inorder Traversal using stack ");
        inorder_traversal_stack(tree.root);
        System.out.println();
        System.out.println("Inorder Traversal using rec ");
        tree_learning.In_order_tree_print(tree.root);

        System.out.println();
        System.out.println("Post Traversal using stack ");
        System.out.println();
        postOrder_traversal_2stacks(tree.root);
        System.out.println();
        tree_learning.pre_order_tree_print(tree.root);




    }
}
