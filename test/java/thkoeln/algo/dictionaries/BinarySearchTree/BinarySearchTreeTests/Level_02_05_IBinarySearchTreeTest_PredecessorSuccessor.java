package thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeTests;

import org.junit.jupiter.api.Test;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTree;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTree;
import thkoeln.algo.dictionaries.TreePrinter;

import static org.junit.jupiter.api.Assertions.*;

class Level_02_05_IBinarySearchTreeTest_PredecessorSuccessor {


    @Test
    void Level_02_05_01_predecessor_EmptyTreeKeyNotFound_ShouldBe_NULL() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();

        // When
        Integer predecessor = tree.predecessor(4);

        // Then
        assertNull(predecessor);
    }

    @Test
    void Level_02_05_02_successor_EmptyTreeKeyNotFound_ShouldBe_NULL() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();

        // When
        Integer successor = tree.successor(4);

        // Then
        assertNull(successor);
    }

    @Test
    void Level_02_05_03_predecessor() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();

        tree.insert(4, 2, 6, 1, 3, 5, 7);

        /*
         * 0               (4)
         *          l-------|-------r
         * 1       (2)             (6)
         *      l---|---r       l---|---r
         * 2   (1)     (3)     (5)     (7)
         * */
        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        Integer predecessorOfNode4 = tree.predecessor(4);
        Integer predecessorOfNode2 = tree.predecessor(2);
        Integer predecessorOfNode6 = tree.predecessor(6);
        Integer predecessorOfNode1 = tree.predecessor(1);
        Integer predecessorOfNode3 = tree.predecessor(3);
        Integer predecessorOfNode5 = tree.predecessor(5);
        Integer predecessorOfNode7 = tree.predecessor(7);

        // Then
        assertNull(predecessorOfNode1);
        assertNotNull(predecessorOfNode2);
        assertNotNull(predecessorOfNode3);
        assertNotNull(predecessorOfNode4);
        assertNotNull(predecessorOfNode5);
        assertNotNull(predecessorOfNode6);
        assertNotNull(predecessorOfNode7);

        assertEquals(1, predecessorOfNode2);
        assertEquals(2, predecessorOfNode3);
        assertEquals(3, predecessorOfNode4);
        assertEquals(4, predecessorOfNode5);
        assertEquals(5, predecessorOfNode6);
        assertEquals(6, predecessorOfNode7);
    }



    @Test
    void Level_02_05_04_successor() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();

        tree.insert(4, 2, 6, 1, 3, 5, 7);

        /*
         * 0               (4)
         *          l-------|-------r
         * 1       (2)             (6)
         *      l---|---r       l---|---r
         * 2   (1)     (3)     (5)     (7)
         * */
        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        Integer successorOfNode4 = tree.successor(4);
        Integer successorOfNode2 = tree.successor(2);
        Integer successorOfNode6 = tree.successor(6);
        Integer successorOfNode1 = tree.successor(1);
        Integer successorOfNode3 = tree.successor(3);
        Integer successorOfNode5 = tree.successor(5);
        Integer successorOfNode7 = tree.successor(7);

        // Then

        assertNotNull(successorOfNode1);
        assertNotNull(successorOfNode2);
        assertNotNull(successorOfNode3);
        assertNotNull(successorOfNode4);
        assertNotNull(successorOfNode5);
        assertNotNull(successorOfNode6);
        assertNull(successorOfNode7);

        assertEquals(2, successorOfNode1);
        assertEquals(3, successorOfNode2);
        assertEquals(4, successorOfNode3);
        assertEquals(5, successorOfNode4);
        assertEquals(6, successorOfNode5);
        assertEquals(7, successorOfNode6);

    }
}