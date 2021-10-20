
//atributos ---caracteristicas
//metodos ----acciones que realiza el perro
public class Perro
{
    private String nombre;
    private int edad;
    private String raza;
    public Perro(String vNombre,int vEdad,String vRaza)//constructor
    {
        nombre =vNombre;
        edad=vEdad;
        raza=vRaza;
    }
    //nombre-atributos-constructor-metodos
    
    public String ladrar(String mensajeDeAliento){//metodo--accion
        String ladrido="guau guau guau guau guau guau";
        return ladrido;
    }
    
    
    
    
    
    
    
    
    public String getRaza(){//metodo get
        return raza;    
    }
    public String getNombre(){
        return nombre;    
    }
    public int getEdad(){
        return edad;    
    }
    public void setNombre(String nomb){//metodo set
        nombre = nomb;        
    }
    public void setRaza(String raz){
        raza = raz;        
    }
    public void setNombre(int edad){
        edad=edad;        
    }
    
}
