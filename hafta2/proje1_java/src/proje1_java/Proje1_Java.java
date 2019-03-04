
package proje1_java;

import java.io.IOException;

public class Proje1_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        
        DosyaOkuyucu yeniDosya = new DosyaOkuyucu();
        
        yeniDosya.dosyaOku("Deneme.txt");
        
        yeniDosya.yazdir();
    }
    
}
