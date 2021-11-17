package thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeTests;

import org.junit.jupiter.api.Test;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTree;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTree;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTreeNode;
import thkoeln.algo.dictionaries.TreePrinter;
import thkoeln.algo.dictionaries.TestUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Level_02_07_IBinarySearchTreeTest_HeightDepth {



    @Test
    void Level_02_07_01_Height_of_SingleNode_Should_be_one () {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(1);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        int actualHeight = tree.height();

        // Then
        assertEquals(1, actualHeight);
    }

    @Test
    void Level_02_07_02_Height_of_TwoNodes_Should_be_2 () {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(1,2);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        int height = tree.height();

        // Then
        assertEquals(2, height);
    }

    @Test
    void Level_02_07_03_Height_of_RootLeftRightCildren_Should_be_2 () {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(2, 1, 3);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        int height = tree.height();

        // Then
        assertEquals(2, height);
    }

    @Test
    void Level_02_07_04_Height_of_RootWithOneGrandchild_Should_be_3 () {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(1, 2, 3);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        int height = tree.height();

        // Then
        assertEquals(3, height);
    }

    @Test
    void Level_02_07_05_Height() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(4, 2, 6, 1, 3, 5, 7);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        int height = tree.height();

        // Then
        assertEquals(3, height);
    }

    @Test
    void Level_02_07_06_height2() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(4, 2, 6, 1, 3, 5, 7, 8);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        int height = tree.height();

        // Then
        assertEquals(4, height);
    }


    @Test
    void Level_02_07_07_Depth_of_EmptyTree_Should_be_0 () {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        int depth = tree.nodeDepth(tree.getRoot());

        // Then
        assertEquals(0, depth);
    }

    @Test
    void Level_02_07_08_Depth_of_SingleNode_Should_be_0 () {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(1);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        int depth = tree.nodeDepth(tree.getRoot());

        // Then
        assertEquals(0, depth);
    }

    @Test
    void Level_02_07_09_Depth_of_RootOfTwoNodes_Should_be_0 () {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(2, 1, 3);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        int depth = tree.nodeDepth(tree.getRoot());

        // Then
        assertEquals(0, depth);
    }

    @Test
    void Level_02_07_10_Depth_of_RootWithOneGrandchild_Should_be_0 () {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(1, 2, 3);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        // When
        int depth = tree.nodeDepth(tree.getRoot());

        // Then
        assertEquals(0, depth);
    }

    @Test
    void Level_02_07_11_depth() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(4, 2, 6, 1, 3, 5, 7);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());

        IBinarySearchTreeNode<Integer, String> node1 = tree.getNode(1);
        IBinarySearchTreeNode<Integer, String> node2 = tree.getNode(2);
        IBinarySearchTreeNode<Integer, String> node3 = tree.getNode(3);
        IBinarySearchTreeNode<Integer, String> node4 = tree.getNode(4);
        IBinarySearchTreeNode<Integer, String> node5 = tree.getNode(5);
        IBinarySearchTreeNode<Integer, String> node6 = tree.getNode(6);
        IBinarySearchTreeNode<Integer, String> node7 = tree.getNode(7);

        // When
        int depthOfNode1 = node1.depth();
        int depthOfNode2 = node2.depth();
        int depthOfNode3 = node3.depth();
        int depthOfNode4 = node4.depth();
        int depthOfNode5 = node5.depth();
        int depthOfNode6 = node6.depth();
        int depthOfNode7 = node7.depth();


        int depth = tree.nodeDepth(tree.getRoot());

        // Then
        assertEquals(0, depth);

        assertEquals(2, depthOfNode1);
        assertEquals(1, depthOfNode2);
        assertEquals(2, depthOfNode3);
        assertEquals(0, depthOfNode4);
        assertEquals(2, depthOfNode5);
        assertEquals(1, depthOfNode6);
        assertEquals(2, depthOfNode7);
    }

    @Test
    void Level_02_07_12_depth2() {
        // Given
        IBinarySearchTreeNode<Integer, String> node1 = new BinarySearchTreeNode<>(1, "1");
        IBinarySearchTreeNode<Integer, String> node2 = new BinarySearchTreeNode<>(2, "2");
        IBinarySearchTreeNode<Integer, String> node3 = new BinarySearchTreeNode<>(3, "3");
        IBinarySearchTreeNode<Integer, String> node4 = new BinarySearchTreeNode<>(4, "4");
        IBinarySearchTreeNode<Integer, String> node5 = new BinarySearchTreeNode<>(5, "5");
        IBinarySearchTreeNode<Integer, String> node6 = new BinarySearchTreeNode<>(6, "6");
        IBinarySearchTreeNode<Integer, String> node7 = new BinarySearchTreeNode<>(7, "7");
        IBinarySearchTreeNode<Integer, String> node8 = new BinarySearchTreeNode<>(8, "8");
        IBinarySearchTreeNode<Integer, String> node9 = new BinarySearchTreeNode<>(9, "9");

        /*
         * 0                               (5)
         *                  l---------------|---------------r
         * 1               (3)                             (7)
         *          l-------|-------r               l-------|-------r
         * 2       (1)             (4)             (6)             (9)
         *          |---r                                       l---|
         * 3           (2)                                     (8)
         *
         * */

        TestUtils.setRelations(node1, node3, null, node2);
        TestUtils.setRelations(node2, node1, null, null);
        TestUtils.setRelations(node3, node5, node1, node4);
        TestUtils.setRelations(node4, node3, null, null);
        TestUtils.setRelations(node5, null, node3, node7);
        TestUtils.setRelations(node6, node7, null, null);
        TestUtils.setRelations(node7, node5, node6, node9);
        TestUtils.setRelations(node8, node9, null, null);
        TestUtils.setRelations(node9, node7, node8, null);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) node5);

        // When
        int depthOfNode1 = node1.depth();
        int depthOfNode2 = node2.depth();
        int depthOfNode3 = node3.depth();
        int depthOfNode4 = node4.depth();
        int depthOfNode5 = node5.depth();
        int depthOfNode6 = node6.depth();
        int depthOfNode7 = node7.depth();
        int depthOfNode8 = node8.depth();
        int depthOfNode9 = node9.depth();

        // Then
        assertEquals(2, depthOfNode1);
        assertEquals(3, depthOfNode2);
        assertEquals(1, depthOfNode3);
        assertEquals(2, depthOfNode4);
        assertEquals(0, depthOfNode5);
        assertEquals(2, depthOfNode6);
        assertEquals(1, depthOfNode7);
        assertEquals(3, depthOfNode8);
        assertEquals(2, depthOfNode9);
    }
}