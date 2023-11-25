package main;

import java.util.ArrayList;

public class DistractListBoolean {
    private ArrayList<Boolean> distract;
    private int count = 0;
    public DistractListBoolean(){
        count ++;
    }
    public int getCount(){
        return this.count;
    }
    public ArrayList<Boolean> getDistract() {
        return distract;
    }

    public void setDistract(ArrayList<Boolean> distract) {
        this.distract = distract;
    }
    public void addList(boolean addList){
        distract.add(addList);
        count ++;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
