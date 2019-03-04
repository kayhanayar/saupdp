/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje2_java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author KayhanDesktop
 */
//Eğer bu sınıfı Proje1_Java sınıfı içerisine yerleştirirseniz bir problem çıkıyor
//Sorunu deneyim sebebini öğrenebilirsiniz.

class BenimSinifim implements ActionListener{

        @Override
    public void actionPerformed(ActionEvent ae) {
           //ActionEvent nesnesinin getSource metodu.
           //olayın oluştuğu nesnenin referansını döndürür.
           //bu referans object türünden olduğu için öncelikle onu JButton sınıfına DownCast Yaptık
           //DownCast riskli bir işlemdir.
           ((JButton)ae.getSource()).setText("Değişti mi ne");
    }
        
}

public class Proje2_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame yeniPencere = new JFrame("İlk Pencerem");
        
        yeniPencere.setSize(640,480);
        
        //Bu pencere kapatıldığında uygulamada sonlandırılacak
        yeniPencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //buton oluşturuluyor
        JButton buton = new JButton("ilk butonum");
       
        //Butonu eklemek için 
        yeniPencere.getContentPane().add(buton);
        buton.addActionListener(new BenimSinifim());
        //pencereyi görünür yap.
        yeniPencere.setVisible(true);
    }
    
}
