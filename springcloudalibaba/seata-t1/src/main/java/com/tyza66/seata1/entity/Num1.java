package com.tyza66.seata1.entity;

/**
 * Author: tyza66
 * Date: 2023/04/26 7:47
 * Github: https://github.com/tyza66
 **/
public class Num1 {
    int id;
    int num;

    public Num1() {
    }

    public Num1(int id, int num) {
        this.id = id;
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Num1{" +
                "id=" + id +
                ", num=" + num +
                '}';
    }
}
