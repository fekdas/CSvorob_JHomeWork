package homework8;

/**
 * С помощью регулярных выражений осуществить сжатие английского текста,
 * заменив каждую группу из двух или более рядом стоящих символов, на один символ,
 * за которым следует количество его вхождений в группу.
 * К примеру, строка hellowoooorld должна сжиматься в hel2owo4rld.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homework8task1 {

	public static void main(String[] args) {
		searchDuplicate ("hellowoooorld");
	}
	
	public static void searchDuplicate (String strng) {
		Matcher mtchr;
		Pattern pttrn = Pattern.compile("([a-z])\\1");   
			do
			{	
				mtchr = pttrn.matcher(strng);
				if (mtchr.find())
			    {
					int k = 1; //количество вхождений в группу
					String dup = mtchr.group(1); //один символ
			    	int i = mtchr.end(1); //индекс символа
			    	while (i<strng.length() && dup.toCharArray()[0] == strng.charAt(i))
			    		{
			    			i++;
			    			k+=1;
			    		}
			     String gr = "["+dup+"]{"+k+"}"; //замена группы копий на 1 символ + кол-во копий
			     strng = strng.replaceFirst(gr, dup + k); 
			     }
			}
			while (mtchr.find());
			
			System.out.println(strng);		
	}
	
}
