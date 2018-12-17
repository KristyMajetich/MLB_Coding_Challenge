package SecretSanta;

public class Participant 
{
	private String name; 
	private Participant recipient;
	private String[] previousRecipients;
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

}
