

http://students.pages.st.archi-lab.io/algo/ws21/m1/tests/Algo_WS21-22_MS1_tests_group_764fc7ea-16b6-46f7-9d36-0df122ef3b0d


# Algorithmik Praktikum - Meilenstein 1: Dictionaries

## Organisatorisches
Aus technischen/organisatorischen Gründen können wir zum aktuellen Zeitpunkt nicht wie geplant git-Repositories bereitstellen und müssen daher (mit erheblicher Verzögerung) das Praktikum vorerst umplanen. 
Damit Sie endlich mit dem Praktikum beginnen können, stellen wir Ihnen zunächst ein Java-Projekt über das ILIAS bereit. Trotz der Einteilung in Teams, bitten wir Sie diesen Meilenstein zunächst „für sich“ zu bearbeiten. Sie können/sollen gerne mit Ihrem Team über die einzelnen Operationen diskutieren - versuchen Sie aber zunächst die Implementierung eigenständig abzuschließen. Wenn Sie auf Probleme mit einzelnen Operationen oder Verständnisprobleme auftreten, wenden Sie sich zunächst an Ihr Team und versuchen Sie (innerhalb des Teams) die Probleme zu lösen. Sollten Sie nicht weiterkommen, wenden Sie sich gerne an uns (siehe Beratung/Kontakt). 

## Tests
Die Funktionalität der (über Interfaces und Klassen) bereitgestellten Operationen testen wir mit Hilfe von JUnit-Tests. Die Tests sind in mehrere Level/Abschnitte unterteilt und so gestaltet, dass Sie sich in vorgegebener Reihenfolge abarbeiten lassen. 


## Dictionaries
In diesem Meilenstein sollen Sie den Abstrakten Datentyp (ADT) Dictionary in Java implementieren. 
Dictionaries (Wörterbücher) stellen dynamische Mengen dar, die es uns ermöglichen Werte/Objekte (value) unter einem Suchschlüssel (key) zu speichern und effizient über den Suchschlüssel wieder zu finden. Wir sprechen hier von Schlüssel-/Wert-Paaren. 
Zwischen den Schlüsseln muss eine Ordnungsrelation bestehen. Es müssen Vergleiche wie <, <=, ==, >=, > müssen möglich sein). Jeder Schlüssel (key) kann/soll im Dictionary nur einmal vorkommen. 
Wir können Schlüssel-/Wert-Paare in ein Dictionary einfügen (insert), nach ihnen (über den Suchschlüssel) suchen (search, isMember) und sie auch wieder entfernen (delete).
Zusätzlich ermöglicht uns die Datenstruktur Dictionary diverse „Abfragen“:
- Wir können prüfen ob das Dictionary leer (isEmpty) ist - keine Schlüssel-/Wert-Paare enthält. 
- Wir können nach der Größe (size) des Dictionaries fragen. Die Größe gibt die Anzahl der Schlüssel-/Wert-Paare im Dictionary an. 
- Wir können den kleinsten Suchschlüssel (minimum) und den größten Suchschlüssel (maximum) abfragen.
- Schlüsselbezogene-Abfragen:
  - Wir können uns den Vorgänger (predecessor) eines Suchschlüssels suchen lassen. Der Vorgänger ist der nächst-kleinere Suchschlüssel (zu einem gegebenen Schlüssel) der im Dictionary vorkommt (falls vorhanden).
  - Wir können uns den Nachfolger (successor) eines Suchschlüssels suchen lassen. Der Nachfolger ist der nächst-größere Suchschlüssel (zu einem gegebenen Schlüssel) der im Dictionary vorkommt (falls vorhanden).

Hieraus ergibt sich folgendes generisches Java Interface:

public interface IDictionary<K extends Comparable<K>, V> {

    boolean isEmpty();
    void empty();

    void insert(K key, V value);

    V search(K key);
    boolean containsKey(K key);

    boolean delete(K key);

    int getSize();

    K minimum();
    K maximum();

    K predecessor(K key);
    K successor(K key);
}


Binäre Suchbäume
Die erste Variante die Sie implementieren sollen, ist der Binäre Suchbaum. 
Binäre Suchbäume stellen die Funktionalität eines Dictionaries bereit und sind durch Ihre rekursive Struktur eine effizientere Alternative zu einfachen dynamischen Mengen die z.B. auf einem Array/einer Liste operieren.
In diesem Praktikum sollen Sie sich mit Binären Suchbäumen als Beispiel für Baumstrukturen tiefgehend auseinandersetzen. Den Umgang mit Baumstrukturen zu beherrschen, kann Ihnen beim Lösen vieler algorithmischer Probleme und bei deren Implementierung helfen. (Nicht umsonst sind Operationen auf Binären Suchbäumen häufig Thema in Coding-Interviews als Teil von Bewerbungs-/Einstellungs-Prozessen)
Wir werden deshalb diese Baumstruktur genauer unter die Lupe nehmen und uns durch mehrere Level durcharbeiten. Hierzu stellen wir Ihnen ein Java-Projekt bereit in dem wir eine Struktur vorgeben, deren Funktionalität Sie bereitstellen/implementieren sollen.

Todos/Aufgaben:
1.	LEVEL 01 - *BinarySearchTreeNode* implementieren
  -	Einblick in die Klasse und das zu implementierende Interface
  -	*Konstruktoren* zum Erzeugen eines Knoten
  -	Knoten als Schlüssel-/Wert-Paar - *Key/Value*
  -	Binäre-Baumstruktur durch die Referenzen *Parent/Left/Right*
  -	Baumknoten-Typen, Wurzel (*root*) / Interne Knoten (*innerNodes*) / und Blätter (*leafs*)
  -	Vorgänger (*predecessor*)/Nachfolger(*successor*) eines Knoten
  -	*Minimum* und *Maximum* eines Baumes
  -	Größe (*size*) eines Knoten als Wurzel eines (Teil-)Baumes
  -	Höhe (*height*) und Tiefe (*depth*) eines Knoten 
2. LEVEL 02 - BinarySearchTree implementieren
  -	Einblick in die Klasse und das zu implementierende Interface
  -	*Konstruktoren* zum Erzeugen eines BinarySearchTree
  -	*Einfügen* von Schlüsseln und Erhalten der Suchbaum-Eigenschaft
  -	*Suchen* im Binären-Suchbaum
  -	*Löschen* eines Schlüssels aus dem Baum und Erhalten der Suchbaum-Eigenschaft
  -	Vorgänger (*predecessor*) und Nachfolger (*successor*) eines Schlüssels im Baum
  -	Größe (*size*) des Baumes
 -	*Pre-Order/In-Order/Post-Order-Traversierung* des Baumes
