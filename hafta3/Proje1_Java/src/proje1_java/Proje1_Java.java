/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje1_java;

import javax.swing.*;


public class Proje1_Java {

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
        
        //pencereyi görünür yap.
        yeniPencere.setVisible(true);
    }
    
}
