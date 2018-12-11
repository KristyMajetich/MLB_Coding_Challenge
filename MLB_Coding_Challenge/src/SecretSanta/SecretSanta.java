package SecretSanta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SecretSanta 
{
		
	public SecretSanta(String[] names)
	{
		//TODO find a way to check names array for duplicate entries
		
		if(names.length > 1) //Need more than one person for a secret santa
		{
			ArrayList<Participant> participants = new ArrayList<Participant>();

			for (int i = 0; i < names.length; i++)
			{
				participants.add(i, new Participant(names[i]));
			}

			drawNames(participants);

			System.out.println(toString(participants));
		}
		else
		{
			System.out.println("Invalid input");
		}
	}

	public void drawNames(ArrayList<Participant> participants) 
	{
		ArrayList<Participant> receivers = (ArrayList<Participant>) participants.clone();
		
		do
		{
			//shuffle the list and draw names at least once 
			//do it again if the outcome is not valid
			//TODO find a more efficient way to accomplish this...
			
			Collections.shuffle(receivers);
			for (int i = 0; i < receivers.size(); i++)
			{
				participants.get(i).setRecipient(receivers.get(i));
			}
		} while (!isValidList(receivers)); 
		
	}
	
	public boolean isValidList(ArrayList<Participant> receivers)
	{
		for (Participant p : receivers)
		{
			//cycle through the list, check to see if anyone has selected them self 
			//if so, return false to shuffle again
			if (p.getName().equals(p.getRecipient().getName()))
			{				
				return false;
			}
		}
		return true;
	}

	public String toString(ArrayList<Participant> participants)
	{
		String s = "Secret Santa:\n";
		
		for (Participant p : participants)
		{
			s += p.getName() + " > " + p.getRecipient().getName() + "\n";
		}
		
		return s;
	}
	
}
