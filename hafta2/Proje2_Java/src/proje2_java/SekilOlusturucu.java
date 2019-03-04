
package proje2_java;

import java.util.Random;


public class SekilOlusturucu {
    
    private static int sekilTurSayisi = 3;
    public static Sekil rastgeleOlustur(){
      
        int secim = RastgeleSayiOlusturucu.uret(sekilTurSayisi);
      
        Sekil aktifSekil = null;
        switch(secim){
            case 0:
                
                aktifSekil = new Daire();
                break;
            case 1:
                aktifSekil = new Kare();
                break;
            case 2:
                aktifSekil = new Ucgen();
                break;
        }
        
        aktifSekil.rastgeleDegerAta();
        
        return aktifSekil;
    }            
}
