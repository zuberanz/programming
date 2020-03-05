package trees;

import java.util.Stack;

public class Size_of_Binary_Tree {



    public static int size_of_tree(Node node){

        if(node == null){
            return 0;
        }else{
            return (size_of_tree(node.left)) + 1 + size_of_tree(node.right);
        }
    }


    public static int size_of_tree_iterative(Node root){
        int size=0;
        Node current;
        Stack<Node>  s = new Stack<>();
        s.push(root);
        while(! s.isEmpty()){

            current = s.pop();
            size++;
            if(current.left!=null){
                s.push(current.left);
            }
            if(current.right!=null){
                s.push(current.right);
            }
        }

        return size;

    }






    public static void main(String[] args){
        tree_learning tree =  new tree_learning();

        tree.root = new Node(10);

        tree.root.left = new Node(5);
        tree.root.right = new Node(14);

        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(6);

        tree.root.right.left = new Node(12);
        tree.root.right.right = new Node(15);

        System.out.print("Pre Order Traversal : ");
        tree_learning.pre_order_tree_print(tree.root);

        System.out.println("size of the tree : "+size_of_tree(tree.root));
        System.out.println("size of the tree : "+size_of_tree_iterative(tree.root));


    }
}
