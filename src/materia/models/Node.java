package materia.models;

public class Node {
    private int value;
    private Node left;
    private Node rigth;
    private int Height;

    @Override
    public String toString() {
        return "Node [value=" + value + "]";
    }

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.rigth = null;
        this.Height= 1;

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

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }
}