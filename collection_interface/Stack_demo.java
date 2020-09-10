
package collection_interface;

import java.util.Stack;
/* constructors of the stack 
1.Stack s = new Stack();

Mehods are available for Stack interface
1.push(Object p)
2.pop() // it removes the top of the object
3.int search(Object p)
4.Object peek()// it gives the top of the stack value without removal
*/

public class Stack_demo 
{
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push("A");
        s.push(3);
        s.push("beni");
        s.push(33.33);
        s.push("welcome");
        System.out.println(s);
        s.pop();  // it removes the top of the object present in the stack
        System.out.println(s.peek());//it gives the top of the object value without removal.
        System.out.println(s);
        System.out.println(s.search("beni"));
    }
    
}
