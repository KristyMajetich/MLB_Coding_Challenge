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
		testInput(new String[]{"Jeanne", "Rich", "Kristy"});
		testInput(new String[]{"Donna", "Levi", "Bobby", "Alea", "Julie", "Ben", "Kori","Karlita"});		
		testInput(new String[]{"Gloria", "Steve", "Jean", "Steve", "Paul", "Jim", "Donna"});
		testInput(new String[]{"1", "2", "3"});
		testInput(new String[]{"a", "b"});
		testInput(new String[]{"1","2","3","4","5","6","7","8","9","10"});		
		testInput(testLargeInput(50));
		testInput(testLargeInput(100));
		testInput(testLargeInput(500));
		testInput(new String[]{null});
		testInput(new String[]{""});
		testInput(new String[]{"","a","b"});
		testInput(new String[]{});
	}
	
	public static void testInput(String[] names)
	{
		new SecretSanta(names);
		System.out.println();
	}
	
	public static String[] testLargeInput(int size)
	{
		String[] names = new String[500];
		for (int i = 0; i < 500; i++)
		{
			names[i] = "" + i;
		}
		return names;
	}

}
