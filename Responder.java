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
    private HashMap<String, String> palabras;
    /**
     * Construct a Responder
     */
    public Responder()
    {
        random = new Random();
        respuesta = new ArrayList<String>();
        palabras = new HashMap<>();
        respuesta.add("Buenas");
        respuesta.add("Estamos trabajando en ello");
        respuesta.add("¿Necesita algo?");
        respuesta.add("Esperemos que no sea nada");
        respuesta.add("Un placer conocerle");   
        respuesta.add("No hay solucion");   

        palabras.put("Tiempo al tiempo.", "No es nada");
        palabras.put("Garantia? QUE ES ESO", "NO HAY");
        palabras.put("No queda" , "NADA");

    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> userInput)
    {
        String response = null;
        Iterator<String> iterator = userInput.iterator();
        boolean searching = true;
        while(iterator.hasNext() && searching){
            response = palabras.get(iterator.next());
            if (response != null){
                searching = false;
            }
        }
        if (response == null) {
            response = respuesta.get(random.nextInt(respuesta.size()));           
        }
        return response;
    }

}
