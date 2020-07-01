
package arabalar;

/**
 *
 * @author aslan
 */
public abstract class Fabrika {
    
    private String AracAd;
    private String FabrikaAd;
    private byte TekerlekSayisi;
    Fabrika(String AracAd,byte TekerSayisi,String FabrikaAd){
        this.AracAd=AracAd;
        TekerlekSayisi=TekerSayisi;
        this.FabrikaAd=FabrikaAd;
        
    }
   public String getAracAd(){
       
       return AracAd;
       
   }
    public String getFabrikaAd(){
       
       return FabrikaAd;
       
   }
     public  abstract String Aracbilgi();

   }
    
    
