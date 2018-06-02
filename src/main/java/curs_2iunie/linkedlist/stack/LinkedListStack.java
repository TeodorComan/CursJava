package curs_2iunie.linkedlist.stack;

import curs_2iunie.linkedlist.Element;
import curs_2iunie.linkedlist.LinkedList;

public class LinkedListStack {

    private LinkedList content = new LinkedList();

    public boolean isEmpty() {
        if(content.getHead()==null) {
            return true;
        }
        else {
            return false;
        }
    }

    public void push(int element) {
        content.insertElement(new Element(element));
    }

    public int pop() {

        int value = content.getHead().getData();

        content.deleteElement(value);

        return value;
    }



}
