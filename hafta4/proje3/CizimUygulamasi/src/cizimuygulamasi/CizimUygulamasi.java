/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cizimuygulamasi;

import SauCizim.Pencere;
import SauCizim.Sahne;
import java.awt.Graphics2D;
import java.util.Timer;
import java.util.TimerTask;

public class CizimUygulamasi {

    Timer t = new Timer();
    
    Sahne sahne = new Sahne();
    
    Pencere pencerem = new Pencere(300, 400);
    
    
    public CizimUygulamasi() {
        
        Kare k1 = new Kare();

        k1.setGenislik(100);

        sahne.sekilEkle(k1);

        //Ciz sinifinden bir nesne oluştururken nesnenin bağlı olacağı CizimUygulamasi nesnesini belirtmemiz gerekiyor
        //Yani iç sınıftan nesne oluştura bilmek için öncelikle dış sınıftan bir nesne oluşturmalıyız.
        pencerem.cizimDinleyiciEkle(new CizimFonksiyonu());

        pencerem.setVisible(true);
        
        
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                
                pencerem.repaint();
                
            }
        },10,10);
    }
    
    class CizimFonksiyonu implements Pencere.CizimDinleyici {

        @Override
        public void cizim(Graphics2D g) {
            pencerem.arkaPlaniTemizle(g);
            sahne.sahneyiCiz(g);
           
            sahne.sekilleriHareketEttir();

        }

    }

    public static void main(String[] args) {
        //main fonksiyonu CizimUygulaması sinifi içerisinde tanıtılmış olsa dahi
        //Bu sınıfın fonksiyonlarına erişemez. CizimUygulaması nesnesi oluşturmadan
        //metotlara erişme şansımız olmaz.
        CizimUygulamasi c = new CizimUygulamasi();
    }

}
