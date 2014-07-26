/**
 * Stack data structure. Public interface includes push, pop, peek,
 * isEmpty, and size.
 *
 * @author Jonathan Waltz
 * @param <E> the data type of the stack's elements
 */
public class Stack<E> {

    private Node<E> top;
    private int size;

    public Stack() {
      this.top = null;
      this.size = 0;
    }

    public int size() {
      return this.size;
    }

    public boolean isEmpty() {
      return this.top == null;
    }

    public void push(E data) {
      this.top = new Node(data, top);
      this.size++;
    }

    public E peek() {
      if (this.top == null) {
        throw new IllegalStateException("Can't peek() into an empty stack");
      }
      return this.top.getData();
    }

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
