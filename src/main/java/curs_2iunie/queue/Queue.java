package curs_2iunie.queue;

import java.util.Arrays;

public class Queue {

    private int[] data = new int[3];

    private int head=1;
    private int tail=1;

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public void enqueue(int element) {
        data[tail] = element;
        tail++;
    }

    public int dequeue() {
        int element = data[head];
        head++;
        return element;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "data=" + Arrays.toString(data) +
                '}' +
                "\ntail = " + tail +
                "\nhead = " + head +
                "\ndata[tail-1] = " + data[tail-1] +
                "\ndata[head] = " +data[head];


}
}
