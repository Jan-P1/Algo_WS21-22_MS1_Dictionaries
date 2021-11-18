package thkoeln.algo.dictionaries.BinarySearchTree;

//    _______ __                        _______                       __
//   |   _   |__.-----.---.-.----.--.--|   _   .-----.---.-.----.----|  |--.______
//   |.  1   |  |     |  _  |   _|  |  |   1___|  -__|  _  |   _|  __|     |______|
//   |.  _   |__|__|__|___._|__| |___  |____   |_____|___._|__| |____|__|__|
//   |:  1    \                  |_____|:  1   |
//   |::.. .  /                        |::.. . |
//   `-------'                         `-------'
//    _______                  ______           __
//   |       .----.-----.-----|   _  \.-----.--|  .-----.
//   |.|   | |   _|  -__|  -__|.  |   |  _  |  _  |  -__|
//   `-|.  |-|__| |_____|_____|.  |   |_____|_____|_____|
//     |:  |                  |:  |   |
//     |::.|                  |::.|   |
//     `---'                  `--- ---'
//
//
//  *Level 1 - IBinarySearchTreeNode
//
//  ** Aufgabenstellung:
//      "Implementieren Sie die Konstruktoren und Operationen/Methoden der Klasse BinarySearchTreeNode,
//       sodass alle IBinarySearchTreeNode-Tests gr�n/bestanden sind."
//
//      Weitere Erl�uterungen ---> siehe IBinarySearchTreeNode.java
//
public class BinarySearchTreeNode<K extends Comparable<K>, V> implements IBinarySearchTreeNode<K, V>{

    private K key = null;
    private V value = null;

    private IBinarySearchTreeNode<K, V> parent = null;
    private IBinarySearchTreeNode<K, V> left = null;
    private IBinarySearchTreeNode<K, V> right = null;
//                           __                   __
//   .----.-----.-----.-----|  |_.----.--.--.----|  |_.-----.----.-----.
//   |  __|  _  |     |__ --|   _|   _|  |  |  __|   _|  _  |   _|__ --|
//   |____|_____|__|__|_____|____|__| |_____|____|____|_____|__| |_____|

    public BinarySearchTreeNode(K key) throws IllegalArgumentException {
        if(key == null) throw new IllegalArgumentException("key can't be null");
        setKey(key);

    }

    public BinarySearchTreeNode(K key, V value) throws IllegalArgumentException{
        if(key == null) throw new IllegalArgumentException("key can't be null");
        setKey(key);
        setValue(value);

    }

//    __                   ___            __
//   |  |--.-----.--.--.  /  .--.--.---.-|  .--.--.-----.
//   |    <|  -__|  |  |,' ,'|  |  |  _  |  |  |  |  -__|
//   |__|__|_____|___  /__/   \___/|___._|__|_____|_____|
//               |_____|

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) throws IllegalArgumentException {
        if(key == null) throw new IllegalArgumentException("key can't be null");

        this.key = key;

    }


    @Override
    public V getValue() {
        return value;
    }

    @Override
    public void setValue(V value) throws IllegalArgumentException{
        this.value = value;

    }



//                                 __
//   .-----.---.-.----.-----.-----|  |_
//   |  _  |  _  |   _|  -__|     |   _|
//   |   __|___._|__| |_____|__|__|____|
//   |__|

    @Override
    public IBinarySearchTreeNode<K, V> getParent() {
        return parent;
    }

    @Override
    public void setParent(IBinarySearchTreeNode<K, V> node) {
        parent = node;
    }

//    __        ___ __      ___     __       __    __
//   |  .-----.'  _|  |_   /  .----|__.-----|  |--|  |_
//   |  |  -__|   _|   _|,' ,'|   _|  |  _  |     |   _|
//   |__|_____|__| |____/__/  |__| |__|___  |__|__|____|
//                                    |_____|

    @Override
    public IBinarySearchTreeNode<K, V> getLeft() {
        return left;
    }

    @Override
    public void setLeft(IBinarySearchTreeNode<K, V> node) {
        left = node;
    }


    @Override
    public IBinarySearchTreeNode<K, V> getRight() {
        return right;
    }

    @Override
    public void setRight(IBinarySearchTreeNode<K, V> node) {
        right = node;
    }


//          __
//   .-----|__.-----.-----.
//   |__ --|  |-- __|  -__|
//   |_____|__|_____|_____|

    @Override
    public int size() {
       return treeSize(this);
    }

    public int treeSize(IBinarySearchTreeNode<K, V> root)
    {
        if(root == null) return 0;
        else return (treeSize(root.getLeft()) + 1 + treeSize(root.getRight()));
    }


//    __          __       __    __      ___   __             __   __
//   |  |--.-----|__.-----|  |--|  |_   /  .--|  .-----.-----|  |_|  |--.
//   |     |  -__|  |  _  |     |   _|,' ,'|  _  |  -__|  _  |   _|     |
//   |__|__|_____|__|___  |__|__|____/__/  |_____|_____|   __|____|__|__|
//                  |_____|                            |__|

    @Override
    public int height() {
        return treeHeight(this);
    }

    private int treeHeight(IBinarySearchTreeNode<K, V> root)
    {
        if(root == null) return 0;
        else {
            int lHeight = treeHeight(root.getLeft());
            int rHeight = treeHeight(root.getRight());

            if (lHeight > rHeight) return ++lHeight;
            else return ++rHeight;
        }
    }

    @Override
    public int depth() {
        return treeDepth(this) -1;
    }

    private int treeDepth(IBinarySearchTreeNode<K, V> root)
    {
        if (root == null) return 0;
        else return 1 + treeDepth(root.getParent());
    }


//                     __      _____              ___   _____
//   .----.-----.-----|  |_   /  |  .-----.---.-.'  _| /  |__.-----.-----.-----.----.
//   |   _|  _  |  _  |   _|,' ,'|  |  -__|  _  |   _,' ,'|  |     |     |  -__|   _|
//   |__| |_____|_____|____/__/  |__|_____|___._|__|/__/  |__|__|__|__|__|_____|__|

    @Override
    public boolean isLeaf(){
        return left == null && right == null;
    }

    @Override
    public boolean isInnerNode(){
        return left != null || right != null;
    }

    @Override
    public boolean isRoot(){
        return parent == null;
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
    public IBinarySearchTreeNode<K, V> minimum() {
        return treeMinimum(this);
    }

    @Override
    public IBinarySearchTreeNode<K, V> maximum() {
        return treeMaximum(this);
    }


    public IBinarySearchTreeNode<K, V> treeMinimum(IBinarySearchTreeNode<K, V> root) {
        if (root.getLeft() == null) return root;
        else return treeMinimum(root.getLeft());
    }

    public IBinarySearchTreeNode<K, V> treeMaximum(IBinarySearchTreeNode<K, V> root) {
        if (root.getRight() == null) return root;
        else return treeMaximum(root.getRight());
    }


//                        __
//   .-----.----.-----.--|  .-----.----.-----.-----.-----.-----.----.
//   |  _  |   _|  -__|  _  |  -__|  __|  -__|__ --|__ --|  _  |   _|
//   |   __|__| |_____|_____|_____|____|_____|_____|_____|_____|__|
//   |__|
//   .-----.--.--.----.----.-----.-----.-----.-----.----.
//   |__ --|  |  |  __|  __|  -__|__ --|__ --|  _  |   _|
//   |_____|_____|____|____|_____|_____|_____|_____|__|

    public IBinarySearchTreeNode<K, V> findRoot(){
        return(treeRoot(this));
    }

    public IBinarySearchTreeNode<K, V> treeRoot(IBinarySearchTreeNode<K, V> x){
        if (x.getParent() == null) return x;
        else return treeRoot(x.getParent());
    }

    @Override
    public IBinarySearchTreeNode<K, V> predecessor() {
        if (this.findRoot().minimum() == this) return null;
        else if (this.getLeft() != null) return this.getLeft().maximum();
        else if (this.getParent().getRight() == this) return this.getParent();
        else return treePredecessor(this.getParent());
    }

    public IBinarySearchTreeNode<K, V> treePredecessor(IBinarySearchTreeNode<K, V> x){
        if (x.getParent().getRight() == x) return x.getParent();
        else return treePredecessor(x.getParent());
    }


    @Override
    public IBinarySearchTreeNode<K, V> successor() {
        if (this.findRoot().maximum() == this) return null;
        else if (this.getRight() != null) return this.getRight().minimum();
        else if (this.getParent().getLeft() == this) return this.getParent();
        else return treeSuccessor(this.getParent());
    }

    public IBinarySearchTreeNode<K, V> treeSuccessor(IBinarySearchTreeNode<K, V> x){
        if (x.getParent().getLeft() == x) return x.getParent();
        else return treeSuccessor(x.getParent());
    }





//               __       __
//   .-----.----|__.-----|  |_
//   |  _  |   _|  |     |   _|
//   |   __|__| |__|__|__|____|
//   |__|

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("BinaryTreeNode{");
        sb.append("key=");
        try{
            if (getKey() == null)
                sb.append("null");
            else
                sb.append(getKey().toString());
        }catch (UnsupportedOperationException exception){
            sb.append("Error: getKey() not yet implemented.");
        }

        sb.append(", value=");
        try{
            if (getValue() == null)
                sb.append("null");
            else
                sb.append(getValue());
        }catch (UnsupportedOperationException exception){
            sb.append("Error: getValue() not yet implemented.");
        }

        sb.append(", parent_key=");
        try{
            if (getParent() == null)
                sb.append("null");
            else
                sb.append(getParent().getKey());
        }catch (UnsupportedOperationException exception){
            sb.append("Error: getParent() or getKey() not yet implemented.");
        }

        sb.append(", left_key=");
        try{
            if (getLeft() == null)
                sb.append("null");
            else
                sb.append(getLeft().getKey());
        }catch (UnsupportedOperationException exception){
            sb.append("Error: getLeft() or getKey() not yet implemented.");
        }

        sb.append(", right_key=");
        try{
            if (getRight() == null)
                sb.append("null");
            else
                sb.append(getRight().getKey());
        }catch (UnsupportedOperationException exception){
            sb.append("Error: getRight() or getKey() not yet implemented.");
        }

        sb.append('}');

        return sb.toString();
    }

    public String printKey() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        try{
            if (getKey() == null)
                sb.append("null");
            else
                sb.append(getKey());
        }catch (UnsupportedOperationException exception){
            sb.append("Error: getKey() not yet implemented.");
        }
        sb.append(")");
        return sb.toString();
    }
}
