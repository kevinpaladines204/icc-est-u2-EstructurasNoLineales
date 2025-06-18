package materia.controllers;
import materia.models.Node;

public class BinaryTree {
    private Node root; 
    
    public BinaryTree(){
        this.root = null;
    }

    public void insert(int value){
        root = insertRecc(root, value);
    }
    private Node insertRecc(Node padre, int value){
        if(padre == null){
            return new Node(value);   
        }
        if(value <= padre.getValue()){
            Node newNode = insertRecc(padre.getleft(), value);
            padre.setleft(newNode);
        }else if(value > padre.getValue()){
            padre.setrigth(insertRecc(padre.getrigth(), value));
        }
        return padre;
    }

    public void imprimirArbol(){
        imprimirArbolRecc(root);
    }
    private void imprimirArbolRecc(Node node){
        if(node != null){
            System.out.print(node.getValue() + ", ");
            imprimirArbolRecc(node.getleft());
            imprimirArbolRecc(node.getrigth());
        }

    }

    public void imprimirInorder() {
    imprimirInorderRecc(root);  
    }

    private void imprimirInorderRecc(Node node) {
        if (node != null) {
            imprimirInorderRecc(node.getleft());
            System.out.print(node.getValue() + ", ");
            imprimirInorderRecc(node.getrigth());
        }
    }

    public void imprimirPostorder() {
    imprimirPostorderRecc(root);
    }

    private void imprimirPostorderRecc(Node node) {
        if (node != null) {
            imprimirPostorderRecc(node.getleft());
            imprimirPostorderRecc(node.getrigth());
            System.out.print(node.getValue() + ", ");
        }
    }

    public boolean findvalue(int value) {
        return findvalueRecc(root, value);
    }

    private boolean findvalueRecc(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (node.getValue() == value) {
            return true;
        }
        return findvalueRecc(node.getleft(), value) || findvalueRecc(node.getrigth(), value);
    }
}
