public class TestBSTree {

    static BSTree<Integer, Integer> tree1 = new BSTree<>();

    public static void main(String[] args) {
        build_a_bstree ();
        testPrintPreOrder ();



    }





    static public void testPrintPreOrder () {
        tree1.printPreOrder();
    }

    static public void build_a_bstree () {
        tree1.put(5, 6);
        tree1.put(2, 3);
        tree1.put(3, 4);
        tree1.put(4, 5);
        tree1.put(1, 2);
        tree1.put(6, 7);
        tree1.put(7, 8);
        tree1.put(8, 9);
    }

}
