package thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNodeTests;

import org.junit.jupiter.api.Test;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTreeNode;
import thkoeln.algo.dictionaries.TestUtils;

import static org.junit.jupiter.api.Assertions.*;

class Level_01_05_IBinarySearchTreeNodeTest_PredecessorSuccessor {


    @Test
    void Test_01_05_01_predecessor_SingleNode_ShouldBe_NULL() {
        // Given
        IBinarySearchTreeNode<Integer, String> node1 = new BinarySearchTreeNode<>(1, "1");

        TestUtils.setRelations(node1, null, null, null);

        // When
        IBinarySearchTreeNode<Integer,String> predecessorOfNode1 = node1.predecessor();

        // Then
        assertNull(predecessorOfNode1);
    }



    @Test
    void Test_01_05_02_predecessor() {
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
        IBinarySearchTreeNode<Integer,String> predecessorOfNode1 = node1.predecessor();
        IBinarySearchTreeNode<Integer,String> predecessorOfNode2 = node2.predecessor();
        IBinarySearchTreeNode<Integer,String> predecessorOfNode3 = node3.predecessor();
        IBinarySearchTreeNode<Integer,String> predecessorOfNode4 = node4.predecessor();
        IBinarySearchTreeNode<Integer,String> predecessorOfNode5 = node5.predecessor();
        IBinarySearchTreeNode<Integer,String> predecessorOfNode6 = node6.predecessor();
        IBinarySearchTreeNode<Integer,String> predecessorOfNode7 = node7.predecessor();

        // Then
        assertNull(predecessorOfNode1);
        assertNotNull(predecessorOfNode2);
        assertNotNull(predecessorOfNode3);
        assertNotNull(predecessorOfNode4);
        assertNotNull(predecessorOfNode5);
        assertNotNull(predecessorOfNode6);
        assertNotNull(predecessorOfNode7);

        assertEquals(node1, predecessorOfNode2);
        assertEquals(node2, predecessorOfNode3);
        assertEquals(node3, predecessorOfNode4);
        assertEquals(node4, predecessorOfNode5);
        assertEquals(node5, predecessorOfNode6);
        assertEquals(node6, predecessorOfNode7);
    }

    @Test
    void Test_01_05_03_successor_of_SingleNode_ShouldBe_NULL() {
        // Given
        IBinarySearchTreeNode<Integer, String> node1 = new BinarySearchTreeNode<>(1, "1");

        TestUtils.setRelations(node1, null, null, null);

        // When
        IBinarySearchTreeNode<Integer,String> successorOfNode1 = node1.successor();

        // Then
        assertNull(successorOfNode1);
    }

    @Test
    void Test_01_05_04_successor() {
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
        IBinarySearchTreeNode<Integer,String> successorOfNode1 = node1.successor();
        IBinarySearchTreeNode<Integer,String> successorOfNode3 = node3.successor();
        IBinarySearchTreeNode<Integer,String> successorOfNode2 = node2.successor();
        IBinarySearchTreeNode<Integer,String> successorOfNode4 = node4.successor();
        IBinarySearchTreeNode<Integer,String> successorOfNode5 = node5.successor();
        IBinarySearchTreeNode<Integer,String> successorOfNode6 = node6.successor();
        IBinarySearchTreeNode<Integer,String> successorOfNode7 = node7.successor();

        // Then
        assertNotNull(successorOfNode1);
        assertNotNull(successorOfNode2);
        assertNotNull(successorOfNode3);
        assertNotNull(successorOfNode4);
        assertNotNull(successorOfNode5);
        assertNotNull(successorOfNode6);

        assertNull(successorOfNode7);

        assertEquals(node2, successorOfNode1);
        assertEquals(node3, successorOfNode2);
        assertEquals(node4, successorOfNode3);
        assertEquals(node5, successorOfNode4);
        assertEquals(node6, successorOfNode5);
        assertEquals(node7, successorOfNode6);

    }
}