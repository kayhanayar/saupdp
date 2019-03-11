/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cizimuygulamasi;

import SauCizim.Pencere;
import SauCizim.Sahne;
import java.awt.Graphics2D;

/**
 *
 * @author kayhan
 */


public class CizimUygulamasi {
    class CizimFonksiyonu implements Pencere.CizimDinleyici{

        @Override
        public void cizim(Graphics2D g) {
            g.drawRect(100, 100, 100, 100);
        }

    }
    Sahne sahne= new Sahne();

    public static void main(String[] args) {

        
        //main fonksiyonu CizimUygulaması sinifi içerisinde tanıtılmış olsa dahi
        //Bu sınıfın fonksiyonlarına erişemez. CizimUygulaması nesnesi oluşturmadan
        //metotlara erişme şansımız olmaz.
        CizimUygulamasi c = new CizimUygulamasi();
        
        Pencere pencerem = new Pencere(300, 400);
        
               
        Kare k1  = new Kare();
        
        k1.setGenislik(100);
        
        c.sahne.sekilEkle(k1);
        
        //Ciz sinifinden bir nesne oluştururken nesnenin bağlı olacağı CizimUygulamasi nesnesini belirtmemiz gerekiyor
        //Yani iç sınıftan nesne oluştura bilmek için öncelikle dış sınıftan bir nesne oluşturmalıyız.
                
        pencerem.cizimDinleyiciEkle(c.new CizimFonksiyonu());
        
        pencerem.setVisible(true);
    }
    
}
