package tad;
public class Node<Generic>{
    private Generic element;
    private Node<Generic> next;

    public Node(Generic element, Node<Generic> next){
        this.element = element;
        this.next = next;
    }
    
    public Generic getElement() {
        return element;
    }

    public void setNext(Node<Generic> next){
        this.next = next;
    }
    public Node<Generic> getNext(){
        return this.next;
    }
    @Override
    public String toString() {
        return getElement().toString();
    }
}