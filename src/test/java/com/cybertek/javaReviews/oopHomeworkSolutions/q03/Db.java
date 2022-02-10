package com.cybertek.javaReviews.oopHomeworkSolutions.q03;

public class Db {
    private String data;
    private int yint;

    public void insertData(String s,int i){
        //this.data=data;
        // this.yint = yint;
        // data = s;
        // yint = i;
        this.setData(s);
        this.setYint(i);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if(!data.equals(null))
        this.data = data;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }

    public static void main(String[] args) {
        Db db = new Db();
        db.insertData("aaa",123);

        System.out.println(db.getData());//aaa
        System.out.println(db.getYint());//123

        db.setData("zzz");
        db.setYint(200);

        System.out.println(db.getData());//zzz
        System.out.println(db.getYint());//200
    }
}
