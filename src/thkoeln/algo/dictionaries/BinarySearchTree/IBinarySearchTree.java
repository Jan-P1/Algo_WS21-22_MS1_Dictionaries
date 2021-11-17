package thkoeln.algo.dictionaries.BinarySearchTree;

import java.util.ArrayList;

//    ___       __               ___
//   |   .-----|  |_.-----.----.'  _.---.-.----.-----.
//   |.  |     |   _|  -__|   _|   _|  _  |  __|  -__|
//   |.  |__|__|____|_____|__| |__| |___._|____|_____|
//   |:  |
//   |::.|
//   `---'
//    _______ __                        _______                       __    _______
//   |   _   |__.-----.---.-.----.--.--|   _   .-----.---.-.----.----|  |--|       .----.-----.-----.
//   |.  1   |  |     |  _  |   _|  |  |   1___|  -__|  _  |   _|  __|     |.|   | |   _|  -__|  -__|
//   |.  _   |__|__|__|___._|__| |___  |____   |_____|___._|__| |____|__|__`-|.  |-|__| |_____|_____|
//   |:  1    \                  |_____|:  1   |                             |:  |
//   |::.. .  /                        |::.. . |                             |::.|
//   `-------'                         `-------'                             `---'
//
//  LEVEL 2 - IBinarySearchTree - Der bin�re Suchbaum
//
//  Sie sehen unten das Interface eines Binary-Search-Tree (BST) als Spezialisierung/Erweiterung eines Dictionaries.
//
//  Aufgabenstellung:
//      "Implementieren Sie die Konstruktoren und Operationen/Methoden des BinarySearchTree,
//       sodass alle IBinarySearchTree-Tests gr�n/bestanden sind."
//
// ---------------------------------------------------------------------------------------------------
//
//  Wenn Sie die Tests von *LEVEL 1* alle bestanden haben, erf�llt der BinarySearchTreeNode alle
//  Voraussetzungen f�r die Operationen des BinarySearchTree.
//  Schlie�en sie also Bitte zuerst die Tests von *LEVEL 1* ab, bevor Sie mit dem BinarySearchTree beginnen!
//
//  Die Klasse BinarySearchTree ist bereits vorgegeben und Sie m�ssen nun die
//  einzelnen Operationen/Methoden implementieren und die mitgelieferten Tests erf�llen.
//
//  Orientieren Sie sich an der Reihenfolge der Tests. Hierbei kann es sich ergeben,
//  dass Sie z.B. Predecessor/Successor/Minimum/Maximum schon verwenden m�chten oder
//  andere/weitere Operationen ben�tigen - implementieren Sie sie.
//  Solange am Ende des Levels alle Test (gegen das Interface) gr�n/bestanden sind, ist alles ok ;O)
//
// ---------------------------------------------------------------------------------------------------
//
//  Anmerkungen und Vorgehensweise:
//
//  Die Tests zu *LEVEL 2* finden Sie package
//      test/java/thkoeln/algo/dictionaries/BinarySearchTree/BinarySearchTreeTests
//
//  Implementieren Sie zun�chst die Konstruktor-Varianten. Hierbei Kann es Sein, dass Sie z.B.
//  das Einf�gen oder die Suche ben�tigen - dann implementieren Sie sie.
//  Constructor:
//        Level_02_01_BinarySearchTree_ConstructorTest
//
//  Implementieren Sie das Einf�gen, Suchen und L�schen f�r den bin�ren Suchbaum.
//  Search/Insert/Delete:
//        Level_02_02_BinarySearchTree_InsertTest
//        Level_02_03_BinarySearchTree_SearchTest
//        Level_02_04_BinarySearchTree_DeleteTest
//
//  Die Tests f�r weitere Operationen (die Sie ggf. bereits bei der Implementierung ben�tigen)
//  Abfragen:
//        Level_02_05_IBinarySearchTreeTest_PredecessorSuccessor
//        Level_02_06_IBinarySearchTreeTest_MinimumMaximum
//        Level_02_07_IBinarySearchTreeTest_HeightDepth
//        Level_02_08_BinarySearchTree_SizeTest
//
//  Sobald Sie die Knotenstruktur-Tests aus Level 1 bestanden haben das Einf�gen/Insert
//  implementiert haben, k�nnen Sie mit der implementierung der Traversierungs-Methoden beginnen.
//  Traversierung des Baumes:
//        Level_02_09_IBinarySearchTreeTest_Traverse
//
//  Viel Erfolg f�r LEVEL 2 - BinarySearchTree !
//
public interface IBinarySearchTree<K extends Comparable<K>, V> extends IDictionary<K, V>
{
    // Liefert den Wurzelknoten
    IBinarySearchTreeNode<K, V> getRoot();
    void setRoot(IBinarySearchTreeNode<K, V> node);

    // Suche nach einem Knoten im Baum (mit dem Such-Schl�ssel key, wenn im Baum vorhanden)
    // (quasi die Suche-im-Baum (und nicht aus Dictionary-Sicht) )
    IBinarySearchTreeNode<K,V> getNode(K key);

    // Traversierungs-Methoden
    // Liefert eine Liste der Knoten des Baumes in Reihenfolge left-root-right (sortierte Liste)
    ArrayList<K> inOrderTreeWalk();
    // Liefert eine Liste der Knoten des Baumes in Reihenfolge root-left-right
    ArrayList<K> preOrderTreeWalk();
    // Liefert eine Liste der Knoten des Baumes in Reihenfolge left-right-root
    ArrayList<K> postOrderTreeWalk();

    // Traversierung ab einem bestimmten Knoten
    ArrayList<K> inOrderTreeWalk(IBinarySearchTreeNode<K, V> node);
    ArrayList<K> preOrderTreeWalk(IBinarySearchTreeNode<K, V> node);
    ArrayList<K> postOrderTreeWalk(IBinarySearchTreeNode<K, V> node);

    int height();  // H�he des Baumes (L�ngster Pfad von der Wurzel zu einem Blatt)
    int treeHeight(IBinarySearchTreeNode<K,V> node); // H�he eines (Teil-)Baumes mit Wurzel node
    int nodeDepth(IBinarySearchTreeNode<K,V> node);  // Tiefe des Knotens im Baum

}
