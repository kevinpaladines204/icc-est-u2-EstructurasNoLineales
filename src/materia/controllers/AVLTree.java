package materia.controllers;
import materia.models.Node;

public class AVLTree {

    private Node root;

    public AVLTree() {
        this.root=null;
    }

    public void insert(int value) {
        root = insertRecc(root, value);
    }

    private Node insertRecc(Node node, int value) {
        if(node == null){
            Node newNode = new Node(value);
            newNode.setHeight(1);
            System.out.println("Nodo insertado -> " + value + " con balance " + getBalance(newNode));
            return newNode;   
        }
        if(value <= node.getValue()){
            Node newNode = insertRecc(node.getleft(), value);
            node.setleft(newNode);
        }else if(value > node.getValue()){
            node.setrigth(insertRecc(node.getrigth(), value));
        }else{
            return node;
        }
        System.out.println("Nodo actual -> " + node.getValue());
        int altura = 1+ Math.max(Height(node.getleft()), Height(node.getrigth()));
        node.setHeight(altura);
        System.out.println("\tAltura -> " + altura);

        int balance = getBalance(node);

        System.out.println("\tBalance -> " + balance);
        //cazo izq - izq
        if (balance > 1 && value < node.getleft().getValue()){
            System.out.println("Rotacion simple Derecha");
            return rigthRotate(node);
        }
        //caso der - der
        if (balance < -1 && value > node.getrigth().getValue()){
            System.out.println("Rotacion simple Izquierda");
        }
        // caso izq - der
        if (balance > 1 && value > node.getleft().getValue()){
            System.out.println("Cambio ");
            node.setleft(leftRotate(node.getleft()));
            System.out.println("Rotacion simple Derecha");
            return rigthRotate(node);  
        }
        // caso der - izq
        if (balance < -1 && value < node.getrigth().getValue()){
            System.out.println("Cambio ");
            node.setrigth(rigthRotate(node.getrigth()));
            System.out.println("Rotacion simple Izquierda");
            return leftRotate(node);
        }
        return node;
    }
    
    //0(2^n) --> 0(1)
    private int Height(Node node){
        if (node == null) {
            return 0;
        }
        // 0(1) -> getter -> altura -> del Nodos
        return node.getHeight();
    }

    private int getBalance( Node node){
        if (node == null) {
            return 0;
        }
        return Height(node.getleft()) - Height(node.getrigth());

    }   


    private Node leftRotate(Node x) {
        Node y = x.getrigth();
        Node temp = y.getleft();

        //imprimir informacion antes de la Rotacion
        System.out.println("Rotacion izquierda en nodo: " + x.getValue()
                + ", con balance = " + getBalance(x));
        
        //realizar la rotacion
        y.setleft(x);
        x.setrigth(temp);

        //actualizar las alturas
        x.setHeight(Math.max(Height(x.getleft()), Height(x.getrigth())) + 1);
        y.setHeight(Math.max(Height(y.getleft()), Height(y.getrigth())) + 1);

        //imprimir info despues de l a rotacion
        System.out.println("Nueva raiz despues de la rotacion : " + y.getValue());
        return y;
        
    }

    private Node rigthRotate(Node y) {
        Node x = y.getleft();
        Node temp = x.getrigth();

        //imprimir informacion antes de la Rotacion
        System.out.println("Rotacion derecha en nodo: " + y.getValue()
                + ", con balance = " + getBalance(y));
        
        //realizar la rotacion
        x.setrigth(y);
        y.setleft(temp);

        //actualizar las alturas
        y.setHeight(Math.max(Height(y.getleft()), Height(y.getrigth())) + 1);
        x.setHeight(Math.max(Height(x.getleft()), Height(x.getrigth())) + 1);

        //imprimir info despues de l a rotacion
        System.out.println("Nueva raiz despues de la rotacion : " + x.getValue());
        return x;
        
    }
}


