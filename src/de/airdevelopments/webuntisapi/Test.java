package de.airdevelopments.webuntisapi;


import java.io.IOException;

public class Test {

	
	
	public static void main(String[] args) throws IOException {
		
		ApplicableWebUntisConnection connection = new ApplicableWebUntisConnection("schiller-gym", "neilo", "cze", "b28ajt*");
		
		try
		{
			if(connection.login())
				System.out.println("Login Successful");

			connection.getSubstitutions("20200116", "20200117");
			
			connection.logout();
		}catch(WebUntisConnectionErrorException e)
		{
			e.printStackTrace();
			System.out.println(e.getError());
		}
		
	}

}
