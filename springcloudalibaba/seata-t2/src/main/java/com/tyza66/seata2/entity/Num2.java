package com.tyza66.seata2.entity;

/**
 * Author: tyza66
 * Date: 2023/04/26 7:47
 * Github: https://github.com/tyza66
 **/
public class Num2 {
    int id;
    int num;

    public Num2() {
    }

    public Num2(int id, int num) {
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
        return "Num2{" +
                "id=" + id +
                ", num=" + num +
                '}';
    }
}
