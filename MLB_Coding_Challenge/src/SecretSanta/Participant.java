package SecretSanta;

public class Participant 
{
	private String name; 
	private Participant recipient;
	private String[] previousRecipients;
	private String[] familyMembers;
	public Participant(String name) 
	{
		this.name = name;
		previousRecipients = new String[3];
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setRecipient(Participant recipient)
	{
		this.recipient = recipient;
	}
	
	public Participant getRecipient()
	{
		return recipient;
	}
	
	public void setPreviousRecipients(String[] previousRecipients)
	{
		this.previousRecipients = previousRecipients;
	}
	
	public String[] getPreviousRecipients()
	{
		return previousRecipients;
	}

	public void setFamilyMembers(String[] familyMembers) 
	{
		this.familyMembers = familyMembers;
	}
	
	public String[] getFamilyMembers()
	{
		return familyMembers;
	}
}
