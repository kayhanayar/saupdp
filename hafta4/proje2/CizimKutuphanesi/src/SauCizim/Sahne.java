/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SauCizim;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author kayhan
 */
public class Sahne {
    ArrayList<Sekil> sekilListesi;
    
    public Sahne(){
        sekilListesi = new ArrayList<>();
    }
    
    
    public void sekilEkle(Sekil yeniSekil){
        sekilListesi.add(yeniSekil);
    }
    public void sahneyiCiz(Graphics g2d){
        for(Sekil siradaki:sekilListesi){
            siradaki.ciz(g2d);
        }
    }
    public void sekilleriHareketEttir(){
        for(Sekil siradaki:sekilListesi){
            siradaki.hareketEt();
        }
    }
}
