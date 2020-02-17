package trees;

public class Tree_Construction {

    static int pre_index;
     Node build_Tree(int[] in, int[] pre, int start_index, int end_index){
        Index
        Node current_node=null;

        if(start_index>end_index){
            return null;
        }

        // pick the root node from pre_order traversal by using pre_index and keep incrementing
        current_node = new Node(pre[pre_index++]);


        //here this condition checks if the current node doest have any child then just return the node
        //left and right node will be null
        if(start_index == end_index){
            return current_node;
        }

        //now we need to construct rigght and left node, for this we need the in order traversal to fins
        //right and left nodes, we get the index of root node from inorder
        int in_order_index =  search(in, start_index,end_index,current_node.key);


        // by using the index info from the in_order traversal we can go ahead and build left and right nodes

        //here since we know that before the root node all elements are left subtree so
        //we send range fron start till in_order_index-1
        current_node.left = build_Tree(in,pre,start_index,in_order_index-1);

        //here we know that all elements after root node in in-order belongs to right subtree
        //so we send the range from in_order_index+1 till end_index
        current_node.right = build_Tree(in,pre,in_order_index+1, end_index);

        return current_node;
    }


    int search(int[] in, int start_index, int end_index, int value){
        int i=0;
        for( i = start_index; i <= end_index; i++){
            if(in[i] ==  value){
                return i;
            }
        }
        return i;
    }







    public static void main(String[] args){

        Tree_Construction constTree = new Tree_Construction();
        int[] in_order = new int[] {2,5,6,10,12,14,15};
        int[] pre_order = new int[] {10,5,2,6,14,12,15};

        Node tree =constTree.build_Tree(in_order,pre_order,0,in_order.length-1);

        System.out.print("Pre Order Traversal : ");
        tree_learning.pre_order_tree_print(tree);
        System.out.println();
        System.out.print("In Order Traversal : ");
        tree_learning.In_order_tree_print(tree);
        System.out.println();

    }


}
