/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SauCizim;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author kayhan
 */
public class Pencere extends JFrame {
  
    ArrayList<CizimDinleyici> cizimListenerListesi = new ArrayList<>();
    
    public Pencere(int gen,int yuk){
        //Eğer super ismi kullanılmazsa ortaya çıkacak problemler araştırılabilir.
        //https://stackoverflow.com/questions/3404301/whats-wrong-with-overridable-method-calls-in-constructors
        super.setSize(gen,yuk);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    @Override
    public void paint(Graphics g){
      for(CizimDinleyici siradaki:cizimListenerListesi){
          siradaki.cizim((Graphics2D)g);
      }
    }
    public void cizimDinleyiciEkle(CizimDinleyici dinleyici){
        cizimListenerListesi.add(dinleyici);
               
    }
    
    public interface CizimDinleyici{
        void cizim(Graphics2D g);
    }
}
