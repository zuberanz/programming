package trees;

import java.util.ArrayList;
import java.util.List;

public class Root_To_Leaf_Sum {

    public static boolean root_to_leaf_sum(Node root, int n, List<Integer> path){

        if(root==null){
            return false;
        }

       //base case where we check if the node is the leaf node
        if(root.left ==  null && root.right == null){
            if(root.key ==  n){
                path.add(root.key);
                return true;
            }else{
                return false;
            }
        }

        //case1: where we go to all left nodes
        if(root_to_leaf_sum(root.left, n - root.key, path)){
            path.add(root.key);
            return true;
        }

        //case2 : where we go to all right nodes
        if(root_to_leaf_sum(root.right,n - root.key, path)){
            path.add(root.key);
            return true;
        }


            return false;


    }




    public static void main(String[] args) {
        tree_learning tree = new tree_learning();

        tree.root = new Node(10);

        tree.root.left = new Node(5);
        tree.root.right = new Node(14);

        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(6);

        tree.root.right.left = new Node(12);
        tree.root.right.right = new Node(15);

        System.out.print("Pre Order Traversal : ");
        tree_learning.pre_order_tree_print(tree.root);
        System.out.println();
        List<Integer> path = new ArrayList<>();
        int sum = 21;
        if( root_to_leaf_sum(tree.root,sum,path)){
            System.out.printf(" Sum : %d exits in below path of the given tree",sum);
            System.out.println();
            for(int n  : path){
                System.out.print(n + "->");
            }
        }else{
            System.out.println("no path exists in the tree  for the sum : " +sum);
        }


    }
}
