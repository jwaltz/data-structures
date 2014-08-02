import junit.framework.TestCase;

/**
 * jUnit tests for the Node<E> class.
 */
public class NodeTest extends TestCase {
    
    public void testConstructWithNext() {
        Node<Integer> after = new Node<Integer>(1);
        Node<Integer> before = new Node<Integer>(1, after);
        assertEquals("before.getNext() returns a ref to after", after, before.getNext());
    }
    
    public void testSetData() {
        Node<String> node = new Node<String>("hello");
        node.setData("world");
        assertEquals("setting node data to \"world\"", "world", node.getData());
    }
    
    public void testSetNext() {
        Node<String> before = new Node<String>("hello");
        Node<String> after = new Node<String>("world");
        before.setNext(after);
        assertEquals("setting next node", after, before.getNext());
    }
}