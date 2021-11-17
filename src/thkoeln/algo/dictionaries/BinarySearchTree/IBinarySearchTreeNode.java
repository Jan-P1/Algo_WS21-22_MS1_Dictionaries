package thkoeln.algo.dictionaries.BinarySearchTree;

//    ___ _______ __                        _______                       __
//   |   |   _   |__.-----.---.-.----.--.--|   _   .-----.---.-.----.----|  |--.______
//   |.  |.  1   |  |     |  _  |   _|  |  |   1___|  -__|  _  |   _|  __|     |______|
//   |.  |.  _   |__|__|__|___._|__| |___  |____   |_____|___._|__| |____|__|__|
//   |:  |:  1    \                  |_____|:  1   |
//   |::.|::.. .  /                        |::.. . |
//   `---`-------'                         `-------'
//    _______                  ______           __
//   |       .----.-----.-----|   _  \.-----.--|  .-----.
//   |.|   | |   _|  -__|  -__|.  |   |  _  |  _  |  -__|
//   `-|.  |-|__| |_____|_____|.  |   |_____|_____|_____|
//     |:  |                  |:  |   |
//     |::.|                  |::.|   |
//     `---'                  `--- ---'
//
//  *Level 1 - IBinarySearchTreeNode
//
//  Sie sehen unten das Interface eines Binary-Search-Tree-Nodes (BST-Node) der die Grundlage
//  f�r unsere Baumstruktur in der Klasse BinarySearchTree darstellt.
//
//  ** Aufgabenstellung:
//      "Implementieren Sie die Konstruktoren und Operationen/Methoden der Klasse BinarySearchTreeNode,
//       sodass alle IBinarySearchTreeNode-Tests gr�n/bestanden sind."
//
// ---------------------------------------------------------------------------------------------------
//
//  Die Klasse BinarySearchTreeNode ist bereits vorgegeben und Sie m�ssen nun die
//  einzelnen Operationen implementieren und die mitgelieferten Tests erf�llen.
//
// ---------------------------------------------------------------------------------------------------
//
//  *** Anmerkungen und Vorgehensweise:
//
//  Die Tests zu Level 1 finden Sie im package:
//      test/java/thkoeln/algo/dictionaries/BinarySearchTree/BinarySearchTreeNodeTests
//
//  Implementieren Sie zun�chst die Konstruktor-Varianten. Hierzu kann Es n�tig werden bereits
//  die Attribut-Tests (siehe unten) zu erf�llen.
//  Constructor-Tests:
//      Level_01_01_IBinaryTreeNodeTest_Constructor
//
//  Attribut-Tests - Key/Value:
//      Level_01_02_IBinaryTreeNodeTest_KeyValue
//
//  Attribut-Tests - Eltern-/Kind-Struktur-Tests:
//      Level_01_03_IBinaryTreeNodeTest_ParentLeftRight
//
//  Sobald die Struktur-Tests bestanden sind, k�nnen Sie Abfragen auf die Struktur implementieren.
//  Diese Abfragen k�nnen Ihnen sp�ter die Implementierung der Baume-Operationen in Level 2 vereinfachen
//  und sollen Ihnen ein tieferes Verst�ndnis der Struktur von B�umen vermitteln.
//  Struktur-Abfragen-Tests:
//      Level_01_04_IBinaryTreeNodeTest_RootInnerLeaf
//      Level_01_05_IBinarySearchTreeNodeTest_PredecessorSuccessor
//      Level_01_06_IBinarySearchTreeNodeTest_MinimumMaximum
//      Level_01_07_IBinarySearchTreeNodeTest_HeightDepth
//      Level_01_08_IBinarySearchTreeNodeTest_Size
//
//
//    Viel Erfolg f�r LEVEL 1 - BinarySearchTreeNode !!!
//
public interface IBinarySearchTreeNode<K extends Comparable<K>, V> {

    // Schl�ssel-Wert-Paar
    // Der Such-Schl�ssel key vom Typ K
    // Der Typ K muss Comparable erweitern - um zwischen den Schl�sseln eine
    // Ordnungsrelation (Suchbaumeigenschaft) herstellen zu k�nnen
    K getKey();
    void setKey(K key);

    // Der (unter dem Such-Schl�ssel gespeicherte) Wert/Payload/Satellitendaten
    // Der Typ V des Wertes ist f�r die Struktur des Baumes unerheblich
    V getValue();
    void setValue(V value);


    // Struktur - Eltern- und Kind-Knoten
    IBinarySearchTreeNode<K, V> getParent();
    void setParent(IBinarySearchTreeNode<K, V> node);

    IBinarySearchTreeNode<K, V> getLeft();
    void setLeft(IBinarySearchTreeNode<K, V> node);

    IBinarySearchTreeNode<K, V> getRight();
    void setRight(IBinarySearchTreeNode<K, V> node);


    // Ist dieser Knoten ein Blatt, ein innerer Knoten, die Wurzel?
    boolean isLeaf();       // Ein Blatt (Knoten ohne Kinder)
    boolean isInnerNode();  // Innerer Knoten (Knoten mit mind. einem Kind)
    boolean isRoot();       // Wurzel (Knoten ohne Elternknoten)


    // Abfragen auf den Knoten als (Teil-)Baum:
    IBinarySearchTreeNode<K, V> predecessor();
    IBinarySearchTreeNode<K, V> successor();

    IBinarySearchTreeNode<K, V> minimum();
    IBinarySearchTreeNode<K, V> maximum();

    // Gr��e des Baumes, H�he des (Teil-)Baumes und Tiefe des Knoten im Baum
    int size();     // Anzahl der Knoten im (Teil-)Baum
    int height();   // H�he des (Teil-)Baums
    int depth();    // Tiefe des Knoten im Baum

}


