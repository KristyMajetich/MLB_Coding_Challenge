package SecretSanta;

import java.util.Arrays;
import java.util.Random;

public class SecretSanta 
{
		
	public SecretSanta(String[] names)
	{
		
		if(names.length > 1)
		{
			Participant[] participants = new Participant[names.length];

			for (int i = 0; i < names.length; i++)
			{
				participants[i] = new Participant(names[i]);
			}

			drawNames(participants);

			System.out.println(toString(participants));
		}
		else
			System.out.println("Invalid input");
	}

	public void drawNames(Participant[] buyers) 
	{
		Participant[] receivers;
		
		do
		{
			receivers = shuffleNames(Arrays.copyOf(buyers, buyers.length));
			for (int i = 0; i < buyers.length; i++)
			{
				buyers[i].setRecipient(receivers[i]);
			}
		} while (!isValidList(receivers));
		
	}
	
	public Participant[] shuffleNames(Participant[] array)
	{
		int index;
		Participant temp; 
		Random gen = new Random();
		
		for(int i = 0; i < array.length; i++)
		{
			index = gen.nextInt(array.length);
	        temp = array[index];
	        array[index] = array[i];
	        array[i] = temp;
		}
		
		return array; 
	}
	
	public boolean isValidList(Participant[] participants)
	{
		for (Participant p : participants)
		{
			if (p.getName().equals(p.getRecipient().getName()))
			{				
				return false;
			}
		}
		return true;
	}

	public String toString(Participant[] participants)
	{
		String s = "Secret Santa:\n";
		
		for (Participant p : participants)
		{
			s += p.getName() + " > " + p.getRecipient().getName() + "\n";
		}
		
		return s;
	}
	
}
