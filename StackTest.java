import junit.framework.TestCase;

/**
 * jUnit tests for the Stack<E> class;
 */
public class StackTest extends TestCase {
    
    public void testPush() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
    }
    
    public void testPeek() {
        Stack<String> stack = new Stack<String>();
        try {
            stack.peek();
        } catch(IllegalStateException e) {
            // can't peek into an empty stack
        }
        stack.push("hello");
        assertEquals("top element of stack is \"hello\"", "hello", stack.peek());
    }
    
    public void testPushAndPeek() {
        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        assertEquals("top element of stack is \"hello\"", "hello", stack.peek());
        stack.push("world");
        assertEquals("top element of stack is now \"world\"", "world", stack.peek());
    }
    
    public void testPop() {
        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("world");
        assertEquals("popping \"world\"", "world", stack.pop());
        assertEquals("popping \"hello\"", "hello", stack.pop());
    }
    
    public void testSize() {
        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("world");
        assertEquals("stack size is 2", 2, stack.size());
    }
    
    public void testIsEmpty() {
        Stack<String> stack = new Stack<String>();
        assertEquals("stack is empty", true, stack.isEmpty());
        stack.push("hello");
        assertEquals("stack is not empty", false, stack.isEmpty());
    }
}