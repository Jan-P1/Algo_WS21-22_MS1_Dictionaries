package thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNodeTests;

import org.junit.jupiter.api.Test;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IBinarySearchTreeNode;


import static org.junit.jupiter.api.Assertions.*;

//    __                   ___            __
//   |  |--.-----.--.--.  /  .--.--.---.-|  .--.--.-----.
//   |    <|  -__|  |  |,' ,'|  |  |  _  |  |  |  |  -__|
//   |__|__|_____|___  /__/   \___/|___._|__|_____|_____|
//               |_____|

class Level_01_02_IBinaryTreeNodeTest_KeyValue {

    @Test
    void Test_01_02_01_binaryTreeNode_setKey_NULL_ShouldThrow_IllegalArgumentException() {
        // Given
        Integer key = 5;
        String value = "5";
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(key, value);

        // When
        Exception exception = assertThrows(IllegalArgumentException.class, () -> node.setKey(null));

        String expectedMessage = "key can't be null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage), "setKey(null) soll IllegalArgumentException werfen. ");

    }

    @Test
    void Test_01_02_02_binaryTreeNode_setKey_NewKey_getKey () {
        // Given
        Integer key = 5;
        String value = "5";
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(key, value);
        Integer newKey = 6;

        // When
        node.setKey(newKey);
        Integer actualKey = node.getKey();

        assertEquals(newKey, actualKey);
    }

    /*
    @Test
    void Test_01_02_03_binaryTreeNode_setValue_NULL_ShouldThrow_IllegalArgumentException () {
        // Given
        Integer key = 5;
        String value = "5";
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(key, value);

        // When
        Exception exception = assertThrows(IllegalArgumentException.class, () -> node.setValue(null));

        String expectedMessage = "value can't be null";
        String actualMessage = exception.getMessage();

        // Then
        assertTrue(actualMessage.contains(expectedMessage), "setValue(null) soll IllegalArgumentException werfen. ");
    }
    */

    @Test
    void Test_01_02_04_binaryTreeNode_setValue_NewValue_getValue () {
        // Given
        Integer key = 5;
        String value = "5";
        IBinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(key, value);
        String newValue = "6";

        // When
        node.setValue(newValue);
        String actualValue = node.getValue();

        // Then
        assertEquals(newValue, actualValue);
        assertEquals(newValue, actualValue);
    }

}
