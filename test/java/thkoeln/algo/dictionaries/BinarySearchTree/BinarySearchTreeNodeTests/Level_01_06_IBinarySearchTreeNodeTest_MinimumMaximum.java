package thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNodeTests;

import org.junit.jupiter.api.Test;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTreeNode;
import thkoeln.algo.dictionaries.TreePrinter;
import thkoeln.algo.dictionaries.TestUtils;

import static org.junit.jupiter.api.Assertions.*;

class Level_01_06_IBinarySearchTreeNodeTest_MinimumMaximum {


    @Test
    void Test_01_06_01_minimum() {
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
        IBinarySearchTreeNode<Integer,String> minimumOfNode1 = node1.minimum();
        IBinarySearchTreeNode<Integer,String> minimumOfNode2 = node2.minimum();
        IBinarySearchTreeNode<Integer,String> minimumOfNode3 = node3.minimum();
        IBinarySearchTreeNode<Integer,String> minimumOfNode4 = node4.minimum();
        IBinarySearchTreeNode<Integer,String> minimumOfNode5 = node5.minimum();
        IBinarySearchTreeNode<Integer,String> minimumOfNode6 = node6.minimum();
        IBinarySearchTreeNode<Integer,String> minimumOfNode7 = node7.minimum();

        // Then
        assertNotNull(minimumOfNode1);
        assertNotNull(minimumOfNode2);
        assertNotNull(minimumOfNode3);
        assertNotNull(minimumOfNode4);
        assertNotNull(minimumOfNode5);
        assertNotNull(minimumOfNode6);
        assertNotNull(minimumOfNode7);

        assertEquals(node1, minimumOfNode1);
        assertEquals(node1, minimumOfNode2);
        assertEquals(node3, minimumOfNode3);
        assertEquals(node1, minimumOfNode4);
        assertEquals(node5, minimumOfNode5);
        assertEquals(node5, minimumOfNode6);
        assertEquals(node7, minimumOfNode7);
    }

    @Test
    void Test_01_06_02_minimum2() {
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
        IBinarySearchTreeNode<Integer,String> minimumOfNode1 = node1.minimum();
        IBinarySearchTreeNode<Integer,String> minimumOfNode2 = node2.minimum();
        IBinarySearchTreeNode<Integer,String> minimumOfNode3 = node3.minimum();
        IBinarySearchTreeNode<Integer,String> minimumOfNode4 = node4.minimum();
        IBinarySearchTreeNode<Integer,String> minimumOfNode5 = node5.minimum();
        IBinarySearchTreeNode<Integer,String> minimumOfNode6 = node6.minimum();
        IBinarySearchTreeNode<Integer,String> minimumOfNode7 = node7.minimum();
        IBinarySearchTreeNode<Integer,String> minimumOfNode8 = node8.minimum();
        IBinarySearchTreeNode<Integer,String> minimumOfNode9 = node9.minimum();

        // Then
        assertNotNull(minimumOfNode1);
        assertNotNull(minimumOfNode2);
        assertNotNull(minimumOfNode3);
        assertNotNull(minimumOfNode4);
        assertNotNull(minimumOfNode5);
        assertNotNull(minimumOfNode6);
        assertNotNull(minimumOfNode7);
        assertNotNull(minimumOfNode8);
        assertNotNull(minimumOfNode9);

        assertEquals(node1, minimumOfNode1);
        assertEquals(node2, minimumOfNode2);
        assertEquals(node1, minimumOfNode3);
        assertEquals(node4, minimumOfNode4);
        assertEquals(node1, minimumOfNode5);
        assertEquals(node6, minimumOfNode6);
        assertEquals(node6, minimumOfNode7);
        assertEquals(node8, minimumOfNode8);
        assertEquals(node8, minimumOfNode9);
    }

    @Test
    void Test_01_06_03_maximum() {
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

        // When
        IBinarySearchTreeNode<Integer,String> maximumOfNode1 = node1.maximum();
        IBinarySearchTreeNode<Integer,String> maximumOfNode2 = node2.maximum();
        IBinarySearchTreeNode<Integer,String> maximumOfNode3 = node3.maximum();
        IBinarySearchTreeNode<Integer,String> maximumOfNode4 = node4.maximum();
        IBinarySearchTreeNode<Integer,String> maximumOfNode5 = node5.maximum();
        IBinarySearchTreeNode<Integer,String> maximumOfNode6 = node6.maximum();
        IBinarySearchTreeNode<Integer,String> maximumOfNode7 = node7.maximum();

        // Then
        assertNotNull(maximumOfNode1);
        assertNotNull(maximumOfNode2);
        assertNotNull(maximumOfNode3);
        assertNotNull(maximumOfNode4);
        assertNotNull(maximumOfNode5);
        assertNotNull(maximumOfNode6);
        assertNotNull(maximumOfNode7);

        assertEquals(node1, maximumOfNode1);
        assertEquals(node3, maximumOfNode2);
        assertEquals(node3, maximumOfNode3);
        assertEquals(node7, maximumOfNode4);
        assertEquals(node5, maximumOfNode5);
        assertEquals(node7, maximumOfNode6);
        assertEquals(node7, maximumOfNode7);
    }

    @Test
    void Test_01_06_04_maximum2() {
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
         * 0               (4)
         *          l-------|-------r
         * 1       (2)             (6)
         *      l---|---r       l---|---r
         * 2   (1)     (3)     (5)     (7)
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
        IBinarySearchTreeNode<Integer,String> maximumOfNode1 = node1.maximum();
        IBinarySearchTreeNode<Integer,String> maximumOfNode2 = node2.maximum();
        IBinarySearchTreeNode<Integer,String> maximumOfNode3 = node3.maximum();
        IBinarySearchTreeNode<Integer,String> maximumOfNode4 = node4.maximum();
        IBinarySearchTreeNode<Integer,String> maximumOfNode5 = node5.maximum();
        IBinarySearchTreeNode<Integer,String> maximumOfNode6 = node6.maximum();
        IBinarySearchTreeNode<Integer,String> maximumOfNode7 = node7.maximum();
        IBinarySearchTreeNode<Integer,String> maximumOfNode8 = node8.maximum();
        IBinarySearchTreeNode<Integer,String> maximumOfNode9 = node9.maximum();

        // Then
        assertNotNull(maximumOfNode1);
        assertNotNull(maximumOfNode2);
        assertNotNull(maximumOfNode3);
        assertNotNull(maximumOfNode4);
        assertNotNull(maximumOfNode5);
        assertNotNull(maximumOfNode6);
        assertNotNull(maximumOfNode7);
        assertNotNull(maximumOfNode8);
        assertNotNull(maximumOfNode9);

        assertEquals(node2, maximumOfNode1);
        assertEquals(node2, maximumOfNode2);
        assertEquals(node4, maximumOfNode3);
        assertEquals(node4, maximumOfNode4);
        assertEquals(node9, maximumOfNode5);
        assertEquals(node6, maximumOfNode6);
        assertEquals(node9, maximumOfNode7);
        assertEquals(node8, maximumOfNode8);
        assertEquals(node9, maximumOfNode9);
    }
}