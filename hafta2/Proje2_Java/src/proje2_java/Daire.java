/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje2_java;

/**
 *
 * @author KayhanDesktop
 */
public class Daire extends Sekil {

    double yaricap;
    public Daire(){
        
    }
    @Override
    double alanHesapla() {
        return yaricap*yaricap*Math.PI;
    }

    @Override
    void rastgeleDegerAta() {
        yaricap = RastgeleSayiOlusturucu.uret(10);
    }
    
}
