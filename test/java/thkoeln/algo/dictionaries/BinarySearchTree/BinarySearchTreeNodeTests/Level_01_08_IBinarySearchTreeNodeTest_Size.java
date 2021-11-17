package thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNodeTests;

import org.junit.jupiter.api.Test;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTreeNode;
import thkoeln.algo.dictionaries.TreePrinter;
import thkoeln.algo.dictionaries.TestUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Level_01_08_IBinarySearchTreeNodeTest_Size {



    @Test
    void Test_01_08_01_Size_of_SingleNode_Should_be_one () {
        // Given
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(1, "1");

        TestUtils.setRelations(node, null, null, null);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) node);

        // When
        int actualSize = node.size();

        // Then
        assertEquals(1, actualSize);
    }

    @Test
    void Test_01_08_02_Size_of_TwoNodes_Should_be_2 () {
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
        int node1Size = node1.size();
        int node2Size = node2.size();

        // Then
        assertEquals(2, node1Size);
        assertEquals(1, node2Size);
    }

    @Test
    void Test_01_08_03_Size_of_RootLeftRightCildren_Should_be_3 () {
        // Given
        IBinarySearchTreeNode<Integer, String> node1 = new BinarySearchTreeNode<>(1, "1");
        IBinarySearchTreeNode<Integer, String> node2 = new BinarySearchTreeNode<>(2, "2");
        IBinarySearchTreeNode<Integer, String> node3 = new BinarySearchTreeNode<>(3, "3");

        /*
         *       0       (2)
         *            l---|---r
         *       1   (1)     (3)
         */

        TestUtils.setRelations(node1, node2, null, null);
        TestUtils.setRelations(node2, null, node1, node3);
        TestUtils.setRelations(node3, node2, null, null);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) node2);

        // When
        int node1Size = node1.size();
        int node2Size = node2.size();
        int node3Size = node3.size();

        // Then
        assertEquals(1, node1Size);
        assertEquals(3, node2Size);
        assertEquals(1, node3Size);
    }

    @Test
    void Test_01_08_04_Size_of_RootWithOneGrandchild_Should_be_3 () {
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
        int node1Size = node1.size();
        int node2Size = node2.size();
        int node3Size = node3.size();

        // Then
        assertEquals(3, node1Size);
        assertEquals(1, node2Size);
        assertEquals(2, node3Size);
    }

    @Test
    void Test_01_08_05_Size() {
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
        int sizeOfNode1 = node1.size();
        int sizeOfNode2 = node2.size();
        int sizeOfNode3 = node3.size();
        int sizeOfNode4 = node4.size();
        int sizeOfNode5 = node5.size();
        int sizeOfNode6 = node6.size();
        int sizeOfNode7 = node7.size();

        // Then
        assertEquals(1, sizeOfNode1);
        assertEquals(3, sizeOfNode2);
        assertEquals(1, sizeOfNode3);
        assertEquals(7, sizeOfNode4);
        assertEquals(1, sizeOfNode5);
        assertEquals(3, sizeOfNode6);
        assertEquals(1, sizeOfNode7);
    }

    @Test
    void Test_01_08_06_size2() {
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
        IBinarySearchTreeNode<Integer, String> node10 = new BinarySearchTreeNode<>(10, "10");

        /*
         *  0                               (5)
         *                   l---------------|---------------r
         *  1               (3)                             (7)
         *           l-------|-------r               l-------|-------r
         *  2       (1)             (4)             (6)             (9)
         *           |---r                                       l---|---r
         *  3           (2)                                     (8)    (10)
         */

        TestUtils.setRelations(node1, node3, null, node2);
        TestUtils.setRelations(node2, node1, null, null);
        TestUtils.setRelations(node3, node5, node1, node4);
        TestUtils.setRelations(node4, node3, null, null);
        TestUtils.setRelations(node5, null, node3, node7);
        TestUtils.setRelations(node6, node7, null, null);
        TestUtils.setRelations(node7, node5, node6, node9);
        TestUtils.setRelations(node8, node9, null, null);
        TestUtils.setRelations(node9, node7, node8, node10);
        TestUtils.setRelations(node10, node9, null, null);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) node5);

        // When
        int sizeOfNode1 = node1.size();
        int sizeOfNode2 = node2.size();
        int sizeOfNode3 = node3.size();
        int sizeOfNode4 = node4.size();
        int sizeOfNode5 = node5.size();
        int sizeOfNode6 = node6.size();
        int sizeOfNode7 = node7.size();
        int sizeOfNode8 = node8.size();
        int sizeOfNode9 = node9.size();
        int sizeOfNode10 = node10.size();


        // Then
        assertEquals(2, sizeOfNode1);
        assertEquals(1, sizeOfNode2);
        assertEquals(4, sizeOfNode3);
        assertEquals(1, sizeOfNode4);
        assertEquals(10, sizeOfNode5);
        assertEquals(1, sizeOfNode6);
        assertEquals(5, sizeOfNode7);
        assertEquals(1, sizeOfNode8);
        assertEquals(3, sizeOfNode9);
        assertEquals(1, sizeOfNode10);

    }

}