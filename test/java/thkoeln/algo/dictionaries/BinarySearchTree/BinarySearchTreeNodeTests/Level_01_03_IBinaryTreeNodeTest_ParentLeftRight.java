package thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNodeTests;

import org.junit.jupiter.api.Test;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTreeNode;
import thkoeln.algo.dictionaries.TestUtils;
import thkoeln.algo.dictionaries.TreePrinter;

import static org.junit.jupiter.api.Assertions.*;

//                                 __      _____        ___ __      ___     __       __    __
//   .-----.---.-.----.-----.-----|  |_   /  |  .-----.'  _|  |_   /  .----|__.-----|  |--|  |_
//   |  _  |  _  |   _|  -__|     |   _|,' ,'|  |  -__|   _|   _|,' ,'|   _|  |  _  |     |   _|
//   |   __|___._|__| |_____|__|__|____/__/  |__|_____|__| |____/__/  |__| |__|___  |__|__|____|
//   |__|                                                                     |_____|

class Level_01_03_IBinaryTreeNodeTest_ParentLeftRight {

    @Test
    void Test_01_03_01_getParent_OnNewNode_ShouldBe_NULL() {
        // Given
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(1, "eins");

        // When
        IBinarySearchTreeNode<Integer, String> actualParent = node.getParent();

        // Then
        assertNull(actualParent);
    }


    @Test
    void Test_01_03_02_setParent_NewNode_OnNewNode_ShouldSetParentReference() {
        // Given
        Integer keyNode = 1;
        String valueNode = "eins";
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(keyNode, valueNode);

        Integer keyParent = 2;
        String valueParent = "zwei";
        IBinarySearchTreeNode<Integer, String> parent = new BinarySearchTreeNode<>(keyParent, valueParent);

        // When
        node.setParent(parent);
        IBinarySearchTreeNode<Integer, String> actualParent = node.getParent();

        // Then
        assertNotNull(actualParent);
        assertEquals(parent, actualParent);
    }


    @Test
    void Test_01_03_03_setParent_Null_OnExistingParent_ShouldSetParent_Null() {
        // Given
        Integer keyNode = 1;
        String valueNode = "eins";
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(keyNode, valueNode);

        Integer keyParent = 2;
        String valueParent = "zwei";
        IBinarySearchTreeNode<Integer, String> parent = new BinarySearchTreeNode<>(keyParent, valueParent);

        node.setParent(parent);
        IBinarySearchTreeNode<Integer, String> previousParent = node.getParent();

        // When
        node.setParent(null);
        IBinarySearchTreeNode<Integer, String> actualParent = node.getParent();

        // Then
        assertNotNull(previousParent);
        assertEquals(parent, previousParent);
        assertNull(actualParent);
    }


    @Test
    void Test_01_03_04_setParent_NewNode_OnExistingParent_ShouldSetParent_NewNode() {
        // Given
        Integer keyNode = 1;
        String valueNode = "eins";
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(keyNode, valueNode);

        Integer keyParent = 2;
        String valueParent = "zwei";
        IBinarySearchTreeNode<Integer, String> parent = new BinarySearchTreeNode<>(keyParent, valueParent);

        Integer keyNewNode = 3;
        String valueNewNode = "drei";
        IBinarySearchTreeNode<Integer, String> newNode = new BinarySearchTreeNode<>(keyNewNode, valueNewNode);

        node.setParent(parent);
        IBinarySearchTreeNode<Integer, String> previousParent = node.getParent();

        // When
        node.setParent(newNode);
        IBinarySearchTreeNode<Integer, String> actualParent = node.getParent();

        // Then
        assertNotNull(previousParent);
        assertEquals(parent, previousParent);

        assertNotNull(actualParent);
        assertEquals(newNode, actualParent);

    }


    @Test
    void Test_01_03_05_getLeft() {
        // Given
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(1, "eins");

        // When
        IBinarySearchTreeNode<Integer, String> actualLeft = node.getLeft();

        // Then
        assertNull(actualLeft);
    }


    @Test
    void Test_01_03_06_setLeft() {
        // Given
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(1, "eins");
        IBinarySearchTreeNode<Integer, String> left = new BinarySearchTreeNode<>(2, "zwei");

        // When
        node.setLeft(left);
        IBinarySearchTreeNode<Integer, String> actualLeft = node.getLeft();

        // Then
        assertNotNull(actualLeft);
        assertEquals(left, actualLeft);
    }


    @Test
    void Test_01_03_07_setLeft_Null_OnExistingLeftChild_ShouldSetLeftChild_Null() {
        // Given
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(1, "eins");
        IBinarySearchTreeNode<Integer, String> left = new BinarySearchTreeNode<>(2, "zwei");

        node.setLeft(left);
        IBinarySearchTreeNode<Integer, String> previousLeft = node.getLeft();

        // When
        node.setLeft(null);
        IBinarySearchTreeNode<Integer, String> actualLeft = node.getLeft();

        // Then
        assertNotNull(previousLeft);
        assertEquals(left, previousLeft);
        assertNull(actualLeft);
    }


    @Test
    void Test_01_03_08_getRight() {
        // Given
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(1, "eins");

        // When
        IBinarySearchTreeNode<Integer, String> actualRight = node.getRight();

        // Then
        assertNull(actualRight);
    }


    @Test
    void Test_01_03_09_setRight() {
        // Given
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(1, "eins");
        IBinarySearchTreeNode<Integer, String> right = new BinarySearchTreeNode<>(2, "zwei");

        // When
        node.setRight(right);
        IBinarySearchTreeNode<Integer, String> actualRight = node.getRight();

        // Then
        assertNotNull(actualRight);
        assertEquals(right, actualRight);
    }


    @Test
    void Test_01_03_10_setRight_Null_OnExistingRightChild_ShouldSetRightChild_Null() {
        // Given
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(1, "eins");
        IBinarySearchTreeNode<Integer, String> right = new BinarySearchTreeNode<>(2, "zwei");

        node.setRight(right);
        IBinarySearchTreeNode<Integer, String> previousRight = node.getRight();

        // When
        node.setRight(null);
        IBinarySearchTreeNode<Integer, String> actualRight = node.getRight();

        // Then
        assertNotNull(previousRight);
        assertEquals(right, previousRight);
        assertNull(actualRight);
    }


    @Test
    void Test_01_03_11_BIGBOSS_ParentLeftRight_StructureTest() {
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

        // When
        TestUtils.setRelations(node1, node2, null, null);
        TestUtils.setRelations(node2, node4, node1, node3);
        TestUtils.setRelations(node3, node2, null, null);
        TestUtils.setRelations(node4, null, node2, node6);
        TestUtils.setRelations(node5, node6, null, null);
        TestUtils.setRelations(node6, node4, node5, node7);
        TestUtils.setRelations(node7, node6, null, null);

        // TreePrinter.printNode((BinarySearchTreeNode) node4);

        // Then
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

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) node4);
    }
}