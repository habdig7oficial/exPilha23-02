package tad;

public class Stack<Generic> {
    LinkedList<Generic> list = new LinkedList<Generic>();
    public Stack(){}

    public void push(Generic element){
        list.push(element);
    }

    public Generic pop() throws Exception {
        Generic e = this.peak();
        list.removeLast();
        return e;
    }

    public Generic peak() throws Exception {
        return list.getLast();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
