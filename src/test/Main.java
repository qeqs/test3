package test;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }

    public static int getLevelSum(Node root, int N) {
        /*
          Please implement this method to
          traverse the tree and return the sum of the values (Node.getValue()) of all nodes
          at the level N in the tree.
          Node root is assumed to be at the level 1. All its children are level 2, etc.
         */

        if(N<=0)
            throw new IllegalArgumentException();
        if(root==null)
            throw  new NullPointerException();
        if(N ==1)
            return root.getValue();
        int sum = 0;
        for (Node node:root.getChildren()) {
            sum+=getLevelSum(root,N-1);
        }



        return  sum;
    }

}
