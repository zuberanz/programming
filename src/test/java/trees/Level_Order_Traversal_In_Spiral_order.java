package trees;

import java.util.Stack;

public class Level_Order_Traversal_In_Spiral_order {


    public static void level_order_in_spiral_order_2stacks(Node root){
        if(root == null){
            return;
        }
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty()){

            while(!s1.isEmpty()){
                root = s1.pop();
                System.out.print(root.key+ " ");
                if(root.left!=null){
                    s2.push(root.left);
                }
                if(root.right!=null){
                    s2.push(root.right);
                }
            }

            while(!s2.isEmpty()){
                root = s2.pop();
                System.out.print(root.key+ " ");
                if(root.right!=null){
                    s1.push(root.right);
                }
                if(root.left!=null){
                    s1.push(root.left);
                }
            }
        }




    }



    public static void main(String[] args) {


        tree_learning tree =  new tree_learning();

        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);

        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(11);

        tree_learning.pre_order_tree_print(tree.root);
        System.out.println();
        level_order_in_spiral_order_2stacks(tree.root);

    }
}
