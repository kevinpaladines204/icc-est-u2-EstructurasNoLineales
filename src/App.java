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
        System.out.println();
        
        // Tarea 
        // implementar un método que busque un valor en el árbol
        System.out.println();
        if (tree.findvalue(23)) {
            System.out.println("El valor 23 se encuentra en el arbol.");
        } else {
            System.out.println("El valor 23 no se encuentra en el arbol.");
        }
        if (tree.findvalue(77)) {
            System.out.println("El valor 77 se encuentra en el arbol.");
        } else {
            System.out.println("El valor 77 no se encuentra en el arbol.");
        }
    }
}
