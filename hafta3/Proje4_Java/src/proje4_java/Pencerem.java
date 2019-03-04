/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje4_java;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.lang.reflect.Array;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author KayhanDesktop
 */
public class Pencerem extends JFrame{
    Timer zaman = new Timer(10, new ZamanListener());
    
    Point merkez = new Point();
    Pencerem aktifPencere;
    public Pencerem(int genislik,int yukseklik){
        setSize(genislik,yukseklik );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        merkez.x = 0;
        merkez.y = 0;
        aktifPencere = this;
        
        zaman.start();
    }
  
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawRect(merkez.x, merkez.y, 100, 100);
       
        
    }

    class ZamanListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            merkez.x++;
            merkez.y++;
            aktifPencere.repaint();
        }
        
    }
}
