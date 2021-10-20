
public class LosFragmentosDeDhilva
{
    public String ComparacionLexicografica(String palabra1,String palabra2){
        String res="";
        if(comparar(palabra1, palabra2)==0){
            res="Las palabras son lexicográficamente iguales";    
        }else if(comparar(palabra1, palabra2)>0){
            res="La palabra "+palabra1+" es es mayor lexicográficamente que la palabra "+palabra2;
        }else if(comparar(palabra1, palabra2)<0){
            res="La palabra "+palabra1+" es es menor lexicográficamente que la palabra "+palabra2;
        }
        return res;
    }
    private int comparar(String cad1,String cad2){
        int res=cad1.compareTo(cad2);
        return res;
    }
}
