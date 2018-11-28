/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Mix Up Letters!
* Link: exercises04.pdf
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 10.11.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/

package T5;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class MixUpLetters 
{	
	public static List<String> readFileInList(String fileName) 
	{ 
	  
	    List<String> lines = Collections.emptyList(); 
	    try
	    { 
	    	lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
	    } 
	  
	    catch (IOException e) 
	    { 
	    	e.printStackTrace(); 
	    } 
	    return lines; 
	}
	
	public static void main(String[] args) throws Exception
	{
		String output = "YES";
		List<String> data = readFileInList("bin\\T5\\text.in");
		Iterator<String> itr = data.iterator();
		List<String> data2 = readFileInList("bin\\T5\\text2.in");
		Iterator<String> itr2 = data2.iterator();
	    while (itr.hasNext()) 
	    {
	    	String row = itr.next();
	    	String row2 = itr2.next();
	    	String[] splt = row.split(" ");
	    	String[] splt2 = row2.split(" ");
	    	if (splt.length != splt2.length)
	    	{
	    		output = "NO";
	    	}
	    	for (int i = 0; i < splt.length; i ++)
	    	{
	    		if (splt[i].endsWith(".") || splt[i].endsWith(","))
	    		{
	    			splt[i] = splt[i].substring(0, splt[i].length() - 1);
	    		}
	    		if (splt2[i].endsWith(".") || splt2[i].endsWith(","))
	    		{
	    			splt2[i] = splt2[i].substring(0, splt2[i].length() - 1);
	    		}
	    		if (!equalLetters(splt[i], splt2[i]))
	    		{
	    			output = "NO";
	    		}
	    	}
	    }
	    System.out.println(output);
	}

	private static boolean equalLetters (String word, String word2) 
	{
		List<Character> letters = new ArrayList<Character>();
		List<Character> letters2 = new ArrayList<Character>();
        for (char letter : word.toCharArray()) 
        {
            letters.add(letter);
        }
        for (char letter2 : word2.toCharArray()) 
        {
            letters2.add(letter2);
        }
        return letters.containsAll(letters2);
	}

}
