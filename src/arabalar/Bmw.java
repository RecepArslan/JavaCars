/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arabalar;

/**
 *
 * @author aslan
 */
public class Bmw extends Fabrika {

    public Bmw(String Aracad, byte tekerlek) {
        super(Aracad, tekerlek, "BMW");

    }
  public void Hareket(){
     
      System.out.println("hareket basladi");
     
 }
    
  
   @Override
    public String Aracbilgi() {
      return getAracAd()+" araci "+getFabrikaAd()+" fabrikasinda üretilmistir.";
    }
}
