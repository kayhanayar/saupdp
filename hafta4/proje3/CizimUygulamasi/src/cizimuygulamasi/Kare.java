/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cizimuygulamasi;

import SauCizim.Sekil;
import java.awt.Graphics;

/**
 *
 * @author kayhanayar
 */
public class Kare extends Sekil {
    private int genislik;

    public Kare(){
        yon = YON.YON_SAG;
    }
    
    public int getGenislik() {
        return genislik;
    }


    public void setGenislik(int genislik) {
        this.genislik = genislik;
    }


    @Override
    public void ciz(Graphics g2d) {
        g2d.fillRect(konum.x, konum.y, genislik, genislik);
    }

    @Override
    public void hareketEt() {
        switch(yon){
            case YON_SAG:
                konum.x++;
                break;
            case YON_SOL:
                konum.x--;
                break;
            case YON_YUKARI:
                konum.y++;
                break;
            case YON_ASAGI:
                konum.y--;
                break;
         
        }
    }

    @Override
    public boolean carpismaVarmi() {
        return true;
    }
    
}
