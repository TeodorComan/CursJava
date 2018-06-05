package curs_2iunie.linkedlist.xando;

public class Board {
    private Cell topLeft = new Cell();

    public Cell getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Cell topLeft) {
        this.topLeft = topLeft;
    }

    public Board (int rows, int cols){
        int col = 2;
        for(int row = 1; row<= rows; row++) {
            for(; col<=cols; col++) {
                Cell cell = new Cell();
                if(col!=1) {
                    Cell leftNeighbour = getLeftNeighbour(topLeft,col, row);
                    cell.setLeft(leftNeighbour);
                    leftNeighbour.setRight(cell);

                    if (leftNeighbour.getTop() != null) {
                        leftNeighbour.getTop().getRight().setBottom(cell);
                        cell.setTop(leftNeighbour.getTop().getRight());
                    }
                }
                 else {
                    Cell topNeighbour =getTopNeighbour(topLeft);
                    cell.setTop(topNeighbour);
                    topNeighbour.setBottom(cell);
                }
            }
            col = 1;
        }
    }

    private Cell getLeftNeighbour(Cell neighbour, int myColPosition, int myRowPosition){
        Cell leftUpperMostNeighbour = getLeftUpperMostNeighbour(neighbour, myColPosition,1);
        return getLeftXNeighbour(leftUpperMostNeighbour,myRowPosition, 1);
    }

    private Cell getLeftXNeighbour(Cell leftUpperMostNeighbour, int myRowPosition, int row) {
        if(row==myRowPosition) {
            return leftUpperMostNeighbour;
        } else {
            return getLeftXNeighbour(leftUpperMostNeighbour.getBottom(),myRowPosition,++row);
        }
    }

    private Cell getTopNeighbour(Cell neighbour) {
        if(neighbour.getBottom()==null) {
            return neighbour;
        } else {
            return getTopNeighbour(neighbour.getBottom());
        }
    }

    private Cell getLeftUpperMostNeighbour(Cell neighbour, int myColPosition, int col) {
        if(col!=myColPosition-1) {
            return getLeftUpperMostNeighbour(neighbour.getRight(),myColPosition,++col);
        } else {
            return neighbour;
        }
    }
}
