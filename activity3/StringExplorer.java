/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		System.out.println("sample.indexOf(\"slow\") = " + sample.indexOf("slow"));
		System.out.println("sample.indexOf(\"he\", 25) = " + sample.indexOf("o", 25));
		System.out.println("sample.indexOf(\'d\') = " + sample.indexOf('d'));
		System.out.println("sample.indexOf(\'d\', 35) = " + sample.indexOf('d', 35));


	}

}
