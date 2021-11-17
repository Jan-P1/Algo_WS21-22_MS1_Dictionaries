package thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeTests;

import org.junit.jupiter.api.Test;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTree;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTree;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTreeNode;
import thkoeln.algo.dictionaries.TreePrinter;

import static org.junit.jupiter.api.Assertions.*;

class Level_02_04_BinarySearchTree_DeleteTest {


    @Test
    void Level_02_04_01_Delete_On_EmptyTree_Should_Return_False () {
        // Given
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        Integer deleteKey = 5;

        // When
        boolean keyDeletedSuccess = tree.delete(deleteKey);

        // Then
        assertFalse(keyDeletedSuccess);
    }

    @Test
    void Level_02_04_02_Delete_On_ExistingRoot_Should_ReturnTrue_And_EmptyTrue () {
        // Given
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        Integer deleteKey = 5;
        tree.insert(deleteKey);

        // When
        boolean isEmptyBefore = tree.isEmpty();
        //Then
        assertFalse(isEmptyBefore);

        // When
        boolean keyDeletedSuccess = tree.delete(deleteKey);
        // Then
        assertTrue(keyDeletedSuccess);

        // When
        boolean isEmptyAfter = tree.isEmpty();
        // Then
        assertTrue(isEmptyAfter);
    }

    @Test
    void Level_02_04_03_Delete_On_RootWithOnlyLeftChild_Should_MakeLeftChildRoot () {
        // Given
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(2, 1);

        /*
         * Before:
         * 0       (2)
         *      l---|
         * 1   (1)
         *
         * delete(2)
         * After:
         * 0   (1)
         */

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        boolean isEmptyBefore = tree.isEmpty();
        //Then
        assertFalse(isEmptyBefore);

        // When
        boolean keyDeletedSuccess = tree.delete(2);
        // Then
        assertTrue(keyDeletedSuccess);

        // When
        boolean isEmptyAfter = tree.isEmpty();
        // Then
        assertFalse(isEmptyAfter);

        // When
        IBinarySearchTreeNode<Integer, String> newRoot = tree.getRoot();
        // Then
        assertEquals(1, newRoot.getKey());

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
    }

    @Test
    void Level_02_04_04_Delete_On_RootWithOnlyRightChild_Should_MakeRightChildRoot () {
        // Given
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(1, 2);

        /*
         * Before:
         * 0       (1)
         *          |---r
         * 1           (2)
         *
         * delete(1)
         * After:
         * 0   (2)
         */

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        boolean isEmptyBefore = tree.isEmpty();
        //Then
        assertFalse(isEmptyBefore);

        // When
        boolean keyDeletedSuccess = tree.delete(1);
        // Then
        assertTrue(keyDeletedSuccess);

        // When
        boolean isEmptyAfter = tree.isEmpty();
        // Then
        assertFalse(isEmptyAfter);

        // When
        IBinarySearchTreeNode<Integer, String> newRoot = tree.getRoot();
        // Then
        assertEquals(2, newRoot.getKey());

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
    }

    @Test
    void Level_02_04_05_Delete_On_RootWithLeftAndRightChild_Should_MakeRightChildRoot () {
        // Given
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(2, 1, 3);

        /*
         * Before:
         * 0       (2)
         *      l---|---r
         * 1   (1)     (3)
         *
         * delete(2)
         * After:
         * 0       (3)
         *      l---|
         * 1   (1)
         */

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        boolean isEmptyBefore = tree.isEmpty();
        //Then
        assertFalse(isEmptyBefore);

        // When
        IBinarySearchTreeNode<Integer, String> rootBefore = tree.getRoot();
        //Then
        assertEquals(2, rootBefore.getKey());

        // When
        boolean keyDeletedSuccess = tree.delete(2);
        // Then
        assertTrue(keyDeletedSuccess);

        // When
        boolean isEmptyAfter = tree.isEmpty();
        // Then
        assertFalse(isEmptyAfter);

        // When
        IBinarySearchTreeNode<Integer, String> newRoot = tree.getRoot();
        // Then
        assertEquals(3, newRoot.getKey());

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
    }

    @Test
    void Level_02_04_06_Delete_Root_On_LeftChildZigZag_Should_MakeLeftChildRoot () {
        // Given
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(3, 1, 2);

        /*
         * Before:
         * 0               (3)
         *          l-------|
         * 1       (1)
         *          |---r
         * 2           (2)
         *
         * delete(3)
         * After:
         * 0       (1)
         *          |---r
         * 1           (2)
         */

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        boolean isEmptyBefore = tree.isEmpty();
        //Then
        assertFalse(isEmptyBefore);

        // When
        IBinarySearchTreeNode<Integer, String> rootBefore = tree.getRoot();
        //Then
        assertEquals(3, rootBefore.getKey());

        // When
        boolean keyDeletedSuccess = tree.delete(3);
        // Then
        assertTrue(keyDeletedSuccess);

        // When
        boolean isEmptyAfter = tree.isEmpty();
        // Then
        assertFalse(isEmptyAfter);

        // When
        IBinarySearchTreeNode<Integer, String> newRoot = tree.getRoot();
        // Then
        assertEquals(1, newRoot.getKey());

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
    }

    @Test
    void Level_02_04_07_Delete_Root_On_RightChildZigZag_Should_MakeRightChildRoot () {
        // Given
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(1, 3, 2);

        /*
         * Before:
         * 0               (1)
         *                  |-------r
         * 1                       (3)
         *                      l---|
         * 2                   (2)
         *
         * delete(1)
         * After:
         * 0       (3)
         *      l---|
         * 1   (2)
         */

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        boolean isEmptyBefore = tree.isEmpty();
        //Then
        assertFalse(isEmptyBefore);

        // When
        IBinarySearchTreeNode<Integer, String> rootBefore = tree.getRoot();
        //Then
        assertEquals(1, rootBefore.getKey());

        // When
        boolean keyDeletedSuccess = tree.delete(1);
        // Then
        assertTrue(keyDeletedSuccess);

        // When
        boolean isEmptyAfter = tree.isEmpty();
        // Then
        assertFalse(isEmptyAfter);

        // When
        IBinarySearchTreeNode<Integer, String> newRoot = tree.getRoot();
        // Then
        assertEquals(3, newRoot.getKey());

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
    }


    @Test
    void Level_02_04_08_Delete_InnerNode_On_LeftChildZigZag_ () {
        // Given
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(3, 1, 2);

        /*
         * Before:
         * 0               (3)
         *          l-------|
         * 1       (1)
         *          |---r
         * 2           (2)
         *
         * After:
         * 0       (3)
         *      l---|
         * 1   (2)
         *
         */

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        boolean isEmptyBefore = tree.isEmpty();
        //Then
        assertFalse(isEmptyBefore);

        // When
        IBinarySearchTreeNode<Integer, String> rootBefore = tree.getRoot();
        //Then
        assertEquals(3, rootBefore.getKey());

        // When
        boolean keyDeletedSuccess = tree.delete(1);
        // Then
        assertTrue(keyDeletedSuccess);

        // When
        boolean isEmptyAfter = tree.isEmpty();
        // Then
        assertFalse(isEmptyAfter);

        // When
        IBinarySearchTreeNode<Integer, String> newRoot = tree.getRoot();
        assertEquals(rootBefore, newRoot);

        IBinarySearchTreeNode<Integer, String> newLeftChild = newRoot.getLeft();
        // Then
        assertEquals(2, newLeftChild.getKey());

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
    }

    @Test
    void Level_02_04_09_Delete_InnerNode_On_RightChildZigZag_ () {
        // Given
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(1, 3, 2);

        /*
         * Before:
         * 0               (1)
         *                  |-------r
         * 1                       (3)
         *                      l---|
         * 2                   (2)
         *
         * delete(3)
         * After:
         * 0       (1)
         *          |---r
         * 1           (2)
         *
         */

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        boolean isEmptyBefore = tree.isEmpty();
        //Then
        assertFalse(isEmptyBefore);

        // When
        IBinarySearchTreeNode<Integer, String> rootBefore = tree.getRoot();
        //Then
        assertEquals(1, rootBefore.getKey());

        // When
        boolean keyDeletedSuccess = tree.delete(3);
        // Then
        assertTrue(keyDeletedSuccess);

        // When
        boolean isEmptyAfter = tree.isEmpty();
        // Then
        assertFalse(isEmptyAfter);

        // When
        IBinarySearchTreeNode<Integer, String> newRoot = tree.getRoot();
        assertEquals(rootBefore, newRoot);

        IBinarySearchTreeNode<Integer, String> newRightChild = newRoot.getRight();
        // Then
        assertEquals(2, newRightChild.getKey());

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
    }


    @Test
    void Level_02_04_10_BIGBOSS_Delete_Root_Repeatedly_OnBinarySearchTree() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        /*
         * 0               (4)
         *          l-------|-------r
         * 1       (2)             (6)
         *      l---|---r       l---|---r
         * 2   (1)     (3)     (5)     (7)
         * */


        tree.insert(4, "4");
        tree.insert(2, "2");
        tree.insert(3, "3");
        tree.insert(1, "1");
        tree.insert(6, "6");
        tree.insert(7, "7");
        tree.insert(5, "5");

        System.out.println("\nStart:");
        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // Start:
        // Expected:
        // 0               (4)
        //          l-------|-------r
        // 1       (2)             (6)
        //      l---|---r       l---|---r
        // 2   (1)     (3)     (5)     (7)

        // When
        System.out.println("\nDelete Root:");
        IBinarySearchTreeNode<Integer, String> previousRoot = tree.getRoot();
        assertEquals(4, previousRoot.getKey());
        boolean deleteSuccess = tree.delete(4);
        assertTrue(deleteSuccess);
        IBinarySearchTreeNode<Integer, String> newRoot = tree.getRoot();
        assertNotNull(newRoot);
        assertEquals(5, newRoot.getKey());
        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
        // Expected:
        // Delete Root:
        // 0               (5)
        //          l-------|-------r
        // 1       (2)             (6)
        //      l---|---r           |---r
        // 2   (1)     (3)             (7)

        // next, When
        System.out.println("\nDelete Root:");
        previousRoot = tree.getRoot();
        assertEquals(5, previousRoot.getKey());
        deleteSuccess = tree.delete(5);
        assertTrue(deleteSuccess);
        newRoot = tree.getRoot();
        assertNotNull(newRoot);
        assertEquals(6, newRoot.getKey());
        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
        // Expected:
        // Delete Root:
        // 0               (6)
        //          l-------|-------r
        // 1       (2)             (7)
        //      l---|---r
        // 2   (1)     (3)

        // next, When
        System.out.println("\nDelete Root:");
        previousRoot = tree.getRoot();
        assertEquals(6, previousRoot.getKey());
        deleteSuccess = tree.delete(6);
        assertTrue(deleteSuccess);
        newRoot = tree.getRoot();
        assertNotNull(newRoot);
        assertEquals(7, newRoot.getKey());
        // Expected:
        // Delete Root:
        // 0               (7)
        //          l-------|
        // 1       (2)
        //      l---|---r
        // 2   (1)     (3)
        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // next, When
        System.out.println("\nDelete Root:");
        previousRoot = tree.getRoot();
        assertEquals(7, previousRoot.getKey());
        deleteSuccess = tree.delete(7);
        assertTrue(deleteSuccess);
        newRoot = tree.getRoot();
        assertNotNull(newRoot);
        assertEquals(2, newRoot.getKey());
        // Expected:
        // Delete Root:
        // 0       (2)
        //      l---|---r
        // 1   (1)     (3)
        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // next, When
        System.out.println("\nDelete Root:");
        previousRoot = tree.getRoot();
        assertEquals(2, previousRoot.getKey());
        deleteSuccess = tree.delete(2);
        assertTrue(deleteSuccess);
        newRoot = tree.getRoot();
        assertNotNull(newRoot);
        assertEquals(3, newRoot.getKey());
        // Expected:
        // Delete Root:
        // 0       (3)
        //      l---|
        // 1   (1)
        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // next, When
        System.out.println("\nDelete Root:");
        previousRoot = tree.getRoot();
        assertEquals(3, previousRoot.getKey());
        deleteSuccess = tree.delete(3);
        assertTrue(deleteSuccess);
        newRoot = tree.getRoot();
        assertNotNull(newRoot);
        assertEquals(1, newRoot.getKey());
        // Expected:
        // Delete Root:
        // 0   (1)
        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // next, When
        System.out.println("\nDelete Root:");
        previousRoot = tree.getRoot();
        assertEquals(1, previousRoot.getKey());
        deleteSuccess = tree.delete(1);
        assertTrue(deleteSuccess);
        newRoot = tree.getRoot();
        assertNull(newRoot);
        assertTrue(tree.isEmpty());
        // Expected:
        // Delete Root:
        // 0
        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());


    }

    @Test
    void Level_02_04_11_Delete_InnerNode_Repeatedly_OnBinarySearchTree() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        /*
         * 0               (4)
         *          l-------|-------r
         * 1       (2)             (6)
         *      l---|---r       l---|---r
         * 2   (1)     (3)     (5)     (7)
         * */


        tree.insert(4, "4");
        tree.insert(2, "2");
        tree.insert(3, "3");
        tree.insert(1, "1");
        tree.insert(6, "6");
        tree.insert(7, "7");
        tree.insert(5, "5");

        System.out.println("\nStart:");
        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        System.out.println("\nDelete: key=2");
        IBinarySearchTreeNode<Integer, String> root = tree.getRoot();
        IBinarySearchTreeNode<Integer, String> rootLeftChild = root.getLeft();

        assertEquals(2, rootLeftChild.getKey());
        boolean deleteSuccess = tree.delete(2);
        assertTrue(deleteSuccess);
        IBinarySearchTreeNode<Integer, String> newLeftChild = root.getLeft();
        assertNotNull(newLeftChild);
        assertEquals(3, newLeftChild.getKey());
        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        System.out.println("\nDelete: key=6");
        IBinarySearchTreeNode<Integer, String> rootRightChild = root.getRight();

        assertEquals(6, rootRightChild.getKey());
        deleteSuccess = tree.delete(6);
        assertTrue(deleteSuccess);
        IBinarySearchTreeNode<Integer, String> newRightChild = root.getRight();
        assertNotNull(newLeftChild);
        assertEquals(7, newRightChild.getKey());
        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());


        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
    }

}