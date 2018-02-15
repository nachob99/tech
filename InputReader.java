import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is then chopped into words, and a set of words 
 * is provided.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    1.0 (2011.07.31)
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a set of words.
     *
     * @return  A set of Strings, where each String is one of the 
     *          words typed by the user
     */
     public HashSet<String> getInput()
    {
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine();
        inputLine.length();  
        
        HashSet<String> palabraPorPalabra = new HashSet<>();
        String[] arrayStrings = inputLine.split(" ");
        for (int i = 0; i < arrayStrings.length; i++) {
            palabraPorPalabra.add(arrayStrings[i]);
        }
       
        return palabraPorPalabra;
    }
}
