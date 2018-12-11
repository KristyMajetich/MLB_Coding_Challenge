package SecretSanta;

public class Participant 
{
	private String name; 
	private Participant recipient;
	public Participant(String name) 
	{
		this.name = name;
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

}
