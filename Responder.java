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
    // Used to map key words to responses.
    private HashMap<String, String> responseMap;
    // Default responses to use if we don't recognise a word.
    private ArrayList<String> defaultResponses;
    private Random randomGenerator;
    private Random random;
    private ArrayList<String> respuesta;
    /**
     * Construct a Responder
     */
    public Responder()
    {
         random = new Random();
        respuesta = new ArrayList<String>();
        respuesta.add("Buenas");
        respuesta.add("Estamos trabajando en ello");
        respuesta.add("¿Necesita algo?");
        respuesta.add("Esperemos que no sea nada");
        respuesta.add("Un placer conocerle");   
        respuesta.add("No hay solucion");    
    }

    /**
     * Generate a response from a given set of input words.
     * 
     * @param words  A set of words entered by the user
     * @return       A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> words)
    {
         return respuesta.get(random.nextInt(respuesta.size()));
    }

}
