package thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNodeTests;

import org.junit.jupiter.api.Test;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTreeNode;
import thkoeln.algo.dictionaries.TreePrinter;
import thkoeln.algo.dictionaries.TestUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class Level_01_07_IBinarySearchTreeNodeTest_HeightDepth {



    @Test
    void Test_01_07_01_Height_of_SingleNode_Should_be_one () {
        // Given
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(1, "1");

        TestUtils.setRelations(node, null, null, null);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) node);

        // When
        int actualHeight = node.height();

        // Then
        assertEquals(1, actualHeight);
    }

    @Test
    void Test_01_07_02_Height_of_TwoNodes_Should_be_2 () {
        // Given
        IBinarySearchTreeNode<Integer, String> node1 = new BinarySearchTreeNode<>(1, "1");
        IBinarySearchTreeNode<Integer, String> node2 = new BinarySearchTreeNode<>(2, "2");

        /*
         *
         * 0       (1)
         *          |---r
         * 1           (2)
         *
         */
        TestUtils.setRelations(node1, null, null, node2);
        TestUtils.setRelations(node2, node1, null, null);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) node1);

        // When
        int node1Height = node1.height();
        int node2Height = node2.height();

        // Then
        assertEquals(2, node1Height);
        assertEquals(1, node2Height);
    }

    @Test
    void Test_01_07_03_Height_of_RootLeftRightCildren_Should_be_2 () {
        // Given
        IBinarySearchTreeNode<Integer, String> node1 = new BinarySearchTreeNode<>(1, "1");
        IBinarySearchTreeNode<Integer, String> node2 = new BinarySearchTreeNode<>(2, "2");
        IBinarySearchTreeNode<Integer, String> node3 = new BinarySearchTreeNode<>(3, "3");

        /*
         *
         * 0       (2)
         *      l---|---r
         * 1   (1)     (3)
         *
         */
        TestUtils.setRelations(node1, node2, null, null);
        TestUtils.setRelations(node2, null, node1, node3);
        TestUtils.setRelations(node3, node2, null, null);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) node2);

        // When
        int node1Height = node1.height();
        int node2Height = node2.height();
        int node3Height = node3.height();

        // Then
        assertEquals(1, node1Height);
        assertEquals(2, node2Height);
        assertEquals(1, node3Height);
    }

    @Test
    void Test_01_07_04_Height_of_RootWithOneGrandchild_Should_be_3 () {
        // Given
        IBinarySearchTreeNode<Integer, String> node1 = new BinarySearchTreeNode<>(1, "1");
        IBinarySearchTreeNode<Integer, String> node2 = new BinarySearchTreeNode<>(2, "2");
        IBinarySearchTreeNode<Integer, String> node3 = new BinarySearchTreeNode<>(3, "3");

        /*
         * 0               (1)
         *                  |-------r
         * 1                       (3)
         *                      l---|
         * 2                   (2)
         *
         */
        TestUtils.setRelations(node1, null, null, node3);
        TestUtils.setRelations(node2, node3, null, null);
        TestUtils.setRelations(node3, node1, node2, null);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) node1);

        // When
        int node1Height = node1.height();
        int node2Height = node2.height();
        int node3Height = node3.height();

        // Then
        assertEquals(3, node1Height);
        assertEquals(1, node2Height);
        assertEquals(2, node3Height);
    }

    @Test
    void Test_01_07_05_Height() {
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


        TestUtils.setRelations(node1, node2, null, null);
        TestUtils.setRelations(node2, node4, node1, node3);
        TestUtils.setRelations(node3, node2, null, null);
        TestUtils.setRelations(node4, null, node2, node6);
        TestUtils.setRelations(node5, node6, null, null);
        TestUtils.setRelations(node6, node4, node5, node7);
        TestUtils.setRelations(node7, node6, null, null);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) node4);

        // When
        int heightOfNode1 = node1.height();
        int heightOfNode2 = node2.height();
        int heightOfNode3 = node3.height();
        int heightOfNode4 = node4.height();
        int heightOfNode5 = node5.height();
        int heightOfNode6 = node6.height();
        int heightOfNode7 = node7.height();

        // Then
        assertEquals(1, heightOfNode1);
        assertEquals(2, heightOfNode2);
        assertEquals(1, heightOfNode3);
        assertEquals(3, heightOfNode4);
        assertEquals(1, heightOfNode5);
        assertEquals(2, heightOfNode6);
        assertEquals(1, heightOfNode7);
    }

    @Test
    void Test_01_07_06_height2() {
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
        int heightOfNode1 = node1.height();
        int heightOfNode2 = node2.height();
        int heightOfNode3 = node3.height();
        int heightOfNode4 = node4.height();
        int heightOfNode5 = node5.height();
        int heightOfNode6 = node6.height();
        int heightOfNode7 = node7.height();
        int heightOfNode8 = node8.height();
        int heightOfNode9 = node9.height();


        // Then
        assertEquals(2, heightOfNode1);
        assertEquals(1, heightOfNode2);
        assertEquals(3, heightOfNode3);
        assertEquals(1, heightOfNode4);
        assertEquals(4, heightOfNode5);
        assertEquals(1, heightOfNode6);
        assertEquals(3, heightOfNode7);
        assertEquals(1, heightOfNode8);
        assertEquals(2, heightOfNode9);
    }

    @Test
    void Test_01_07_07_Depth_of_SingleNode_Should_be_0 () {
        // Given
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(1, "1");

        TestUtils.setRelations(node, null, null, null);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) node);

        // When
        int actualHeight = node.height();

        // Then
        assertEquals(1, actualHeight);
    }

    @Test
    void Test_01_07_08_Depth_of_RootOfTwoNodes_Should_be_0 () {
        // Given
        IBinarySearchTreeNode<Integer, String> node1 = new BinarySearchTreeNode<>(1, "1");
        IBinarySearchTreeNode<Integer, String> node2 = new BinarySearchTreeNode<>(2, "2");

        /*
         *
         * 0       (1)
         *          |---r
         * 1           (2)
         *
         */

        TestUtils.setRelations(node1, null, null, node2);
        TestUtils.setRelations(node2, node1, null, null);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) node1);

        // When
        int node1Depth = node1.depth();
        int node2Depth = node2.depth();

        // Then
        assertEquals(0, node1Depth);
        assertEquals(1, node2Depth);
    }

    @Test
    void Test_01_07_09_Depth_of_RootWithOneGrandchild_Should_be_0 () {
        // Given
        IBinarySearchTreeNode<Integer, String> node1 = new BinarySearchTreeNode<>(1, "1");
        IBinarySearchTreeNode<Integer, String> node2 = new BinarySearchTreeNode<>(2, "2");
        IBinarySearchTreeNode<Integer, String> node3 = new BinarySearchTreeNode<>(3, "3");

        /*
         * 0               (1)
         *                  |-------r
         * 1                       (3)
         *                      l---|
         * 2                   (2)
         *
         */
        TestUtils.setRelations(node1, null, null, node3);
        TestUtils.setRelations(node2, node3, null, null);
        TestUtils.setRelations(node3, node1, node2, null);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) node1);

        // When
        int node1Depth = node1.depth();
        int node2Depth = node2.depth();
        int node3Depth = node3.depth();

        // Then
        assertEquals(0, node1Depth);
        assertEquals(2, node2Depth);
        assertEquals(1, node3Depth);
    }

    @Test
    void Test_01_07_10_depth() {
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


        TestUtils.setRelations(node1, node2, null, null);
        TestUtils.setRelations(node2, node4, node1, node3);
        TestUtils.setRelations(node3, node2, null, null);
        TestUtils.setRelations(node4, null, node2, node6);
        TestUtils.setRelations(node5, node6, null, null);
        TestUtils.setRelations(node6, node4, node5, node7);
        TestUtils.setRelations(node7, node6, null, null);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) node4);

        // When
        int depthOfNode1 = node1.depth();
        int depthOfNode2 = node2.depth();
        int depthOfNode3 = node3.depth();
        int depthOfNode4 = node4.depth();
        int depthOfNode5 = node5.depth();
        int depthOfNode6 = node6.depth();
        int depthOfNode7 = node7.depth();

        // Then
        assertEquals(2, depthOfNode1);
        assertEquals(1, depthOfNode2);
        assertEquals(2, depthOfNode3);
        assertEquals(0, depthOfNode4);
        assertEquals(2, depthOfNode5);
        assertEquals(1, depthOfNode6);
        assertEquals(2, depthOfNode7);
    }

    @Test
    void Test_01_07_11_depth2() {
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