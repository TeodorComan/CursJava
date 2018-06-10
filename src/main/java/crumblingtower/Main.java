package crumblingtower;

public class Main {

    public static void main(String [] args){
        Tower tower = new Tower();

        tower.addBloc(4);
        tower.addBloc(5);
        tower.addBloc(1);
        tower.addBloc(3);
        System.out.println(tower.toString());
        tower.addBloc(10);
        tower.addBloc(1);

        System.out.println(tower.toString());
    }

}
