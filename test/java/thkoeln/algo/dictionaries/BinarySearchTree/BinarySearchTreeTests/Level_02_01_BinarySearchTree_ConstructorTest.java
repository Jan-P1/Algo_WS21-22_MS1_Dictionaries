package thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeTests;

import org.junit.jupiter.api.Test;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTree;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTreeNode;
import thkoeln.algo.dictionaries.TreePrinter;

import static org.junit.jupiter.api.Assertions.*;

class Level_02_01_BinarySearchTree_ConstructorTest {



    @Test
    void Test_02_01_01_getRoot_On_NewTree_ShouldBe_NULL () {
        // Given

        // When
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        IBinarySearchTreeNode<Integer, String> actualRoot = tree.getRoot();
        // Then
        assertNull(actualRoot);
    }


    @Test
    void Test_02_01_02_isEmpty_OnNewTree_ShouldBe_TRUE () {
        // Given

        // When
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        boolean isEmpty = tree.isEmpty();

        // Then
        assertTrue(isEmpty);
    }


    @Test
    void Test_02_01_03_Constructor_With_SingleKey_Should_SetRoot () {
        // Given
        Integer newKey = 1;

        // When
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>(newKey);
        IBinarySearchTreeNode<Integer, String> actualRoot = tree.getRoot();
        // Then
        assertNotNull(actualRoot);
        assertEquals(newKey, actualRoot.getKey());
    }


    @Test
    void Test_02_01_04_Constructor_With_SingleKey_Should_NOTBeEmpty () {
        // Given
        Integer newKey = 1;

        // When
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>(newKey);
        boolean isEmpty = tree.isEmpty();

        // Then
        assertFalse(isEmpty);
    }

    @Test
    void Test_02_01_05_empty_Should_emptyTree () {
        // Given
        Integer newKey = 1;
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>(newKey);
        IBinarySearchTreeNode<Integer, String> actualRoot = tree.getRoot();

        // When
        tree.empty();
        IBinarySearchTreeNode<Integer, String> actualRootAfterEmpty = tree.getRoot();
        boolean actualIsEmpty = tree.isEmpty();

        // Then
        assertNotNull(actualRoot);
        assertNull(actualRootAfterEmpty);
        assertTrue(actualIsEmpty);
    }

    @Test
    void Test_02_01_06_Constructor_With_ParamsKeys_Should_InsertAllKeys () {
        // Hierzu muss zuerst die Insert-Methode implementiert werden

        // Given
        Integer newKey = 1;

        /*
         * 0               (4)
         *          l-------|-------r
         * 1       (2)             (6)
         *      l---|---r       l---|---r
         * 2   (1)     (3)     (5)     (7)
         * */

        // When
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>(4,2,6,1,3,5,7);
        IBinarySearchTreeNode<Integer, String> actualRoot = tree.getRoot();

        // Then
        assertNotNull(actualRoot);
        assertFalse(tree.isEmpty());

        IBinarySearchTreeNode<Integer, String> node1 = actualRoot.getLeft().getLeft();
        IBinarySearchTreeNode<Integer, String> node2 = actualRoot.getLeft();
        IBinarySearchTreeNode<Integer, String> node3 = actualRoot.getLeft().getRight();
        IBinarySearchTreeNode<Integer, String> node4 = actualRoot;
        IBinarySearchTreeNode<Integer, String> node5 = actualRoot.getRight().getLeft();
        IBinarySearchTreeNode<Integer, String> node6 = actualRoot.getRight();
        IBinarySearchTreeNode<Integer, String> node7 = actualRoot.getRight().getRight();

        assertNull(node4.getParent());
        assertNull(node1.getLeft());
        assertNull(node1.getRight());
        assertNull(node3.getLeft());
        assertNull(node3.getRight());
        assertNull(node5.getLeft());
        assertNull(node5.getRight());
        assertNull(node7.getLeft());
        assertNull(node7.getRight());

        assertEquals(node4, node2.getParent());
        assertEquals(node4, node6.getParent());
        assertEquals(node2, node1.getParent());
        assertEquals(node2, node3.getParent());
        assertEquals(node6, node5.getParent());
        assertEquals(node6, node7.getParent());

        assertEquals(node1, node2.getLeft());
        assertEquals(node3, node2.getRight());
        assertEquals(node5, node6.getLeft());
        assertEquals(node7, node6.getRight());
        assertEquals(node2, node4.getLeft());
        assertEquals(node6, node4.getRight());

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
    }



}