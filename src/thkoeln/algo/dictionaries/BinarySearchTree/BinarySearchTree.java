package thkoeln.algo.dictionaries.BinarySearchTree;

import java.util.ArrayList;

//    _______    __
//   |   _   \  |__.-----.---.-.----.--.--.______
//   |.  1   /  |  |     |  _  |   _|  |  |______|
//   |.  _   \  |__|__|__|___._|__| |___  |
//   |:  1    \                       |_____|
//   |::.. .  /
//   `-------'
//    _______                           __
//   |   _   | .-----.---.-.----.----|  |--.______
//   |   1___| |  -__|  _  |   _|  __|     |______|
//   |____   | |_____|___._|__| |____|__|__|
//   |:  1   |
//   |::.. . |
//   `-------'
//    _______
//   |       | .----.-----.-----.
//   |.|   | | |   _|  -__|  -__|
//   `-|.  |-' |__| |_____|_____|
//     |:  |
//     |::.|
//     `---'
//
//  LEVEL 2 - IBinarySearchTree - Der bin�re Suchbaum
//
//  Schauen Sie sich das Interface eines Binary-Search-Tree (BST) IBinarySearchTree als
//  Spezialisierung/Erweiterung eines Dictionaries (IDictionary) mit den bereitgestellten Operationen an.
//
//  Aufgabenstellung:
//      "Implementieren Sie die Konstruktoren und Operationen/Methoden des BinarySearchTree,
//       sodass alle IBinarySearchTree-Tests gr�n/bestanden sind."
//
//      Weitere Erl�uterungen ---> siehe IBinarySearchTree.java
//
public class BinarySearchTree<K extends Comparable<K>, V>  implements IBinarySearchTree<K,V>{

    // The ROOT-Node of the Tree
    private IBinarySearchTreeNode<K,V> root;

//                           __                   __
//   .----.-----.-----.-----|  |_.----.--.--.----|  |_.-----.----.-----.
//   |  __|  _  |     |__ --|   _|   _|  |  |  __|   _|  _  |   _|__ --|
//   |____|_____|__|__|_____|____|__| |_____|____|____|_____|__| |_____|

    public BinarySearchTree(){
        throw new UnsupportedOperationException("Bitte implementieren!");
    }

    public BinarySearchTree(K... keys) {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }


//                         __
//   .-----.--------.-----|  |_.--.--.
//   |  -__|        |  _  |   _|  |  |
//   |_____|__|__|__|   __|____|___  |
//                  |__|       |_____|
    @Override
    public void empty(){
        throw new UnsupportedOperationException("Bitte implementieren!");
    }

    @Override
    public boolean isEmpty(){
        throw new UnsupportedOperationException("Bitte implementieren!");
    }


//                     __
//   .----.-----.-----|  |_
//   |   _|  _  |  _  |   _|
//   |__| |_____|_____|____|

    @Override
    public IBinarySearchTreeNode<K, V> getRoot() {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }
    @Override
    public void setRoot(IBinarySearchTreeNode<K, V> node) {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }


//    __                        __
//   |__.-----.-----.-----.----|  |_
//   |  |     |__ --|  -__|   _|   _|
//   |__|__|__|_____|_____|__| |____|

    @Override
    public void insert(K key, V value) {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }

    @Override
    public void insert(K key) {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }

    @Override
    public void insert(K... keys) {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }


    private void insert(IBinarySearchTreeNode<K,V> node){
        throw new UnsupportedOperationException("Bitte implementieren!");
    }


//       __       __       __
//   .--|  .-----|  .-----|  |_.-----.
//   |  _  |  -__|  |  -__|   _|  -__|
//   |_____|_____|__|_____|____|_____|

    @Override
    public boolean delete(K key) {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }

    private void delete(IBinarySearchTreeNode<K,V> z){
        throw new UnsupportedOperationException("Bitte implementieren!");
    }

    private void transplant(IBinarySearchTreeNode<K,V> u, IBinarySearchTreeNode<K,V> v){
        throw new UnsupportedOperationException("Bitte implementieren!");
    }



//                                __
//   .-----.-----.---.-.----.----|  |--.
//   |__ --|  -__|  _  |   _|  __|     |
//   |_____|_____|___._|__| |____|__|__|

    @Override
    public V search(K key) {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }

    @Override
    public V getValue(K key) {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }

    @Override

    public IBinarySearchTreeNode<K,V> getNode(K key){
        IBinarySearchTreeNode<K, V> foundNode = search(this.getRoot(), key);
        return foundNode;
    }

    private IBinarySearchTreeNode<K,V> search(IBinarySearchTreeNode<K,V> x, K key){
        throw new UnsupportedOperationException("Bitte implementieren!");
    }

    @Override
    public boolean containsKey(K key) {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }


//    __                                     __
//   |  |_.----.---.-.--.--.-----.----.-----|__.-----.-----.
//   |   _|   _|  _  |  |  |  -__|   _|__ --|  |     |  _  |
//   |____|__| |___._|\___/|_____|__| |_____|__|__|__|___  |
//                                                   |_____|

    @Override
    public ArrayList<K> inOrderTreeWalk() {
        return inOrderTreeWalk(this.getRoot());
    }

    @Override
    public ArrayList<K> preOrderTreeWalk() {
        return preOrderTreeWalk(this.getRoot());
    }

    @Override
    public ArrayList<K> postOrderTreeWalk() {
        return postOrderTreeWalk(this.getRoot());
    }

    @Override
    public ArrayList<K> inOrderTreeWalk(IBinarySearchTreeNode<K, V> node) {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }

    @Override
    public ArrayList<K> preOrderTreeWalk(IBinarySearchTreeNode<K, V> node) {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }

    @Override
    public ArrayList<K> postOrderTreeWalk(IBinarySearchTreeNode<K, V> node) {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }


//          __
//   .-----|__.-----.-----.
//   |__ --|  |-- __|  -__|
//   |_____|__|_____|_____|

    @Override
    public int size() {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }


//    __          __       __    __      ___   __             __   __
//   |  |--.-----|__.-----|  |--|  |_   /  .--|  .-----.-----|  |_|  |--.
//   |     |  -__|  |  _  |     |   _|,' ,'|  _  |  -__|  _  |   _|     |
//   |__|__|_____|__|___  |__|__|____/__/  |_____|_____|   __|____|__|__|
//                  |_____|                            |__|

    @Override
    public int height() {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }

    @Override
    public int treeHeight(IBinarySearchTreeNode<K,V> node) {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }

    @Override
    public int nodeDepth(IBinarySearchTreeNode<K, V> node) {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }


//                        __
//   .-----.----.-----.--|  .-----.----.-----.-----.-----.-----.----.
//   |  _  |   _|  -__|  _  |  -__|  __|  -__|__ --|__ --|  _  |   _|
//   |   __|__| |_____|_____|_____|____|_____|_____|_____|_____|__|
//   |__|
//   .-----.--.--.----.----.-----.-----.-----.-----.----.
//   |__ --|  |  |  __|  __|  -__|__ --|__ --|  _  |   _|
//   |_____|_____|____|____|_____|_____|_____|_____|__|

    @Override
    public K predecessor(K key) {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }


    @Override
    public K successor(K key) {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }


//             __       __
//   .--------|__.-----|__.--------.--.--.--------.
//   |        |  |     |  |        |  |  |        |
//   |__|__|__|__|__|__|__|__|__|__|_____|__|__|__|
//                         __
//   .--------.---.-.--.--|__.--------.--.--.--------.
//   |        |  _  |_   _|  |        |  |  |        |
//   |__|__|__|___._|__.__|__|__|__|__|_____|__|__|__|

    @Override
    public K minimum() {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }

    @Override
    public K maximum() {
        throw new UnsupportedOperationException("Bitte implementieren!");
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("BinarySearchTree{");
        sb.append("root=");
        try {
            if (getRoot() == null)
                sb.append("null");
            else
                sb.append(getRoot().toString());
        }catch (UnsupportedOperationException exception){
            sb.append("Error: getRoot() not yet implemented.");
        }

        sb.append(", size=");
        try {
            sb.append(size());
        }catch (UnsupportedOperationException exception){
            sb.append("Error: size() not yet implemented.");
        }

        sb.append(", height=");
        try {
            sb.append(height());
        }catch (UnsupportedOperationException exception){
            sb.append("Error: height() not yet implemented.");
        }

        sb.append(", minimum=");
        try {
            sb.append(minimum());
        }catch (UnsupportedOperationException exception){
            sb.append("Error: minimum() not yet implemented.");
        }

        sb.append(", maximum=");
        try {
            sb.append(maximum());
        }catch (UnsupportedOperationException exception){
            sb.append("Error: maximum() not yet implemented.");
        }

        sb.append('}');

        return sb.toString();
    }
}
