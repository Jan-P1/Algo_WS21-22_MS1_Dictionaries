package thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeTests;

import org.junit.jupiter.api.Test;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTree;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTree;
import thkoeln.algo.dictionaries.TreePrinter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Level_02_08_BinarySearchTree_SizeTest {

    @Test
    void Level_02_08_01_Size_of_EmptyTree_Should_be_zero () {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();

        // When
        int actualSize = tree.size();

        // Then
        assertEquals(0, actualSize);
    }

    @Test
    void Level_02_08_02_Size_of_SingleNode_Should_be_one () {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(1);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        int actualSize = tree.size();

        // Then
        assertEquals(1, actualSize);
    }

    @Test
    void Level_02_08_03_Size_of_TwoNodesLeft_Should_be_2 () {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(2);
        tree.insert(1);


        /*
         *
         * 0       (2)
         *      l---|
         * 1   (1)
         *
         * size = 2
         */

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        int actualSize = tree.size();

        // Then
        assertEquals(2, actualSize);
    }

    @Test
    void Level_02_08_03_Size_of_TwoNodesRight_Should_be_2 () {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(1);
        tree.insert(2);


        /*
         *
         * 0       (1)
         *          |---r
         * 1           (2)
         *
         * size = 2
         */

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        int actualSize = tree.size();

        // Then
        assertEquals(2, actualSize);
    }

    @Test
    void Level_02_08_04_Size_of_RootLeftRightCildren_Should_be_3 () {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);


        /*
         *       0       (2)
         *            l---|---r
         *       1   (1)     (3)
         *
         * size = 3
         */

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        int actualSize = tree.size();

        // Then
        assertEquals(3, actualSize);
    }

    @Test
    void Level_02_08_05_Size_of_RootWithOneGrandchild_Should_be_3 () {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(1);
        tree.insert(3);
        tree.insert(2);

        /*
         * 0               (1)
         *                  |-------r
         * 1                       (3)
         *                      l---|
         * 2                   (2)
         *
         * size = 3
         */


        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        int actualSize = tree.size();

        // Then
        assertEquals(3, actualSize);
    }

    @Test
    void Level_02_08_06_Size_7_Nodes() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);

        /*
         * 0               (4)
         *          l-------|-------r
         * 1       (2)             (6)
         *      l---|---r       l---|---r
         * 2   (1)     (3)     (5)     (7)
         *
         * size = 7
         * */

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        int actualSize = tree.size();

        // Then
        assertEquals(7, actualSize);
    }

    @Test
    void Level_02_08_07_size_10_Nodes() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(9);
        tree.insert(8);
        tree.insert(10);

        /*
         *  0                               (5)
         *                   l---------------|---------------r
         *  1               (3)                             (7)
         *           l-------|-------r               l-------|-------r
         *  2       (1)             (4)             (6)             (9)
         *           |---r                                       l---|---r
         *  3           (2)                                     (8)    (10)
         *
         * size = 10
         */

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        int actualSize = tree.size();

        // Then
        assertEquals(10, actualSize);

    }



}