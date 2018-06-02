package curs_2iunie.linkedlist;

public class LinkedList {
    private Element head;

    public Element getHead() {
        return head;
    }

    public void insertElement(Element newElement) {

        if(head!=null) {
            head.setNext(newElement);
        }

        newElement.setPrevious(head);

        head = newElement;
    }

    public Element searchElement(int element) {
        Element aux = head;
        while(aux!=null && aux.getData()!=element ) {
            aux=aux.getPrevious();
        }

        return aux;
    }

    public void deleteElement(int element) {

        Element myElement = searchElement(element);

        if(myElement!=null) {
            Element previousElement = myElement.getPrevious();
            Element nextElement = myElement.getNext();

            if(previousElement!=null) {
                previousElement.setNext(nextElement);
            }

            if(nextElement!=null) {
                nextElement.setPrevious(previousElement);
            } else {
                head = previousElement;
            }
        }
    }
}
