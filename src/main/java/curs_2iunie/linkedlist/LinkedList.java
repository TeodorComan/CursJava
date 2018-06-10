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

    public void insertSorted(int elemValue) {
        if(head==null) {
            head = new Element(elemValue);
        } else {
            Element auxElement = head;

            //search for the element to whose right
            // the new element should be inserted
            while(auxElement!=null &&
                    auxElement.getData()<=elemValue &&
                    auxElement.getPrevious()!=null &&
                    auxElement.getPrevious().getData()<elemValue ) {

                auxElement = auxElement.getPrevious();
            }

            if(auxElement.equals(head) && auxElement.getData()>elemValue){
                Element newElement = new Element(elemValue);
                newElement.setPrevious(head);
                head.setNext(newElement);
                head = newElement;
            } else {
                //create the new element with the int value
                // received on the method input
                Element newElement = new Element(elemValue);

                if (auxElement.getPrevious() != null) {
                    newElement.setPrevious(auxElement.getPrevious());
                    auxElement.getPrevious().setNext(newElement);
                }

                //start creating links
                auxElement.setPrevious(newElement);
                newElement.setNext(auxElement);
            }

        }

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


    public String toString() {

        String stringRepresentation=head.toString();

        Element aux = head;
        while(aux!=null && aux.getPrevious()!=null ) {
            aux=aux.getPrevious();
            stringRepresentation+=aux;
        }

        return stringRepresentation;

    }

}
