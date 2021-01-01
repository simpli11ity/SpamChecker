import java.net.*;

public class SpamCheck
{
	public static void main(String[] args) throws Exception
	{
		String IP = args[0];
		String[] parts = IP.split("\\.");
		String website = ".sbl.spamhaus.org";
		String query;
		String Conc = parts[3] + "." + parts[2] + "." + parts[1] + "." + parts[0];
		try
		{
			query = Conc + website;
			InetAddress.getByName(query);
			System.out.println(IP + " is a known spammer.");
		}
		catch (Exception e)
		{
			System.out.println(IP + " appears legitimate");
		}
	}
}
 

