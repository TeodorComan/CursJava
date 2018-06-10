package curs_20may.stack;

public class Stack {
    //the index of the most recent insertion
    private int top = 0;

    private int[] content = new int[5];


    //boolean isEmpty;
    public boolean isEmpty() {
        if(top==0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int element) {
        if(content.length<top+2) {
            increaseStack();
        }

        content[top+1]= element;
        top++;
    }

    public int pop() {
        int element = content[top];
        top--;
        return element;
    }

    private void increaseStack() {
        int[] newArray = new int[content.length + content.length/2];

        System.arraycopy(content,0,newArray,0,content.length);

        content = newArray;
    }

}
