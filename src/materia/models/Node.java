package materia.models;

public class Node {
    private int value;
    private Node left;
    private Node rigth;

    @Override
    public String toString() {
        return "Node [value=" + value + "]";
    }

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.rigth = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getleft() {
        return left;
    }

    public void setleft(Node izq) {
        this.left = izq;
    }

    public Node getrigth() {
        return rigth;
    }

    public void setrigth(Node der) {
        this.rigth = der;
    }
}