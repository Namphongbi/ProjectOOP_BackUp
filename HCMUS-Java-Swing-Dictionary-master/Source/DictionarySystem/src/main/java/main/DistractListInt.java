package main;

import java.util.Random;

public class DistractListInt {
    private static int count = 0;
    private int iDistract = 1;
    private final int num1 = 1;
    private final int num100 = 100;
    private String sDistract;
    private int ranNum;
    public DistractListInt() {
        sDistract = "erorr";
        Random rand = new Random();
        this.ranNum = rand.nextInt(num100)+num1;
    }
    public DistractListInt(String sDistract) {
        this.sDistract = sDistract;
        Random rand = new Random();
        this.ranNum = rand.nextInt(num100)+num1;
    }
    public DistractListInt(int iDistract) {
        this.iDistract = iDistract;
        sDistract = "erorr";
        Random rand = new Random();
        this.ranNum = rand.nextInt(num100)+num1;
    }
    public int getRanNum() {
        return ranNum;
    }

    public int getiDistract() {
        return iDistract;
    }

    public void setiDistract(int iDistract) {
        this.iDistract = iDistract;
    }


    public String getsDistract() {
        return sDistract;
    }

    public void setsDistract(String sDistract) {
        this.sDistract = sDistract;
    }

    public void addInt(){
        count ++;
    }

    public int getCount() {
        return count;
    }
    public double mathFor(){
        return Math.PI * (ranNum + iDistract);
    }
}
