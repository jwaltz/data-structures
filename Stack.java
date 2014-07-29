/**
 * Stack data structure. Public interface includes push, pop, peek,
 * isEmpty, and size.
 * <p>
 * This stack is implemented as a linked-list stack using the Node class.
 *
 * @author Jonathan Waltz
 * @param <E> the data type of the stack's elements
 */
public class Stack<E> {
    /**
     * A reference to the top of the stack
     */
    private Node<E> top;
    /**
     * The size of the stack
     */
    private int size;
    
    /**
     * Creates an empty stack.
     */
    public Stack() {
      this.top = null;
      this.size = 0;
    }
    
    /**
     * Returns the current size of the stack.
     * @return stack's size.
     */
    public int size() {
      return this.size;
    }
    
    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty, false if not.
     */
    public boolean isEmpty() {
      return this.top == null;
    }

    /**
     * Adds to the top of the stack.
     * @param data element being added
     */
    public void push(E data) {
      this.top = new Node<E>(data, top);
      this.size++;
    }
    
    /**
     * Checks what is on top of the stack.
     * @return the data on top of the stack.
     */
    public E peek() {
      if (this.top == null) {
        throw new IllegalStateException("Can't peek() into an empty stack");
      }
      return this.top.getData();
    }
    
    /**
     * Removes and returns the top of the stack.
     * @return the data on top of the stack.
     */
    public E pop() {
      if (this.top == null) {
        throw new IllegalStateException("Can't pop() from an empty stack");
      }
      E data = this.top.getData();
      this.top = this.top.getNext();
      this.size--;
      return data;
    }
}
