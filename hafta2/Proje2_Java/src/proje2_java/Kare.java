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
public class Kare extends Sekil{
    double boyut;
    public Kare(){
    
    }
    
    @Override
    double alanHesapla() {
        return boyut*boyut;
    }

    @Override
    void rastgeleDegerAta() {
        boyut = RastgeleSayiOlusturucu.uret(10);
    }
    
}
