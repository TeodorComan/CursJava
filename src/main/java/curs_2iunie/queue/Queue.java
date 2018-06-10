package curs_2iunie.queue;

import java.util.Arrays;

public class Queue {
    private int[] content = new int[7];
    private int head = 1;
    private int tail = 1;

    public void enqueue(int element) {
        content[tail] = element;
        tail++;
    }

    public int dequeue() {
        int element = content[head];
        //dupa ce ai obtinut element pe care il vei returna maresti valoarea lui head cu 1 pentru head trebuie mereu sa indice catre urmatoarea valoare pe care o vei citi
        head++;

        //daca head-ul e mai mare decat jumatate din lista, atunci mutam elementele din lista
        if(head>content.length/2) {
            moveElements();
        }

        return element;
    }

    public void moveElements(){
        //iteram prin toate elementele incepand de la pozitia 1 pana la jumatatea listei
        for(int i = 1; i<=content.length/2;i++){
            //copiem elementul pe pozitia indicata de i. in content[head+i-1] avem nevoie de i pentru ca incepem sa copiem elementele care incep cu pozitia indicata de head
            //insa pe masura ce creste i-ul deci copiem elementul pe o pozitie superioara, trebuie sa creasca si pozitia de pe care copiem elementul, deci head+i.
            // insa daca lasam head+i primul element copiem de pe o pozitie gresita, deci adaugam si un -1 astfel incat sa incepem copierea cu elementul indicat de pozitia head
           content[i]=content[head+i-1];

           //mai sus doar am copiat elementul, ceea ce inseamna ca acesta mai exista si pe o pozitie superioara, drept urmare ii dam valoarea 0 pe pozitia superioara
           content[head+i-1]=0;
        }

        // dupa ce am mutat elementele modificam pozitiile indicate de head si de tail astfel incat cand continuam sa citim si sa adaugam elemente, sa se faca de pe si pe pozitiile corecte.
        head=1;
        tail=content.length/2+1;
    }

    public String toString() {
        //reprezentare citibila a obiectului. Vreem sa vedem starea obiectului dupa parcurgerea pasilor (un fel de debug) Scoate ceva in evidenta
        return "Queue.Queue{" +
                "tail=" +content+
                '}' +//\n = rand nou
                "\ntail = " + tail+
                "\nhead = " + head+
                "\ncontent[tail]= " + content[tail-1]+
                "\ncontent[head]= " + content[head];
    }
}