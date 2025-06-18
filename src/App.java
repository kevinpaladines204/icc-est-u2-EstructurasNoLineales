import materia.controllers.BinaryTree;

public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree();
        System.out.println();
        System.out.println("Preorder :");
        tree.insert(50);
        tree.insert(17);
        tree.insert(76);
        tree.insert(9);
        tree.insert(23);
        tree.insert(54);
        tree.insert(14);
        tree.insert(19);
        tree.imprimirArbol();
        System.out.println();
        System.out.println("Inorder :");
        tree.imprimirInorder();
        System.out.println();
        System.out.println("Postorder :");
        tree.imprimirPostorder();
        
    }
}
