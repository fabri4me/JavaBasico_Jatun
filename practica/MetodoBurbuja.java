

public class MetodoBurbuja
{
    
    public int [] MetodoBurbuja(int arr[])
    {
        //for cuando conoces cuantas veces se va a repetir el proceso
        for(int i=0;i<arr.length-1;i++){//cuantas veces hare lo de adentro
            for(int j=0;j<arr.length-1-i;j++){//el que recorre el array
            //cada que acabo una vuelta reduzco en i porque reduce una vez 
                int actual=arr[j];
                int vecino=arr[j+1]; 
                if(actual>vecino){
                    arr[j]= vecino;
                    arr[j+1]=actual; 
                }
            }
        }
        return arr;
    }
}
