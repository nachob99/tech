import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response, based on specified input.
 * Input is presented to the responder as a set of words, and based on those
 * words the responder will generate a String that represents the response.
 *
 * Internally, the reponder uses a HashMap to associate words with response
 * strings and a list of default responses. If any of the input words is found
 * in the HashMap, the corresponding response is returned. If none of the input
 * words is recognized, one of the default responses is randomly chosen.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    1.0 (2011.07.31)
 */
public class Responder
{
    private Random random;
    private ArrayList<String> respuesta;
    private HashMap<HashSet<String>, String> palabras;
    /**
     * Construct a Responder
     */
    public Responder()
    {
        random = new Random();

        palabras = new HashMap<>();
        
        createDefaultResponses();

        HashSet<String> opcion1 = new HashSet<String>();
        opcion1.add("Lo siento");
        opcion1.add("Ha muerto");

        HashSet<String> opcion2 = new HashSet<String>();  
        opcion2.add("imposible");

        HashSet<String> opcion3 = new HashSet<String>(); 
        opcion3.add("esto");
        opcion3.add("no");
        opcion3.add("va");

        palabras.put(opcion1, "El ordenador");
        palabras.put(opcion2, "No aceptamos cambios");
        palabras.put(opcion3, "no hace nada");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> userInput)
    {
        String response = null;

        response = palabras.get(userInput);

        if (response == null) {
            if(respuesta.size() > 0){
                response = respuesta.get(random.nextInt(respuesta.size()));  
            }
            else{
                response = "lo siento no le entiendo";

            }
        }
        return response;
    }
    
    private void createDefaultResponses(){
        respuesta = new ArrayList<String>();
        
        respuesta.add("Buenas");
        respuesta.add("Estamos trabajando en ello");
        respuesta.add("¿Necesita algo?");
        respuesta.add("Esperemos que no sea nada");
        respuesta.add("Un placer conocerle");   
        respuesta.add("No hay solucion");   
    }
}