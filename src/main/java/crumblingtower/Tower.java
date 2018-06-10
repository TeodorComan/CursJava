package crumblingtower;

import java.util.Arrays;

public class Tower {
    private int[] blocuri = new int[20];
    private int head=0;

    public void addBloc(int bloc){
        blocuri[head]=bloc;
        head++;

        if(getBlocuriWeight()>blocuri[0]*3){
            collapse();
        }
    }

    private int getBlocuriWeight(){
        int sum =0;
        for (int i =1; i<blocuri.length; i++){
            sum = sum + blocuri[i];
        }

        return sum;
    }

    private void collapse() {
        for(int i=0;i<blocuri.length-1;i++){
            blocuri[i]=blocuri[i+1];
        }

        blocuri[blocuri.length-1]=0;
        head--;
    }


    @Override
    public String toString() {
        return "Tower{" +
                "blocuri=" + Arrays.toString(blocuri) +
                ", head=" + head +
                '}';
    }
}
