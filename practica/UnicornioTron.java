
/**
 * Write a description of class UnicornioTron here.
 * 
 * @author (Fabricio Herrera) 
 * @version (28/09/21)
 */
import java.util.Random;
public class UnicornioTron
{
    private int montoPremio ,numFichas, numSecreto;

    public UnicornioTron(int premio)
    {
        montoPremio=premio;
        numFichas=0;

    }

    public int consultarPremio(){
        return montoPremio;
    }

    public int insertarFichas(int fichas){
        numFichas=fichas;
        return numFichas;
    }

    public void generarNumero(){

        Random r=new Random();
        numSecreto=(r.nextInt());

    }

    public String AdivinarNumero(int numero){
        String respuesta="";
        if(montoPremio>0){
            while(numFichas>0&&montoPremio>0)
            {
                if(numero==numSecreto){
                    montoPremio=0;
                    respuesta="Ganaste el premio";

                }else{
                    respuesta="Sigue Participando";        
                }
                numFichas--;
            }
        }else{    
        
            respuesta=("En este momento no puedes participar");
        }
        return respuesta;
    }
}
