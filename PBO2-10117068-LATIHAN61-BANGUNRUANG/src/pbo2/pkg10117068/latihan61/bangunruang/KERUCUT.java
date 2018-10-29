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
public class KERUCUT extends BangunRuang{
    
    private double t;
    private double r;
    
    public void setT(double t){
        this.t = t;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public double getR() {
        return r;
    }

    @Override
    public double hitungVolume() {
       return (1 * 3.14 * r * r * t)/3; 
    }
    
}
