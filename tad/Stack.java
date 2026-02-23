package tad;

public class Stack<Generic> {
    LinkedList<Generic> list = new LinkedList<Generic>();
    public Stack(){}
    public void push(Generic element) throws Exception {
        list.push(element);
    }
    public Generic peak() throws Exception {
        return list.getLast();
    }
}
