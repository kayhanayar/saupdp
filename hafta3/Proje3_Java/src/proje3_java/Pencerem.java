/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje3_java;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author KayhanDesktop
 */
public class Pencerem extends JFrame {
    
    public JButton btnEkle;
    public JButton btnSil;
    public JTextArea yaziAlani1;
    public JTextArea yaziAlani2;
    
    public Pencerem(int genislik,int yukseklik){
        setSize(genislik, yukseklik);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void elemanlariYukle(){
        //buton oluşturuluyor
        btnEkle = new JButton("Ekle");
        btnSil = new JButton("Sil");
        yaziAlani1 = new JTextArea();
        //yazialanının sinirları atanıyor.
        yaziAlani1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                
        yaziAlani2 = new JTextArea();
        yaziAlani2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
       
        //Izgara yerleştirme düzeni oluşturuluyor
        GridLayout yeniDuzen = new GridLayout(2,2);
     
        
                  
        getContentPane().add(btnEkle);
        getContentPane().add(yaziAlani1);
        getContentPane().add(btnSil);
       
        getContentPane().add(yaziAlani2);
        
        //yerleştirme düzeni atanıyor.
        getContentPane().setLayout(yeniDuzen);
        
        btnEkle.addActionListener(new BenimSinifim());
        btnSil.addActionListener(new BenimSinifim());
        
        setVisible(true);
    }
    
    class BenimSinifim implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
           //iç sınıflara ait metotlar tanımladıkları sınıfın nesnesine de bağlıdırlar.
           //o nedenle actionPerformed metodunu çağıran nesne oluşturulduğu dış nesnenin elemanlarına erişebilir.
           //equals referansları karşılaştırır.
           if(ae.getSource().equals(btnEkle)){
               btnEkle.setText(yaziAlani1.getText());
           }else{
               btnSil.setText(yaziAlani2.getText());
           }
           
           
        }
    }
}
