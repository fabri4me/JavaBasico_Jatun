
/**
 * 
 * 
 * @author (Fabri) 
 * @version (29/09/21)
 */
public class CuadernoUnicornio
{
    private String tareaActual;
    private int contadorTareas;
    private boolean tareaConcluida;
    public CuadernoUnicornio(String tareaInicial)
    {
        tareaActual=tareaInicial;
        contadorTareas=0;
        tareaConcluida=false;
    }
    public String consultarTareaActual(){
        return tareaActual;    
    }
    public boolean concluirTarea(){
        tareaConcluida=true;
        contadorTareas ++;
        return tareaConcluida;
    }
    public String crearActividad(String nuevaActividad){
        String respuesta="";
        if(tareaConcluida==false){
            respuesta="La tarea en curso, aún no ha sido concluida";    
        }else{
            respuesta="Nueva Tarea Asignada";
            tareaActual=nuevaActividad;
            tareaConcluida=false;
        }
        return respuesta;
    }
    public String tareasCompletadas(){
        return "el numero de tareas completadas es: "+contadorTareas;    
    }
}
