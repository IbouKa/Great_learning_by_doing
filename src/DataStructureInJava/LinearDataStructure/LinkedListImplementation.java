package DataStructureInJava.LinearDataStructure;

import java.util.LinkedList;

public class LinkedListImplementation {
    public static void main(String[] args) {
        // Declaration
        LinkedList<Integer> lk =new LinkedList<>();
        //Add element
        lk.add(5);
        lk.add(6);
        lk.add(3);
        lk.add(1);
        lk.add(1,10);
        System.out.println(lk);
        //get firt
        System.out.println(lk.getFirst());
        //get Last
        System.out.println(lk.getLast());
        //get i
        System.out.println(lk.get(3));
        // remove first
        lk.removeFirst();
        System.out.println(lk);
        //remove last
        lk.removeLast();
        System.out.println(lk);
        // test e;pty
        System.out.println(lk.isEmpty());


    }
}
