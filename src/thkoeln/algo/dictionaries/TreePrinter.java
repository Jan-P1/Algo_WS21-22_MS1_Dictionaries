package thkoeln.algo.dictionaries;

import thkoeln.algo.dictionaries.BinarySearchTree.BinarySearchTreeNode;

import java.util.ArrayList;
import java.util.List;

//    _______                  _______      __       __
//   |       .----.-----.-----|   _   .----|__.-----|  |_.-----.----.
//   |.|   | |   _|  -__|  -__|.  1   |   _|  |     |   _|  -__|   _|
//   `-|.  |-|__| |_____|_____|.  ____|__| |__|__|__|____|_____|__|
//     |:  |                  |:  |
//     |::.|                  |::.|
//     `---'                  `---'
//
//  Methoden zur Formatierten Konsolenausgabe von (Teil-)B�umen.
//
//  Auf Grundlage von MightyPorks StackOverflow-Post:
//  https://stackoverflow.com/a/29704252
//  MightyPork answered Apr 17 '15 at 16:06
//
//  - Auf unsere Datenstrukturen angepasst
//  - Character vereinfacht
//  - H�henindikator erg�nzt
//
public class TreePrinter<K extends Comparable<K>, V> {

    public static boolean ENABLED = true;

    /**
     * Print a tree
     *
     * @param root
     *            tree root node
     */
    public static void printNode(BinarySearchTreeNode root)
    {
        if (!ENABLED) {
            System.out.println("TreePrinter is disabled. To enable it set 'TreePrinter.ENABLED = true'");
            return;
        }

        List<List<String>> lines = new ArrayList<>();

        List<BinarySearchTreeNode> level = new ArrayList<>();
        List<BinarySearchTreeNode> next = new ArrayList<>();

        level.add(root);
        int nn = 1;

        int widest = 0;

        while (nn != 0) {
            List<String> line = new ArrayList<>();

            nn = 0;

            for (BinarySearchTreeNode n : level) {
                if (n == null) {
                    line.add(null);

                    next.add(null);
                    next.add(null);
                } else {
                    String aa = n.printKey(); // n.toString();//String.valueOf(n.key);
                    line.add(aa);
                    if (aa.length() > widest) widest = aa.length();

                    next.add((BinarySearchTreeNode) n.getLeft());
                    next.add((BinarySearchTreeNode) n.getRight());

                    if (n.getLeft() != null) nn++;
                    if (n.getRight() != null) nn++;
                }
            }

            if (widest % 2 == 1) widest++;

            lines.add(line);

            List<BinarySearchTreeNode> tmp = level;
            level = next;
            next = tmp;
            next.clear();
        }

        int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);
        for (int i = 0; i < lines.size(); i++) {
            List<String> line = lines.get(i);
            int hpw = (int) Math.floor(perpiece / 2f) - 1;

            if (i > 0) {
                System.out.print(" ");
                for (int j = 0; j < line.size(); j++) {

                    // split node
                    char c = ' ';
                    if (j % 2 == 1) {
                        if (line.get(j - 1) != null) {
                            c = (line.get(j) != null) ? '|' : '|';
                        } else {
                            if (j < line.size() && line.get(j) != null) c = '|';
                        }
                    }
                    System.out.print(c);

                    // lines and spaces
                    if (line.get(j) == null) {
                        for (int k = 0; k < perpiece - 1; k++) {
                            System.out.print(" ");
                        }
                    } else {

                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? " " : "-");
                        }
                        System.out.print(j % 2 == 0 ? "l" : "r");
                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? "-" : " ");
                        }
                    }
                }
                System.out.println();
            }
            System.out.print(i);
            // print line of numbers
            for (int j = 0; j < line.size(); j++) {

                String f = line.get(j);
                if (f == null) f = "";
                int gap1 = (int) Math.ceil(perpiece / 2f - f.length() / 2f);
                int gap2 = (int) Math.floor(perpiece / 2f - f.length() / 2f);

                // a number
                for (int k = 0; k < gap1; k++) {
                    System.out.print(" ");
                }
                System.out.print(f);
                for (int k = 0; k < gap2; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();

            perpiece /= 2;
        }
    }


}
