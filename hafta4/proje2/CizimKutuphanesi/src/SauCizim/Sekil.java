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
    public abstract void    hareketEt();
    public abstract boolean carpismaVarmi();
    
    public enum YON{ YON_SOL,YON_SAG,YON_YUKARI,YON_ASAGI};
    
    
    protected Color renk;

    protected Point konum;
    
    protected YON   yon;
    
    
    public Color    renkGetir(){
        return renk;
    }
    public void     renkAta(Color renk){
        this.renk  = renk;
    }
    
     
    public Point    konumGetir(){
        return konum;
    }
    public void     pozisyonAta(Point konum){
        this.konum = konum;
    }   
    
    public YON      yonGetir(){
        return yon;
    }
    
    public void     yonAta(YON yon){
        this.yon = yon;
    }
    
    
}
