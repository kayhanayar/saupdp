/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje2_java;

import java.util.Random;

/**
 *
 * @author KayhanDesktop
 */
public class RastgeleSayiOlusturucu {
    private static Random rnd = new Random();
    
    public static int uret(int sinir){
       return rnd.nextInt(sinir);
    }
}
