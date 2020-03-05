package trees;

public class Binary_Search_tree {



    public static Node construct_BST__recur(Node root,int n){

       if(root==null){
           root = new Node(n);
       }

       if(n < root.key){
           root.left = construct_BST__recur(root.left,n);
       }
       else if(n > root.key){
           root.right = construct_BST__recur(root.right,n);
       }

       return root;
    }


    public static Node construct_bst_iterative(Node tree,int n){
        Node root=tree,current=null, parent=null;
        if(tree==null){
            root = new Node(n);
            return root;
        }
        Node node = new Node(n);

        current = root;

        while(current!=null){
            parent = current;
            if(n < current.key){
                current=current.left;
            }else if(n > current.key){
                current=current.right;
            }
        }

        if(n<parent.key){
            parent.left=node;
        }
        if(n>parent.key){
            parent.right=node;
        }

        return root;

    }


    public static Node Search_A_Key_In_BST_iterative(Node root, int n){

        if(root==null){
            System.out.println("The tree is empty");
            return null;
        }

        while(root != null){
            if(n == root.key){
                System.out.println();
                System.out.println("Found the element "+ root.key);
                return root;
            }else if(n < root.key){
                root=root.left;
            }else if(n > root.key){
                root=root.right;
            }
        }
        System.out.println();
        System.out.printf("The Element [ %d ] is not present in the tree ",n);
        return null;

    }

    public static Node Search_A_Key_In_BST_recursively(Node root, int n){

        if(root==null){
            System.out.println();
            System.out.println(" The tree is empty or Element  not present ");
            return null;
        }

        if(n ==  root.key){
            System.out.println();
            System.out.println("Found the element "+ root.key);
            return root;
        }else if( n < root.key){
            return Search_A_Key_In_BST_recursively(root.left, n);
        }else{
            return Search_A_Key_In_BST_recursively(root.right,n);
        }

    }

    public static void main(String[] args){


        int[] arr = new int[]{10,8,6,15,5,12,9,14,7,16};
        Node root = null;

        System.out.println(" Constructing tree ITERATIVELY");
        for(int n : arr) {
             root = construct_bst_iterative(root,n);
        }
        System.out.println("pre-order traversal of the contructed tree ");
        tree_learning.pre_order_tree_print(root);
        root = null;



        int[] arr1 = new int[]{10,15,12,14,8,9,6,5,7,16};


        System.out.println(" Constructing tree ITERATIVELY");
        for(int n : arr) {
            root = construct_bst_iterative(root,n);
        }
        System.out.println("pre-order traversal of the contructed tree ");
        tree_learning.pre_order_tree_print(root);




         /*root = null;
        System.out.println(" Constructing tree Recursively");
        for(int n : arr) {
            root = construct_BST__recur(root,n);
        }
        System.out.println();
        System.out.println("pre-order traversal of the contructed tree ");
        tree_learning.pre_order_tree_print(root);


        int n= 6;
        System.out.println();
        System.out.printf("Searchin a key [ %d ] iteratively  in above BST : ",n);
        Search_A_Key_In_BST_iterative(root,n);
        System.out.printf("Searchin a key [ %d ] recursively  in above BST : ",n);
        Search_A_Key_In_BST_recursively(root,n);*/


    }


}
