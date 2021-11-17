package thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNodeTests;

import org.junit.jupiter.api.Test;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTreeNode;


import static org.junit.jupiter.api.Assertions.*;

//                           __                   __
//   .----.-----.-----.-----|  |_.----.--.--.----|  |_.-----.----.
//   |  __|  _  |     |__ --|   _|   _|  |  |  __|   _|  _  |   _|
//   |____|_____|__|__|_____|____|__| |_____|____|____|_____|__|

class Level_01_01_IBinaryTreeNodeTest_Constructor {

    @Test
    void Test_01_01_01_binaryTreeNodeConstructor_KeyNull_shouldThrowIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            IBinarySearchTreeNode<Integer, Integer> intTree = new BinarySearchTreeNode<>(null, 1);
        });

        String expectedMessage = "key can't be null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage), "Konstruktor mit 'key = null soll IllegalArgumentException werfen. ");
    }

    @Test
    void Test_01_01_02_binaryTreeNodeConstructor_shouldSetKeyAndValue() {
        // Given
        Integer key = 5;
        String value = "f�nf";

        // When
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(key, value);
        Integer actualKey = node.getKey();
        String actualValue = node.getValue();

        // Then
        assertEquals(key, actualKey);
        assertEquals(value, actualValue);

        assertNull(node.getParent());
        assertNull(node.getLeft());
        assertNull(node.getRight());
    }


}