
package arabalar;


 // @author Recep Arslan
 
public class Mercedes extends Fabrika {
    
    public Mercedes(String Aracad,byte teker){
        
        super(Aracad,teker,"mercedes");
        
        
    }
public void Hareket(){
     
     System.out.println("hareket basladi");
          
}


    @Override
    public String Aracbilgi() {
      return getAracAd()+" araci "+getFabrikaAd()+" fabrikasinda üretilmistir.";
    }
    
}
