/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SauCizim;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author kayhan
 */
public abstract class Sekil {
    
    
    public abstract void    ciz(Graphics g2d);  

    
    protected Color renk;

    protected Point konum;
    
    public Color    renkGetir(){
        return renk;
    }
    public void     renkAta(Color renk){
        this.renk  = renk;
    }
    
     
    public Point    konumGetir(){
        return konum;
    }
    public void     konumAta(Point konum){
        this.konum = konum;
    }   
}
