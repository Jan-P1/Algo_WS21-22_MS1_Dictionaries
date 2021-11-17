package thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeTests;

import org.junit.jupiter.api.Test;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTree;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTree;
import thkoeln.algo.dictionaries.TreePrinter;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class Level_02_09_IBinarySearchTreeTest_Traverse {

    @Test
    void Level_02_09_01_preorderTreeWalkList_emptyTree() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        ArrayList<Integer> expected = new ArrayList<>();

        // When
        ArrayList<Integer> actualPreOrderTreeWalk = tree.preOrderTreeWalk();

        System.out.println(actualPreOrderTreeWalk);

        // Then
        assertNotNull(actualPreOrderTreeWalk);

        assertEquals(expected, actualPreOrderTreeWalk);
    }


    @Test
    void Level_02_09_02_preorderTreeWalkList_basic() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();

        tree.insert(2, 1, 3);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(1);
        expected.add(3);

        // When
        ArrayList<Integer> actualPreOrderTreeWalk = tree.preOrderTreeWalk();

        System.out.println(actualPreOrderTreeWalk);

        // Then
        assertNotNull(actualPreOrderTreeWalk);

        assertEquals(expected, actualPreOrderTreeWalk);
    }

    @Test
    void Level_02_09_03_preorderTreeWalkList() {
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


        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(2);
        expected.add(1);
        expected.add(3);
        expected.add(6);
        expected.add(5);
        expected.add(7);

        // When
        ArrayList<Integer> actualPreOrderTreeWalk = tree.preOrderTreeWalk();

        System.out.println(actualPreOrderTreeWalk);

        // Then
        assertNotNull(actualPreOrderTreeWalk);

        assertEquals(expected, actualPreOrderTreeWalk);
    }

    @Test
    void Level_02_09_04_inOrderTreeWalkList_emptyTree() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());


        ArrayList<Integer> expected = new ArrayList<>();

        // When
        ArrayList<Integer> actualInOrderTreeWalk = tree.inOrderTreeWalk();

        System.out.println(actualInOrderTreeWalk);

        // Then
        assertNotNull(actualInOrderTreeWalk);

        assertEquals(expected, actualInOrderTreeWalk);
    }

    @Test
    void Level_02_09_05_inOrderTreeWalkList_basic() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();

        tree.insert(2, 1, 3);


        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());


        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);

        // When
        ArrayList<Integer> actualInOrderTreeWalk = tree.inOrderTreeWalk();

        System.out.println(actualInOrderTreeWalk);

        // Then
        assertNotNull(actualInOrderTreeWalk);

        assertEquals(expected, actualInOrderTreeWalk);
    }

    @Test
    void Level_02_09_06_inOrderTreeWalkList() {
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


        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);

        // When
        ArrayList<Integer> actualInOrderTreeWalk = tree.inOrderTreeWalk();

        System.out.println(actualInOrderTreeWalk);

        // Then
        assertNotNull(actualInOrderTreeWalk);

        assertEquals(expected, actualInOrderTreeWalk);
    }

    @Test
    void Level_02_09_07_postOrderTreeWalkList_emptyTree() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        ArrayList<Integer> expected = new ArrayList<>();

        // When
        ArrayList<Integer> actualPostOrderTreeWalk = tree.postOrderTreeWalk();

        System.out.println(actualPostOrderTreeWalk);

        // Then
        assertNotNull(actualPostOrderTreeWalk);

        assertEquals(expected, actualPostOrderTreeWalk);
    }

    @Test
    void Level_02_09_08_postOrderTreeWalkList_basic() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();

        tree.insert(2,1,3);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());


        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(2);


        // When
        ArrayList<Integer> actualPostOrderTreeWalk = tree.postOrderTreeWalk();

        System.out.println(actualPostOrderTreeWalk);

        // Then
        assertNotNull(actualPostOrderTreeWalk);

        assertEquals(expected, actualPostOrderTreeWalk);
    }

    @Test
    void Level_02_09_09_postOrderTreeWalkList() {
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


        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(2);
        expected.add(5);
        expected.add(7);
        expected.add(6);
        expected.add(4);

        // When
        ArrayList<Integer> actualPostOrderTreeWalk = tree.postOrderTreeWalk();

        System.out.println(actualPostOrderTreeWalk);

        // Then
        assertNotNull(actualPostOrderTreeWalk);

        assertEquals(expected, actualPostOrderTreeWalk);
    }

}