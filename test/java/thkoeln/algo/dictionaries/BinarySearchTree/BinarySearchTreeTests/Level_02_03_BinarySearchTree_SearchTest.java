package thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeTests;

import org.junit.jupiter.api.Test;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTree;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTree;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTreeNode;
import thkoeln.algo.dictionaries.TreePrinter;

import static org.junit.jupiter.api.Assertions.*;

class Level_02_03_BinarySearchTree_SearchTest {


    @Test
    void Level_02_03_01_Search_On_EmptyTree_ShouldBeNull() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();

        // When
        String actualSearchResult = tree.search(4);

        // Then
        assertNull(actualSearchResult);
        assertTrue(tree.isEmpty());
    }

    @Test
    void Level_02_03_02_Search_On_SingleKeyNoValue_ShouldBeNull() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>(4);

        // When
        String actualSearchResult = tree.search(4);

        // Then
        assertNull(actualSearchResult);
        assertFalse(tree.isEmpty());
    }

    @Test
    void Level_02_03_03_Search_On_SingleKeyValue_ShouldFindValue() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(4, "4");

        // When
        String actualSearchResult = tree.search(4);

        // Then
        assertNotNull(actualSearchResult);
        assertEquals("4", actualSearchResult);
        assertFalse(tree.isEmpty());
    }


    @Test
    void Level_02_03_04_BinarySearchTree_Search() {
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

        // When
        String actualNode4Value = tree.search(4);
        String actualNode2Value = tree.search(2);
        String actualNode3Value = tree.search(3);
        String actualNode1Value = tree.search(1);
        String actualNode6Value = tree.search(6);
        String actualNode7Value = tree.search(7);
        String actualNode5Value = tree.search(5);

        String actualNodeMinusOneValue = tree.search(-1);
        String actualNode0Value = tree.search(0);
        String actualNode8Value = tree.search(8);

        // Then
        assertNotNull(actualNode4Value);
        assertEquals("4", actualNode4Value);

        assertNotNull(actualNode2Value);
        assertEquals("2", actualNode2Value);

        assertNotNull(actualNode3Value);
        assertEquals("3", actualNode3Value);

        assertNotNull(actualNode1Value);
        assertEquals("1", actualNode1Value);

        assertNotNull(actualNode6Value);
        assertEquals("6", actualNode6Value);

        assertNotNull(actualNode7Value);
        assertEquals("7", actualNode7Value);

        assertNotNull(actualNode5Value);
        assertEquals("5", actualNode5Value);


        assertNull(actualNodeMinusOneValue);
        assertNull(actualNode0Value);
        assertNull(actualNode8Value);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
    }

    @Test
    void Level_02_03_05_BinarySearchTree_ContainsKey() {
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

        // When
        boolean actualNode4Value = tree.containsKey(4);
        boolean actualNode2Value = tree.containsKey(2);
        boolean actualNode3Value = tree.containsKey(3);
        boolean actualNode1Value = tree.containsKey(1);
        boolean actualNode6Value = tree.containsKey(6);
        boolean actualNode7Value = tree.containsKey(7);
        boolean actualNode5Value = tree.containsKey(5);

        boolean actualNodeMinusOneValue = tree.containsKey(-1);
        boolean actualNode0Value = tree.containsKey(0);
        boolean actualNode8Value = tree.containsKey(8);

        // Then
        assertTrue(actualNode4Value);
        assertTrue(actualNode2Value);
        assertTrue(actualNode3Value);
        assertTrue(actualNode1Value);
        assertTrue(actualNode6Value);
        assertTrue(actualNode7Value);
        assertTrue(actualNode5Value);

        assertFalse(actualNodeMinusOneValue);
        assertFalse(actualNode0Value);
        assertFalse(actualNode8Value);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
    }

    @Test
    void Level_02_03_06_BinarySearchTree_getNode_NotInTree_Test() {
        // Given
        IBinarySearchTree<Integer, String> tree = new BinarySearchTree<>();

        /*
         * 0       (2)
         *      l---|---r
         * 1   (1)     (3)
         */

        tree.insert(2,1,3);

        // When
        IBinarySearchTreeNode<Integer, String> node1 = tree.getNode(1);
        IBinarySearchTreeNode<Integer, String> node4 = tree.getNode(4);

        // Then
        assertNotNull(node1);
        assertNull(node4);

        TreePrinter.printNode((BinarySearchTreeNode<Integer, String>) tree.getRoot());
    }

    @Test
    void Level_02_03_07_BinarySearchTree_getNode_Test() {
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

        // When
        IBinarySearchTreeNode<Integer, String> node1 = tree.getNode(1);
        IBinarySearchTreeNode<Integer, String> node2 = tree.getNode(2);
        IBinarySearchTreeNode<Integer, String> node3 = tree.getNode(3);
        IBinarySearchTreeNode<Integer, String> node4 = tree.getNode(4);
        IBinarySearchTreeNode<Integer, String> node5 = tree.getNode(5);
        IBinarySearchTreeNode<Integer, String> node6 = tree.getNode(6);
        IBinarySearchTreeNode<Integer, String> node7 = tree.getNode(7);

        // When
        Integer keyOfNode1 = node1.getKey();
        Integer keyOfNode2 = node2.getKey();
        Integer keyOfNode3 = node3.getKey();
        Integer keyOfNode4 = node4.getKey();
        Integer keyOfNode5 = node5.getKey();
        Integer keyOfNode6 = node6.getKey();
        Integer keyOfNode7 = node7.getKey();

        String valueOfNode1 = node1.getValue();
        String valueOfNode2 = node2.getValue();
        String valueOfNode3 = node3.getValue();
        String valueOfNode4 = node4.getValue();
        String valueOfNode5 = node5.getValue();
        String valueOfNode6 = node6.getValue();
        String valueOfNode7 = node7.getValue();

        // Then
        assertEquals(1, keyOfNode1);
        assertEquals(2, keyOfNode2);
        assertEquals(3, keyOfNode3);
        assertEquals(4, keyOfNode4);
        assertEquals(5, keyOfNode5);
        assertEquals(6, keyOfNode6);
        assertEquals(7, keyOfNode7);

        assertEquals("1", valueOfNode1);
        assertEquals("2", valueOfNode2);
        assertEquals("3", valueOfNode3);
        assertEquals("4", valueOfNode4);
        assertEquals("5", valueOfNode5);
        assertEquals("6", valueOfNode6);
        assertEquals("7", valueOfNode7);
    }
}