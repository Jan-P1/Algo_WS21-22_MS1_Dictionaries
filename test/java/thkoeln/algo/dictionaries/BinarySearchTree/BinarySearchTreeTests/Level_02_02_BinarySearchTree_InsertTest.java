package thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeTests;

import org.junit.jupiter.api.Test;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTree;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTree;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTreeNode;
import thkoeln.algo.dictionaries.TreePrinter;

import static org.junit.jupiter.api.Assertions.*;

class Level_02_02_BinarySearchTree_InsertTest {


    @Test
    void Level_02_02_01_FirstInsert_Should_set_RootNode () {
        // Given
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        Integer newRootKey = 5;

        // When
        IBinarySearchTreeNode<Integer, String> beforeInsertRoot = tree.getRoot();
        tree.insert(newRootKey, newRootKey.toString());
        IBinarySearchTreeNode<Integer, String> actualRoot = tree.getRoot();

        // Then
        assertNull(beforeInsertRoot);
        assertNotNull(actualRoot);
        assertEquals(newRootKey, actualRoot.getKey());
        assertEquals(newRootKey.toString(), actualRoot.getValue());
    }

    @Test
    void Level_02_02_02_Insert_SmallerKey_Should_set_LeftChild_to_root () {
        // Given
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        Integer newRootKey = 5;
        Integer secondNodeKey = 3;

        // When
        IBinarySearchTreeNode<Integer,String> beforeInsertRoot = tree.getRoot();
        tree.insert(newRootKey, newRootKey.toString());
        tree.insert(secondNodeKey, secondNodeKey.toString());
        IBinarySearchTreeNode<Integer,String> actualRoot = tree.getRoot();
        IBinarySearchTreeNode<Integer,String> actualRootLeft = actualRoot.getLeft();

        // Then
        assertNull(beforeInsertRoot);
        assertNotNull(actualRoot);
        assertEquals(newRootKey, actualRoot.getKey());
        assertEquals(newRootKey.toString(), actualRoot.getValue());

        assertEquals(secondNodeKey, actualRootLeft.getKey());
        assertEquals(secondNodeKey.toString(), actualRootLeft.getValue());
    }

    @Test
    void Level_02_02_02_Insert_LargerKey_Should_set_RightChild_to_root () {
        // Given
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        Integer newRootKey = 5;
        Integer secondNodeKey = 7;

        // When
        IBinarySearchTreeNode<Integer,String> beforeInsertRoot = tree.getRoot();
        tree.insert(newRootKey, newRootKey.toString());
        tree.insert(secondNodeKey, secondNodeKey.toString());
        IBinarySearchTreeNode<Integer,String> actualRoot = tree.getRoot();
        IBinarySearchTreeNode<Integer,String> actualRootRight = actualRoot.getRight();

        // Then
        assertNull(beforeInsertRoot);
        assertNotNull(actualRoot);
        assertEquals(newRootKey, actualRoot.getKey());
        assertEquals(newRootKey.toString(), actualRoot.getValue());

        assertEquals(secondNodeKey, actualRootRight.getKey());
        assertEquals(secondNodeKey.toString(), actualRootRight.getValue());
    }

    @Test
    void Level_02_02_03_ThirdInsert_Should_set_Children_to_root () {
        // Given
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        Integer newRootKey = 5;
        Integer secondNodeKey = 3;
        Integer thirdNodeKey = 7;

        // When
        IBinarySearchTreeNode<Integer,String> beforeInsertRoot = tree.getRoot();
        tree.insert(newRootKey, newRootKey.toString());
        tree.insert(secondNodeKey, secondNodeKey.toString());
        tree.insert(thirdNodeKey, thirdNodeKey.toString());

        IBinarySearchTreeNode<Integer,String> actualRoot = tree.getRoot();
        IBinarySearchTreeNode<Integer,String> actualRootLeft = actualRoot.getLeft();
        IBinarySearchTreeNode<Integer,String> actualRootRight = actualRoot.getRight();

        // Then
        assertNull(beforeInsertRoot);
        assertNotNull(actualRoot);
        assertEquals(newRootKey, actualRoot.getKey());
        assertEquals(newRootKey.toString(), actualRoot.getValue());

        assertEquals(secondNodeKey, actualRootLeft.getKey());
        assertEquals(secondNodeKey.toString(), actualRootLeft.getValue());

        assertEquals(thirdNodeKey, actualRootRight.getKey());
        assertEquals(thirdNodeKey.toString(), actualRootRight.getValue());
    }

    @Test
    void Level_02_02_04_Insert_Duplicate_ShouldNotBeInserted() {
        // Given
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(1, "1");

        IBinarySearchTreeNode<Integer,String> currentRoot = tree.getRoot();
        IBinarySearchTreeNode<Integer,String> currentRootLeft = currentRoot.getLeft();
        IBinarySearchTreeNode<Integer,String> currentRootRight = currentRoot.getRight();

        // When
        tree.insert(1, "1");

        IBinarySearchTreeNode<Integer,String> actualRoot = tree.getRoot();
        IBinarySearchTreeNode<Integer,String> actualRootLeft = actualRoot.getLeft();
        IBinarySearchTreeNode<Integer,String> actualRootRight = actualRoot.getRight();

        // Then
        assertNull(actualRootLeft);
        assertNull(actualRootRight);

        assertEquals(1, actualRoot.getKey());
        assertEquals("1", actualRoot.getValue());
    }


    @Test
    void Level_02_02_05_BinarySearchTree_Insert7Nodes_StructureTest() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        /*
         * 0               (4)
         *          l-------|-------r
         * 1       (2)             (6)
         *      l---|---r       l---|---r
         * 2   (1)     (3)     (5)     (7)
         * */

        // When
        tree.insert(4, "4");
        tree.insert(2, "2");
        tree.insert(3, "3");
        tree.insert(1, "1");
        tree.insert(6, "6");
        tree.insert(7, "7");
        tree.insert(5, "5");


        // Then
        IBinarySearchTreeNode<Integer, String> actualRoot = tree.getRoot();

        Integer actualRootKey = actualRoot.getKey();
        assertEquals(4, actualRootKey);

        // Level 1 Children
        IBinarySearchTreeNode<Integer, String> actualRootLeftChild = actualRoot.getLeft();
        IBinarySearchTreeNode<Integer, String> actualRootLeftChildParent = actualRootLeftChild.getParent();
        Integer actualRootLeftChildKey = actualRootLeftChild.getKey();
        assertEquals(actualRoot, actualRootLeftChildParent);
        assertEquals(2, actualRootLeftChildKey);

        IBinarySearchTreeNode<Integer, String> actualRootRightChild = actualRoot.getRight();
        IBinarySearchTreeNode<Integer, String> actualRootRightChildParent = actualRootRightChild.getParent();
        Integer actualRootRightChildKey = actualRootRightChild.getKey();
        assertEquals(actualRoot, actualRootRightChildParent);
        assertEquals(6, actualRootRightChildKey);

        // Level 2 Children
        // Children of Key = 2
        IBinarySearchTreeNode<Integer, String> actual2LeftChild = actualRootLeftChild.getLeft();
        IBinarySearchTreeNode<Integer, String> actual2LeftChildParent = actual2LeftChild.getParent();
        Integer actual2LeftChildKey = actual2LeftChild.getKey();
        assertEquals(actualRootLeftChild, actual2LeftChildParent);
        assertEquals(1, actual2LeftChildKey);

        IBinarySearchTreeNode<Integer, String> actual2RightChild = actualRootLeftChild.getRight();
        IBinarySearchTreeNode<Integer, String> actual2RightChildParent = actual2RightChild.getParent();
        Integer actual2RightChildKey = actual2RightChild.getKey();
        assertEquals(actualRootLeftChild, actual2RightChildParent);
        assertEquals(3, actual2RightChildKey);

        // Children of Key = 6
        IBinarySearchTreeNode<Integer, String> actual6LeftChild = actualRootRightChild.getLeft();
        IBinarySearchTreeNode<Integer, String> actual6LeftChildParent = actual6LeftChild.getParent();
        Integer actual6LeftChildKey = actual6LeftChild.getKey();
        assertEquals(actualRootRightChild, actual6LeftChildParent);
        assertEquals(5, actual6LeftChildKey);

        IBinarySearchTreeNode<Integer, String> actual6RightChild = actualRootRightChild.getRight();
        IBinarySearchTreeNode<Integer, String> actual6RightChildParent = actual6RightChild.getParent();
        Integer actual6RightChildKey = actual6RightChild.getKey();
        assertEquals(actualRootRightChild, actual6RightChildParent);
        assertEquals(7, actual6RightChildKey);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
    }


    @Test
    void Level_02_02_06_BinarySearchTree_Insert7NodesWithDuplicates_StructureTest() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        /*
         * 0               (4)
         *          l-------|-------r
         * 1       (2)             (6)
         *      l---|---r       l---|---r
         * 2   (1)     (3)     (5)     (7)
         * */

        // When
        tree.insert(4, "4");
        tree.insert(2, "2");
        tree.insert(4, "4");
        tree.insert(3, "3");
        tree.insert(2, "2");
        tree.insert(1, "1");
        tree.insert(3, "3");
        tree.insert(6, "6");
        tree.insert(1, "1");
        tree.insert(7, "7");
        tree.insert(6, "6");
        tree.insert(5, "5");
        tree.insert(7, "7");
        tree.insert(5, "5");

        // Then
        IBinarySearchTreeNode<Integer, String> actualRoot = tree.getRoot();

        Integer actualRootKey = actualRoot.getKey();
        assertEquals(4, actualRootKey);

        // Level 1 Children
        IBinarySearchTreeNode<Integer, String> actualRootLeftChild = actualRoot.getLeft();
        IBinarySearchTreeNode<Integer, String> actualRootLeftChildParent = actualRootLeftChild.getParent();
        Integer actualRootLeftChildKey = actualRootLeftChild.getKey();
        assertEquals(actualRoot, actualRootLeftChildParent);
        assertEquals(2, actualRootLeftChildKey);

        IBinarySearchTreeNode<Integer, String> actualRootRightChild = actualRoot.getRight();
        IBinarySearchTreeNode<Integer, String> actualRootRightChildParent = actualRootRightChild.getParent();
        Integer actualRootRightChildKey = actualRootRightChild.getKey();
        assertEquals(actualRoot, actualRootRightChildParent);
        assertEquals(6, actualRootRightChildKey);

        // Level 2 Children
        // Children of Key = 2
        IBinarySearchTreeNode<Integer, String> actual2LeftChild = actualRootLeftChild.getLeft();
        IBinarySearchTreeNode<Integer, String> actual2LeftChildParent = actual2LeftChild.getParent();
        Integer actual2LeftChildKey = actual2LeftChild.getKey();
        assertEquals(actualRootLeftChild, actual2LeftChildParent);
        assertEquals(1, actual2LeftChildKey);

        IBinarySearchTreeNode<Integer, String> actual2RightChild = actualRootLeftChild.getRight();
        IBinarySearchTreeNode<Integer, String> actual2RightChildParent = actual2RightChild.getParent();
        Integer actual2RightChildKey = actual2RightChild.getKey();
        assertEquals(actualRootLeftChild, actual2RightChildParent);
        assertEquals(3, actual2RightChildKey);

        // Children of Key = 6
        IBinarySearchTreeNode<Integer, String> actual6LeftChild = actualRootRightChild.getLeft();
        IBinarySearchTreeNode<Integer, String> actual6LeftChildParent = actual6LeftChild.getParent();
        Integer actual6LeftChildKey = actual6LeftChild.getKey();
        assertEquals(actualRootRightChild, actual6LeftChildParent);
        assertEquals(5, actual6LeftChildKey);

        IBinarySearchTreeNode<Integer, String> actual6RightChild = actualRootRightChild.getRight();
        IBinarySearchTreeNode<Integer, String> actual6RightChildParent = actual6RightChild.getParent();
        Integer actual6RightChildKey = actual6RightChild.getKey();
        assertEquals(actualRootRightChild, actual6RightChildParent);
        assertEquals(7, actual6RightChildKey);

        assertEquals(7, tree.size());

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
    }



    @Test
    void Level_02_02_07_BinarySearchTree_Insert_MultipleKeysSorted_ListStructureTest() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();

        /*
         * 0                               (1)
         *                                  |---------------r
         * 1                                               (2)
         *                                                  |-------r
         * 2                                                       (3)
         *                                                          |---r
         * 3                                                           (4)
         */

        // When
        tree.insert(1,2,3,4);
        IBinarySearchTreeNode<Integer, String> actualRoot = tree.getRoot();
        // Then
        assertNotNull(actualRoot);
        assertEquals(1, actualRoot.getKey());

        // When
        IBinarySearchTreeNode<Integer, String> actualNode2 = actualRoot.getRight();
        // Then
        assertNotNull(actualNode2);
        assertEquals(2, actualNode2.getKey());

        // When
        IBinarySearchTreeNode<Integer, String> actualNode3 = actualNode2.getRight();
        // Then
        assertNotNull(actualNode3);
        assertEquals(3, actualNode3.getKey());

        // When
        IBinarySearchTreeNode<Integer, String> actualNode4 = actualNode3.getRight();
        // Then
        assertNotNull(actualNode4);
        assertEquals(4, actualNode4.getKey());

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
    }

    @Test
    void Level_02_02_08_BinarySearchTree_Insert_MultipleKeysUnSorted_ListStructureTest() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();

        /*
         * 0               (2)
         *          l-------|-------r
         * 1       (1)             (4)
         *                      l---|
         * 2                   (3)
         */

        // When
        tree.insert(2, 1, 4, 3);
        IBinarySearchTreeNode<Integer, String> actualRoot = tree.getRoot();
        // Then
        assertNotNull(actualRoot);
        assertEquals(2, actualRoot.getKey());

        // When
        IBinarySearchTreeNode<Integer, String> actualNode1 = actualRoot.getLeft();
        // Then
        assertNotNull(actualNode1);
        assertEquals(1, actualNode1.getKey());

        // When
        IBinarySearchTreeNode<Integer, String> actualNode4 = actualRoot.getRight();
        // Then
        assertNotNull(actualNode4);
        assertEquals(4, actualNode4.getKey());

        // When
        IBinarySearchTreeNode<Integer, String> actualNode3 = actualNode4.getLeft();
        // Then
        assertNotNull(actualNode3);
        assertEquals(3, actualNode3.getKey());

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
    }

}