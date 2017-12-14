/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Ben Godfrey
 * @version 13 DEC 2017
 */
public class Magpie2
{

	private static final String TEACHER_NAME = "Cooper";

	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0)
		{
			response = "Say something please.";
		}
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("calculus") >= 0) {
			response = "Don't forget to set your calculator to the pure angle measurement unit: degrees!! /s";
		} else if (statement.indexOf("aperture") >= 0) {
			response = "Weighted storage cube destroyed. Please proceed to the Aperture Science Vital Apparatus Vent for a replacement.";
		} else if (statement.indexOf("code") >= 0) {
			response = "I prefer Java.";
		} else if (statement.indexOf("coffee") >= 0) {
			response = "Coffee is essential to life on earth.";
		}
		else if (statement.indexOf("pets") >= 0
				|| statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf(TEACHER_NAME) >= 0)
		{
			response = "He sounds like a good teacher.";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Uh huh. That's interesting.";
		}
		else if (whichResponse == 5)
		{
			response = "WOW! That's incredible. /s";
		}
		else if (whichResponse == 6)
		{
			response = "Thank you for enriching my life with this very pertinent and interesting information. /s";
		}

		return response;
	}
}
