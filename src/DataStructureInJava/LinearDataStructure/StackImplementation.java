package DataStructureInJava.LinearDataStructure;
import java.util.Stack;
import java.util.Iterator;

public class StackImplementation {
    public static void main(String[] args) {
        // Declaration 
        Stack<Integer> st =new Stack<>();
        // Add element
        st.push(5);
        st.push(3);
        st.push(2);
        //Get top element
        System.out.println(st.peek());
        System.out.println(st);
        //Delete top element
        st.pop();
        System.out.println(st);
        // get size
        System.out.println(st.size());
        // sort 
        st.sort(null);
        System.out.println(st);
        // iterate
        Iterator<Integer> it = st.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }

    }
}
