package curs_2iunie.linkedlist.queue;

import curs_2iunie.linkedlist.Element;
import curs_2iunie.linkedlist.LinkedList;

public class LinkedListQueue {

    private LinkedList data = new LinkedList();

    public void enqueue(int element) {
        data.insertElement(new Element(element));
    }

    public Integer dequeue() {
        Element aux = data.getHead();

        while(aux!=null) {
            if(aux.getPrevious()==null) {
                aux.getNext().setPrevious(null);
                aux.setNext(null);
                return aux.getData();
            }
            aux = aux.getPrevious();
        }

        return null;
    }



//    public void enqueue(int element) {
//        data[tail] = element;
//        tail++;
//    }
//
//    public int dequeue() {
//        int element = data[head];
//        head++;
//        return element;
//    }

}
