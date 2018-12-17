package SecretSanta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SecretSanta 
{
		
	public SecretSanta(String path)
	{
		//TODO find a way to check names array for duplicate entries
		//TODO how to consume previous years... 2d array? read from a text file?
		
		/*		
		 * BUYER=buyer
		 * previousReceivers=previousName1 previousName2 previousName3
		 */
		final String BUYERID = "BUYER=";
		final String PREVREC = "PREV=";
						
		ArrayList<Participant> participants;
		BufferedReader br;
		
		try {
			participants = new ArrayList<Participant>();
			
			br = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+path)));
			
			String s;
			int i = 0;
			
			while ((s = br.readLine()) != null)
			{
				if(s.contains(BUYERID))
				{
					participants.add(i, new Participant(s.substring(BUYERID.length())));
				}
				else if (s.contains(PREVREC))
				{
					participants.get(i).setPreviousRecipients(s.substring(PREVREC.length()).split(" "));
				}
				else if (s.equals("\n"))
				{
					i++;
				}
				
			}
			
			if(participants.size() > 1) //Need more than one person for a secret Santa?
			{

				drawNames(participants);

				System.out.println(toString(participants));
			}
			else
			{
				System.out.println("Not enough participants");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public void drawNames(ArrayList<Participant> participants) 
	{
		ArrayList<Participant> receivers = (ArrayList<Participant>) participants.clone();
		
		do
		{
			//shuffle the list and draw names at least once 
			//do it again if the outcome is not valid
			//TODO find a more efficient way to reshuffle? maybe shift the rest of the array 1 spot?
			
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
			for (String s : p.getPreviousRecipients())
			{
				if (p.getName().equals(s))
				{
					return false;
				}
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
