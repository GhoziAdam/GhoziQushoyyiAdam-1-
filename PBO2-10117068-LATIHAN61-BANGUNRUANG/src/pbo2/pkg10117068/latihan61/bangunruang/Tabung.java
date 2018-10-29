/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan61.bangunruang;

/**
 *
 * @author user
 */
public class Tabung extends BangunRuang {
    
    private double r;
    private double h;
    public void setR(double r) {
        this.r=r;
    }
    public void setH(double h){
        this.h=h;
    }
    public double getR(){
        return r;
    }
    public double getH(){
        return h;
    }

    @Override
    public double hitungVolume() {
        return 3.14 + r * r * h;
    }
    
}
