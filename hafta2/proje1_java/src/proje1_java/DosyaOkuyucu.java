/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje1_java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;


public class DosyaOkuyucu {
    
    ArrayList<String> satirlar;
    public DosyaOkuyucu(){
        satirlar = new ArrayList<>();
    }
    public void dosyaOku(String dosyaIsmi) throws FileNotFoundException, IOException{
        File yeniDosya = new File(dosyaIsmi);
        
        BufferedReader okuyucu = new BufferedReader(new FileReader(yeniDosya));
        
        
        String aktifSatir;
        
        while((aktifSatir=okuyucu.readLine())!=null){
            satirlar.add(aktifSatir);
        }
        
        okuyucu.close();
    }
            
    public void yazdir(){
        
        for(String aktifSatir:satirlar){
            System.out.println(aktifSatir);
        }
    }
            
    
}
