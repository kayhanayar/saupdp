/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje2_java;


public abstract  class Sekil {
    protected String sekilTuru;
    
    abstract double alanHesapla();
    abstract void rastgeleDegerAta();
    
    
    Sekil(){
        sekilTuru="Bilinmiyor";
    }
    
    
    String turuGetir(){
        return sekilTuru;
    }
}
