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
public class Ucgen extends Sekil {
    double yukseklik,taban;
    
    public Ucgen(){
        
    }
    @Override
    double alanHesapla() {
        return yukseklik*taban/2;
    }

    @Override
    void rastgeleDegerAta() {
        yukseklik = RastgeleSayiOlusturucu.uret(10);
        taban = RastgeleSayiOlusturucu.uret(10);
    }
    
}

