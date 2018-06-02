package curs_2iunie.linkedlist;

import curs_2iunie.linkedlist.stack.LinkedListStack;

public class Main {

    public static void main( String[] args ) {

        LinkedListStack linkedListStack = new LinkedListStack();

        linkedListStack.push(5);
        linkedListStack.push(7);
        linkedListStack.push(10);

        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());



    }
}
