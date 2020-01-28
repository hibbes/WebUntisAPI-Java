package de.airdevelopments.webuntisapi;

public class Test {

	public static void main(String[] args) {
		
		ApplicableWebUntisConnection connection = new ApplicableWebUntisConnection("schiller-gym", "neilo", "user", "password");
		
		try
		{
			if(connection.login())
				System.out.println("Login Successful");

			connection.getSubstitutions("20190101", "20191230");
			
			connection.logout();
		}catch(WebUntisConnectionErrorException e)
		{
			e.printStackTrace();
			System.out.println(e.getError());
		}
	}

}
