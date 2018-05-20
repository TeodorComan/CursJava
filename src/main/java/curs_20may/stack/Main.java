package curs_20may.stack;

public class Main {

    public static void main( String[] args ){
        Stack myStack = new Stack();
        System.out.println(myStack.isEmpty());
        myStack.push(4);
        myStack.push(3);
        myStack.push(2);
        myStack.push(6);
        myStack.push(7);
        myStack.push(7);
        myStack.push(7);
        myStack.push(7);
        myStack.push(7);
        myStack.push(7);
        System.out.println(myStack.isEmpty());
    }
}
