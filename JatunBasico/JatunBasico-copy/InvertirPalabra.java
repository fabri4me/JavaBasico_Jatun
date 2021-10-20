
public class InvertirPalabra
{
   public String invertir (String cad){
       String res="";
       for(int pos=0;pos<cad.length();pos++){
           char act= cad.charAt(pos);
           res=act+res;
       }
       return res;
   }
   public String invertir2 (String cad){
       String res="";
       //derecha a izquierda
       for(int pos=cad.length()-1;pos>=0;pos--){
           char act= cad.charAt(pos);
           res=res+act;
       }
       return res;
   }
   public String invertir3 (String cad){
       StringBuilder res=new StringBuilder(cad);
       res=res.reverse();
       
       return res.toString();
   }
}
