/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Pham Thanh
 */
public class PHoc implements Serializable{
    private int ma;
    private String ten;
    private int soghe;
    private String kp;
    private static int sma = 10000;

    public PHoc(int ma, String ten, int soghe, String kp) {
        this.ma = ma;
        this.ten = ten;
        this.soghe = soghe;
        this.kp = kp;
    }

    public PHoc() {
        ma = sma++;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoghe() {
        return soghe;
    }

    public void setSoghe(int soghe) {
        this.soghe = soghe;
    }

    public String getKp() {
        return kp;
    }

    public void setKp(String kp) {
        this.kp = kp;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        PHoc.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,soghe,kp
        };
    }
}
