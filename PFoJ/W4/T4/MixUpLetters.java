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

package T4;

import java.io.*;
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
		List<String> data = readFileInList("bin\\T4\\text.in");
		Iterator<String> itr = data.iterator();
		String shuffled = "";
		File outputFile = new File("bin\\T4\\text.out");
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
	    while (itr.hasNext()) 
	    {
	    	String row = itr.next();
	    	String[] splt = row.split(" ");
	    	StringBuilder sb = new StringBuilder();
	    	for (int i = 0; i < splt.length; i ++)
	    	{
	    		char c = ' ';
	    		if (splt[i].endsWith(".") || splt[i].endsWith(","))
	    		{
	    			c = splt[i].charAt(splt[i].length() - 1);
	    			splt[i] = splt[i].substring(0, splt[i].length() - 1);
	    		}
	    	    sb.append(shuffle(splt[i]));
	    	    if (c != ' ')
	    	    {
	    	    	sb.append(c);
	    	    }
	    	    sb.append(" ");
	    	}
	    	shuffled = sb.toString();
	    	
	    	writer.write(shuffled);
	    	writer.newLine();
	    }
	    writer.close();
	}
	
	//shuffles letters of a word if the length of the word is bigger than 3,
	//except the first and last letter of the word
	private static String shuffle(String word) 
	{
		StringBuilder shuffledWord = new StringBuilder();
		List<Character> letters = new ArrayList<Character>();
        for (char letter : word.toCharArray()) 
        {
            letters.add(letter);
        }
        if (letters.size() > 3) 
        {
            Collections.shuffle(letters.subList(1, letters.size() - 1));
        }
        for (char letter : letters) 
        {
        	shuffledWord.append(letter);
        }
		return shuffledWord.toString();
	}

}
