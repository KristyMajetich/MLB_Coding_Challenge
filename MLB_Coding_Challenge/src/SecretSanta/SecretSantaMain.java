package SecretSanta;

public class SecretSantaMain 
{

	/* Imagine that every year your extended family does a "Secret Santa" gift 
	 * exchange. For this gift exchange, each person draws another person at 
	 * random and then gets a gift for them. Write a program that will choose 
	 * a Secret Santa for everyone given a list of all the members of your 
	 * extended family. Obviously, a person cannot be their own Secret Santa.
	 * 
	 * Assumptions:
	 *	- names cannot be null
	 *	- names must be unique
	 *  - must contain at least two names
	 */
	
	public static void main(String[] args) 
	{
		testInput("names.txt");
	}
	
	public static void testInput(String filename)
	{
		new SecretSanta(filename);
	}

}
