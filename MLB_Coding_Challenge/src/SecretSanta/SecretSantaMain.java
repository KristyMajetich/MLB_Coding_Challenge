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
	 *	- names cannot be an empty string
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
		testInput(new String[]{"1","2","3","4","5","6","7","8","9","10",
							   "11","12","13","14","15","16","17","18","19","20",
							   "21","22","23","24","25","26","27","28","29","30",
							   "31","32","33","34","35","36","37","38","39","40",
						   	   "41","42","43","44","45","46","47","48","49","50",
							   "51","52","53","54","55","56","57","58","59","60",
							   "61","62","63","64","65","66","67","68","69","70",
							   "71","72","73","74","75","76","77","78","79","80",
							   "81","82","83","84","85","86","87","88","89","90",
							   "91","92","93","94","95","96","97","98","99","100"});
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

}
