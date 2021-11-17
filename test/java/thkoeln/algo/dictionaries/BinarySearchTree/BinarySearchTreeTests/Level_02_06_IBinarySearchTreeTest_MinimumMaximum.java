package thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeTests;

import org.junit.jupiter.api.Test;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTree;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTree;
import thkoeln.algo.dictionaries.TreePrinter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class Level_02_06_IBinarySearchTreeTest_MinimumMaximum {


    @Test
    void Level_02_06_01_minimum() {
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
        Integer minimum = tree.minimum();

        // Then
        assertNotNull(minimum);

        assertEquals(1, minimum);
    }


    @Test
    void Level_02_06_02_maximum() {
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
        Integer maximum = tree.maximum();

        // Then
        assertNotNull(maximum);

        assertEquals(7, maximum);
    }


}