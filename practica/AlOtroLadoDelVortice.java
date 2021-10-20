
public class AlOtroLadoDelVortice
{
    public  void vortice(int [] arr){
        int posMayor=-1;
        int posMenor=-1;
        int cont1=0;
        for(int i=0;i<arr.length-1;i++){
            
            int actual=arr[cont1];
            int vecino=arr[i+1];

            if(actual>vecino){
                posMayor=cont1;
                
            }else{
                cont1=i+1;
                posMayor=cont1;        
                
            }
        }
        int cont2=0;
        for(int j=0;j<arr.length-1;j++){
            
            int actual=arr[cont2];
            int vecino=arr[j+1];

            if(actual<vecino){
                posMenor=cont2;    
            }else{
                cont2=j+1;
                posMenor=cont2;
                
            }
        }

        if(posMenor<posMayor){
            int []vortice= new int[posMayor-posMenor];
            int j=0;
            System.out.println("El arreglo esta formado por: ");
            for(int i=posMenor;i<(posMayor);i++){
                System.out.println(arr[i]);
            }     
        }else{
            System.out.println("El arreglo esta formado por: ");
            for(int i=posMayor;i<(posMenor);i++){
                System.out.println(arr[i]);
            }
        }
        System.out.println(posMenor);
        System.out.println(posMayor);
    }
    //{4,20,-11,2,18,-9,19,3,-13,5}
}
