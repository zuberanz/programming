package trees;

public class Height_of_Tree {



    public static int tree_height(Node root){

        int height;

        if(root == null){
            return 0;
        }

        int left = tree_height(root.left);
        int right = tree_height(root.right);

        if(left > right){
            height = 1+left;
        }else{
            height = 1+right;
        }

        return height;
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


        System.out.println(tree_height(tree.root));


        }
    }
