/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cizimuygulamasi;

import SauCizim.Pencere;
import java.awt.Graphics2D;

/**
 *
 * @author kayhan
 */
class Ciz implements Pencere.CizimDinleyici{

    @Override
    public void cizim(Graphics2D g) {
        g.drawRect(100, 100, 100, 100);
    }
    
}
public class CizimUygulamasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Pencere pencerem = new Pencere(300, 400);
        pencerem.cizimDinleyiciEkle(new Ciz());
        pencerem.setVisible(true);
    }
    
}
