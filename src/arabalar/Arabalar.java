/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arabalar;

/**
 *
 * @author Recep Arslan
 */
public class Arabalar {

   
    public static void main(String[] args) {
        Bmw araba1=new Bmw("b1",(byte)2);
        Mercedes araba2=new Mercedes("m1",(byte)4);
        Mercedes araba3=new Mercedes("m2",(byte)2);
        
        System.out.println(araba1.Aracbilgi());
        System.out.println(araba2.Aracbilgi());
        System.out.println(araba3.Aracbilgi());
        araba2.Hareket();
        araba1.Hareket();
        
        
        
    }
    
}
