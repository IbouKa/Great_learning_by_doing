package DataStructureInJava.LinearDataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QeueImplementation {
    public static void main(String[] args) {
        // Declaration
        Queue<Integer> qu =new LinkedList<>();
        // Add element
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(5);
        System.out.println(qu);
        //get back end
        System.out.println(qu.peek());
        // get size
        System.out.println(qu.size());
        //test empty
        System.out.println(qu.isEmpty());
        // Remove the front end
        qu.remove();
        System.out.println(qu);



    }
}
