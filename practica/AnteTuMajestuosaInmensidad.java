
import java.util.Arrays;
public class AnteTuMajestuosaInmensidad
{
     
    public AnteTuMajestuosaInmensidad()
    {
        
    }
    public int [] arreglo (int [] arr){
        Arrays.sort(arr);
        int contImpar=0;
        int contPar=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2!=0){
                contImpar ++; 
            }else{
                contPar ++;    
            }
        }
        int j=0;
        for(int i=0;i<contImpar-1;i++){
            if(arr[i]% 2!=0){
                int impar=arr[i];
                arr[j]=impar;
            }
            
        }
        for(int i=arr.length-1;i>arr.length-contPar-1;i++){
            if(arr[i]%2==0){
                int impar=arr[i];
                arr[j]=impar;
            }
            
        }
    }
    
}
