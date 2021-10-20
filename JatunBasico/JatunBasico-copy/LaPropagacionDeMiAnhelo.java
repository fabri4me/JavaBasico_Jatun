

public class LaPropagacionDeMiAnhelo
{
    public String numeroSignos(String frase){
        int res=0;
        for(int i=0;i<frase.length();i++){
            char actual=frase.charAt(i);
            if(esSigno(actual)){
                res++;
            }
        }
        return"El numero de signos de puntuacion es: "+res;
    }
    private boolean esSigno(char signo){
        
        return signo==','||signo=='.'||signo==';'||signo=='?'||signo=='!';    
    }
}
