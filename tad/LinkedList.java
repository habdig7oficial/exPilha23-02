package tad;

public class LinkedList<Generic> {
    private Node<Generic> root;
    private Node<Generic> leaf;
    private int size;
    public LinkedList(){}

    public void push(Generic element) throws Exception {
        Node<Generic> node = new Node<Generic>(element, null);
        if (size == 0) {
            root = node;
            leaf = node;
            size++;
            return;
        }
        leaf.setNext(node);
        leaf = node;
        size++;
        return;
    }
    public Generic get(int index) throws Exception {
        Node<Generic> node = root;

        if (index > size) 
            throw new Exception("Invalid index acess");

        for (int i = 0; i < index; i++) 
            node = node.getNext();
        
        return node.getElement();
    }
    public Generic getLast(){
        return leaf.getElement();
    }
    public int getSize() {
        return size;
    }
}
