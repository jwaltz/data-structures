public class Node<E> {
    
    private E data;
    private Node next;
    
    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }
    
    public Node(E data) {
        this(data, null);
    }
    
    // getData
    public E getData() {
        return this.data;
    }
    
    // setData
    public void setData(E data) {
        this.data = data;
    }
    
    // getNext
    public Node<E> getNext() {
        return this.next;
    }
    
    // setNext
    public void setNext(Node<E> next) {
        this.next = next;
    }
}