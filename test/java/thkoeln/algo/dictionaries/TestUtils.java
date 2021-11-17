package thkoeln.algo.dictionaries;

import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTreeNode;

public class TestUtils {

    public static void setRelations(IBinarySearchTreeNode<Integer, String> node,
                              IBinarySearchTreeNode<Integer, String> parent,
                              IBinarySearchTreeNode<Integer, String> left,
                              IBinarySearchTreeNode<Integer, String> right){
        node.setParent(parent);
        node.setLeft(left);
        node.setRight(right);
    }

}
