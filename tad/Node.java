package tad;
public class Node<Generic>{
    private Generic element;
    private Node<Generic> previous;
    private Node<Generic> next;

    public Node(Generic element){
        this.element = element;
        this.previous = this;
        this.next = this;
    }
    public Node(Generic element, Node<Generic> previous){
        this.element = element;
        this.previous = this;
    }
    public Node(Generic element, Node<Generic> previous, Node<Generic> next){
        this.element = element;
        this.previous = previous;
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

    public void setPrevious(Node<Generic> previous) {
        this.previous = previous;
    }
    public Node<Generic> getPrevious() {
        return previous;
    }

    public void setBoth(Node<Generic> element) {
        this.previous = element;
        this.next = element;
    }
    public void setPrevNext(Node<Generic> e1, Node<Generic> e2) {
        this.previous = e1;
        this.next = e2;
    }

    @Override
    public String toString() {
        return String.format("Element: %s Prev: %s Next: %s", this.element.toString(), previous.getElement().toString(), next.getElement().toString());
    }
}