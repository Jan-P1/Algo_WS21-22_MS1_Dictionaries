package thkoeln.algo;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTree;
import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;
import thkoeln.algo.dictionaries.BinarySearchTree.IDictionary;
import thkoeln.algo.dictionaries.TreePrinter;

import java.awt.event.TextListener;

public class Main {

    public static void main(String[] args) {

        // Hier verwenden wir den BinarySearchTree nur in der Abstraktion eines Dictionaries.
        // Die Interne Struktur ist uns auf dieser Ebene egal - wir wollen nur m�glichst
        // performanten Zugriff auf Objekte in einer dynamischen Menge.

        System.out.print("Erzeuge neues Dictionary (implementiert durch einen BinarySearchTree): ");
        IDictionary<Integer, String> dict = new BinarySearchTree<>();
        System.out.println("done.");

        System.out.println("dict.ToString():");
        System.out.println(dict.toString());


        System.out.println("\tdict.isEmpty() : " + dict.isEmpty());

        System.out.print("dict.insert(1) --> ");
        dict.insert(1);
        System.out.println("dict.isEmpty() : " + dict.isEmpty());

        System.out.println("Leeren/Zur�cksetzen des Dictionaries --> ");
        System.out.print("\tdict.empty() --> ");
        dict.empty();
        System.out.println("dict.isEmpty() : " + dict.isEmpty());

        dict.insert(4);
        dict.insert(2, 6);
        dict.insert(1, 3, 5, 7);


        // mit einem "Unchecked Cast" in einen BinarySearchTree k�nnen wir und trotzdem
        // den Wurzelknoten holen und die Baumstruktur �ber die Treeprinter-Klasse
        // auf der Konsole ausgeben. ;o)
        BinarySearchTreeNode<Integer, String> root = (BinarySearchTreeNode<Integer, String>) ((BinarySearchTree) dict).getRoot();

        TreePrinter.printNode(root);
    }
}
