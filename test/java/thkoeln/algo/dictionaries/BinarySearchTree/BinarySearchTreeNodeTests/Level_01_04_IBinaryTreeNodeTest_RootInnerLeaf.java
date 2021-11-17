package thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNodeTests;

import org.junit.jupiter.api.Test;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTreeNode;
import thkoeln.algo.dictionaries.TestUtils;

import static org.junit.jupiter.api.Assertions.*;

class Level_01_04_IBinaryTreeNodeTest_RootInnerLeaf {



    @Test
    void Test_01_04_01_isLeaf() {
        // Given
        IBinarySearchTreeNode<Integer, String> node1 = new BinarySearchTreeNode<>(1, "1");
        IBinarySearchTreeNode<Integer, String> node2 = new BinarySearchTreeNode<>(2, "2");
        IBinarySearchTreeNode<Integer, String> node3 = new BinarySearchTreeNode<>(3, "3");
        IBinarySearchTreeNode<Integer, String> node4 = new BinarySearchTreeNode<>(4, "4");
        IBinarySearchTreeNode<Integer, String> node5 = new BinarySearchTreeNode<>(5, "5");
        IBinarySearchTreeNode<Integer, String> node6 = new BinarySearchTreeNode<>(6, "6");
        IBinarySearchTreeNode<Integer, String> node7 = new BinarySearchTreeNode<>(7, "7");

        /*
         * 0               (4)
         *          l-------|-------r
         * 1       (2)             (6)
         *      l---|---r       l---|---r
         * 2   (1)     (3)     (5)     (7)
         * */

        // When
        TestUtils.setRelations(node1, node2, null, null);
        TestUtils.setRelations(node2, node4, node1, node3);
        TestUtils.setRelations(node3, node2, null, null);
        TestUtils.setRelations(node4, null, node2, node6);
        TestUtils.setRelations(node5, node6, null, null);
        TestUtils.setRelations(node6, node4, node5, node7);
        TestUtils.setRelations(node7, node6, null, null);

        // Then
        assertTrue(node1.isLeaf());
        assertTrue(node3.isLeaf());
        assertTrue(node5.isLeaf());
        assertTrue(node7.isLeaf());

        assertFalse(node6.isLeaf());
        assertFalse(node4.isLeaf());
        assertFalse(node2.isLeaf());
    }

    @Test
    void Test_01_04_02_isInnerNode() {
        // Given
        IBinarySearchTreeNode<Integer, String> node1 = new BinarySearchTreeNode<>(1, "1");
        IBinarySearchTreeNode<Integer, String> node2 = new BinarySearchTreeNode<>(2, "2");
        IBinarySearchTreeNode<Integer, String> node3 = new BinarySearchTreeNode<>(3, "3");
        IBinarySearchTreeNode<Integer, String> node4 = new BinarySearchTreeNode<>(4, "4");
        IBinarySearchTreeNode<Integer, String> node5 = new BinarySearchTreeNode<>(5, "5");
        IBinarySearchTreeNode<Integer, String> node6 = new BinarySearchTreeNode<>(6, "6");
        IBinarySearchTreeNode<Integer, String> node7 = new BinarySearchTreeNode<>(7, "7");

        /*
         * 0               (4)
         *          l-------|-------r
         * 1       (2)             (6)
         *      l---|---r       l---|---r
         * 2   (1)     (3)     (5)     (7)
         * */

        // When
        TestUtils.setRelations(node1, node2, null, null);
        TestUtils.setRelations(node2, node4, node1, node3);
        TestUtils.setRelations(node3, node2, null, null);
        TestUtils.setRelations(node4, null, node2, node6);
        TestUtils.setRelations(node5, node6, null, null);
        TestUtils.setRelations(node6, node4, node5, node7);
        TestUtils.setRelations(node7, node6, null, null);

        // Then
        assertTrue(node2.isInnerNode());
        assertTrue(node4.isInnerNode());
        assertTrue(node6.isInnerNode());

        assertFalse(node1.isInnerNode());
        assertFalse(node3.isInnerNode());
        assertFalse(node5.isInnerNode());
        assertFalse(node7.isInnerNode());
    }

    @Test
    void Test_01_04_03_isRoot() {
        // Given
        IBinarySearchTreeNode<Integer, String> node1 = new BinarySearchTreeNode<>(1, "1");
        IBinarySearchTreeNode<Integer, String> node2 = new BinarySearchTreeNode<>(2, "2");
        IBinarySearchTreeNode<Integer, String> node3 = new BinarySearchTreeNode<>(3, "3");
        IBinarySearchTreeNode<Integer, String> node4 = new BinarySearchTreeNode<>(4, "4");
        IBinarySearchTreeNode<Integer, String> node5 = new BinarySearchTreeNode<>(5, "5");
        IBinarySearchTreeNode<Integer, String> node6 = new BinarySearchTreeNode<>(6, "6");
        IBinarySearchTreeNode<Integer, String> node7 = new BinarySearchTreeNode<>(7, "7");

        /*
         * 0               (4)
         *          l-------|-------r
         * 1       (2)             (6)
         *      l---|---r       l---|---r
         * 2   (1)     (3)     (5)     (7)
         * */

        // When
        TestUtils.setRelations(node1, node2, null, null);
        TestUtils.setRelations(node2, node4, node1, node3);
        TestUtils.setRelations(node3, node2, null, null);
        TestUtils.setRelations(node4, null, node2, node6);
        TestUtils.setRelations(node5, node6, null, null);
        TestUtils.setRelations(node6, node4, node5, node7);
        TestUtils.setRelations(node7, node6, null, null);

        // Then
        assertTrue(node4.isRoot());

        assertFalse(node1.isRoot());
        assertFalse(node2.isRoot());
        assertFalse(node3.isRoot());
        assertFalse(node5.isRoot());
        assertFalse(node6.isRoot());
        assertFalse(node7.isRoot());

    }
}