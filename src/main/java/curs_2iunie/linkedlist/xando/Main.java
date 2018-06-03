package curs_2iunie.linkedlist.xando;

public class Main {

    public static void main( String[] args ) {

        Board board = new Board();

        Cell cell2a= new Cell();
        cell2a.setLeft(board.getTopLeft());
        board.getTopLeft().setRight(cell2a);

        Cell cell3a = new Cell();
        cell3a.setLeft(cell2a);
        cell2a.setRight(cell3a);

        Cell cell1b = new Cell();
        cell1b.setTop(board.getTopLeft());
        board.getTopLeft().setBottom(cell1b);

        Cell cell2b = new Cell(cell1b,null,cell2a,null);
        Cell cell3b = new Cell(cell2b,null,cell3a,null);
    }
}
