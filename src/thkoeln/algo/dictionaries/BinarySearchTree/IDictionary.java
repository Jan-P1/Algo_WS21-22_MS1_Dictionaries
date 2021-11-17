package thkoeln.algo.dictionaries.BinarySearchTree;

//    ______   __      __   __
//   |   _  \ |__.----|  |_|__.-----.-----.---.-.----.--.--.
//   |.  |   \|  |  __|   _|  |  _  |     |  _  |   _|  |  |
//   |.  |    |__|____|____|__|_____|__|__|___._|__| |___  |
//   |:  1    /                                      |_____|
//   |::.. . /
//   `------'

public interface IDictionary<K extends Comparable<K>, V> {

    V search(K key);
    boolean containsKey(K key);
    V getValue(K key);

    void insert(K... key);
    void insert(K key, V value);
    void insert(K key);

    boolean delete(K key);

    boolean isEmpty();
    void empty();
    int size();

    K predecessor(K key);
    K successor(K key);
    K minimum();
    K maximum();


}
