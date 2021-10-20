
public class ElLegadoDeLosAncestros
{
    public String prefijos(String name,String prefix){
        String ans="";
        String ans1="";
        for(int i=0;i<prefix.length();i++){
            char currentW=name.charAt(i);
            ans=ans+currentW;
        }
        if(ans.equals(prefix)){
            ans1="El nombre empieza con el mismo prefijo";        
        }else{
            ans1="El nombre NO empieza con el mismo prefijo";
        }
        return ans1;
    }
    
}
