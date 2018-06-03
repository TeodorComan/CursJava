package curs_2iunie.linkedlist.xando;

public class Cell {

    private Cell left;
    private Cell right;
    private Cell top;
    private Cell bottom;

    public Cell(Cell left, Cell right, Cell top, Cell bottom) {

        this.left = left;
        if(left!=null) {
            left.setRight(this);
        }

        this.right = right;
        if(right!=null) {
            right.setLeft(this);
        }

        this.top = top;
        if(top!=null) {
            top.setBottom(this);
        }

        this.bottom = bottom;
        if(bottom!=null){
            bottom.setTop(this);
        }
    }

    public Cell () {

    }

    public Cell getLeft() {
        return left;
    }

    public void setLeft(Cell left) {
        this.left = left;
    }

    public Cell getRight() {
        return right;
    }

    public void setRight(Cell right) {
        this.right = right;
    }

    public Cell getTop() {
        return top;
    }

    public void setTop(Cell top) {
        this.top = top;
    }

    public Cell getBottom() {
        return bottom;
    }

    public void setBottom(Cell bottom) {
        this.bottom = bottom;
    }



}
