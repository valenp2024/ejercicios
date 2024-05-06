
/**
 * Write a description of class MedicionesTemperaturas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class MedicionesTemperaturas
{
    
    // lista de mediciones tomadas en la estacion meteorologica.
    private ArrayList<Float> mediciones;
    
    /**
     * Constructor de MedicionesTemperaturas. Crea la lista de mediciones vacía.
     */
    public MedicionesTemperaturas()
    {
        mediciones = new ArrayList<Float>();
    }
    
    /**
     * Agrega una nueva medicion de temperatura
     */
    public void agregarMedicion(float nuevaTemperatura) {
        assert nuevaTemperatura >= -273.15;//ejercicio 8
        mediciones.add(nuevaTemperatura);
    }
    
    /**
     * Imprime la lista de temperaturas/mediciones
     */
    public void imprimirTemperaturas()
    {
        System.out.println("Temperaturas Registradas:");
        for (Float temp: mediciones) {
            System.out.println(temp + "C");
        }
    }
    
    /**
     * Calcula el promedio de temperaturas. 
     * Precondicion: debe haber al menos una temperatura cargada para que el promedio tenga sentido.
     */
    public float promedioTemperaturas()
    {
        assert mediciones.size() > 0: "debe haber al menos una temperatura cargada para calcular el promedio";
        float suma = 0;
        for (Float temp: mediciones) {
            suma = suma + temp;
        }
        return suma / mediciones.size();
    }
    
    /**
     * Calcula cantidad de registros de temperaturas negativas (sub cero)
     */
    public int cantidadRegistrosSubCero() {
        int negativas = 0;
        for (Float temp: mediciones) {
            if (temp < 0) {
                negativas = negativas + 1;
            }
        }
        return negativas;
    }
    public int cantTemperaturasExtremas (){ //ejercicio 7
        int extremas = 0;
        for (float temp:mediciones){
            if (temp > 35 || temp < -15){
                extremas ++;
            }
        }
        return extremas;
    }
    public int consecutivasIguales(){//ejerecicio 9
        int cantIguales = 0;
        for (int i = 0; i < mediciones.size ()-1; i ++){
            if (mediciones.get (i).equals(mediciones.get(i++))){
                cantIguales ++;
            }
        }
        return cantIguales;
    }
}
