import java.util.ArrayList;
public class ListaContactos extends Persona
{
    protected ArrayList<Amigo> lista;
    public ListaContactos()
    {
        lista =new ArrayList<>();    
    }

    public void add(Amigo amigoNuevo){
        lista.add(amigoNuevo);    
    }

    public boolean getAmigo(int numCelu){
        boolean res=false;
        ArrayList<Amigo> respuesta=new ArrayList<>();
        for(int i=0;i<lista.size();i++){
            Amigo act=lista.get(i); 
            if(act.getCelular()==numCelu){
                res=true;        
            }
        }
        return res;
    }

    public boolean getAmigo2(String nombre){
        boolean res=false;
        ArrayList<Amigo> respuesta=new ArrayList<>();
        for(int i=0;i<lista.size();i++){
            Amigo act=lista.get(i); 
            if(act.getNombre()==nombre){
                res=true;        
            }
        }
        return res;
    }

    public void ordenarArray(){
        for(int j=0;j<lista.size()-1;j++){
            for(int i=0;i<lista.size()-1;i++){
                Amigo act=lista.get(i);
                Amigo vecino=lista.get(i+1);
                String act1=act.getNombre();
                String vecino1=vecino.getNombre();
                if(comparar(act1, vecino1)>0){
                    lista.add(i, vecino);
                    lista.add(i+1, act);

                }
            }
        }
    }

    private int comparar(String cad1,String cad2){
        int res=cad1.compareTo(cad2);
        return res;
    }
}
