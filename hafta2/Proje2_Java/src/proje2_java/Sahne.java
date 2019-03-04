/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje2_java;

import java.util.ArrayList;

/**
 *
 * @author KayhanDesktop
 */
public class Sahne {
    ArrayList<Sekil> sekiller;
    public Sahne(){
        sekiller = new ArrayList<>();
                
    }
    
    public void sekilEkle(int adet){
        for(int i=0;i<adet;i++){
            sekiller.add(SekilOlusturucu.rastgeleOlustur());
        }
    }
    public void sekilAlanlariniYazdir(){
        for(Sekil siradaki:sekiller){
            System.out.println("----------------------------------");
            System.out.println(siradaki.turuGetir());
            System.out.println("Alan...:"+siradaki.alanHesapla());
        }
         System.out.println("----------------------------------");
        
    }
}
