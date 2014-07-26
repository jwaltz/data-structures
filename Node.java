/**
 * Singly-linked Node for use in linked-list structures.
 * <p>
 * Contains a single data element and a reference to another node.
 * If a node does not point to another node its reference will be null.
 * 
 * @author Jonathan Waltz
 */
public class Node<E> {
    
    private E data;
    private Node<E> next;
    
    /**
     * Constructs a new node with the given data and points it to the
     * provided next node.
     * 
     * @param data data for the new node to store.
     * @param next a reference to save as the next node.
     */
    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }
    
    /**
     * Constructs a new node with the given data and sets its next
     * reference to null.
     * 
     * @param data data for the new node to store.
     */
    public Node(E data) {
        this(data, null);
    }
    
    /**
     * Gets the node's current data.
     * 
     * @return the node's current data.
     */
    public E getData() {
        return this.data;
    }
    
    /**
     * Sets the node's current data.
     * 
     * @param data the data to be stored in this node.
     */
    public void setData(E data) {
        this.data = data;
    }
    
    /**
     * Gets the next node.
     * 
     * @return a reference to the next node.
     */
    public Node<E> getNext() {
        return this.next;
    }
    
    /**
     * Sets the next node.
     * 
     * @param next a reference to the next node
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }
}