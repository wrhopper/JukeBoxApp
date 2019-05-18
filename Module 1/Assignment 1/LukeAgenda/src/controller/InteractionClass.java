package controller;

import java.util.Scanner;

import model.Agenda;
import model.Friend;

//README: Read the code and address the questions presented with it. These are the questions you are asked to answer for the activity.

/**
 * Class in charge of the user's interaction. For this example, interaction will occur through the console/terminal
 * @author Pedro Feijoo
 */
public class InteractionClass 
{
	//README: Q1 - What is the meaning of the reserved word static?
	//README: Q2 - What is the method is void?
	//README: Q3 - What does it mean that the method is public?
	//README: Q4 - Do we need to create an instance of the class InteractionClass, to call and use static methods?
	/**
	 * The main method is the one that is called when you run the Program
	 * @param args input arguments passed by the Operating System, interpreted by the Java Virtual Machine (JVM)
	 */
	public static void main(String[] args) 
	{
		Agenda agenda = new Agenda();
		
		//README: Q5 - Which is the reason of using an object of the class Scanner?
		Scanner scanner = new Scanner(System.in);
		boolean stopApplication = false;
		
		//README: Q6 - What is the while instruction?
		//README: Q7 - How is it used for here?
		while(stopApplication == false)
		{
			//README: Q8 - Please explain what we are with System.out.println
			System.out.println("Welcome Luke to your Agenda!");
			System.out.println("Please select one of the following actions:");
			System.out.println("Add a new Friend [Press 1]");
			System.out.println("Search for a Friend [Press 2]");
			System.out.println("Get a list of your Friends' names and phone numbers [Press 3]");
			System.out.println("Exit the App [Press 4]");
			
			//README: Q9 - Please explain what we are doing with scanner.nextLine()
			String line = scanner.nextLine();
			//README: Q10 - What are we doing here? What is Integer?
			int response = Integer.parseInt(line);
			
			//README: Please explain and elaborate the elements of the conditional cascade
			if(response == 1)
			{
				System.out.println("Please enter your friend's name:");
				String name = scanner.nextLine();
				System.out.println("Please enter your friend's address:");
				String address = scanner.nextLine();
				System.out.println("Please enter your friend's phone number:");
				String txtPhoneNumber = scanner.nextLine();
				int phoneNumber = Integer.parseInt(txtPhoneNumber);
				
				//README: Q12 - What are we doing in the next two lines of code?
				Friend inputFriend = new Friend(name, address, phoneNumber);
				boolean wasCreated = agenda.addNewFriend(inputFriend);
				
				//README: Q13 - What are we validating here?
				if(wasCreated == true)
				{
					System.out.println("Your Friend was added successfully to the Agenda!");
				}
				
				else
				{
					System.out.println("You already have a Friend with that name!");
					System.out.println("Try adding another one ;)");
				}
				
			}
			
			//README: Please explain and elaborate the elements of the conditional cascade
			else if(response == 2)
			{
				System.out.println("Input the name of your Friend:");
				String name = scanner.nextLine();
				
				//README: Q14 - What are we doing here?
				Friend searchedFriend = agenda.searchFriendByName(name);
				
				//README: Q15 - What are we validating here?
				if(searchedFriend != null)
				{
					//README: Q16 - What is \n?
					//README: Q17 - What is \t?
					//README: Q18 - How is this String built?
					String responseToDisplay = "Friend found:\n" 
					+"\t-Name: " + searchedFriend.getName() +"\n"
					+ "\t-Address: " + searchedFriend.getName() +"\n"
					+ "\t-Address: " + searchedFriend.getName();
				}
				
				else
				{
					System.out.println("There is no Friend named " + name);
				}
			}
			
			//README: Please explain and elaborate the elements of the conditional cascade
			else if(response == 3)
			{
				String listToDisplay = agenda.getListOfFriends();
				
				if(listToDisplay.isEmpty())
				{
					System.out.println("There are no friends to display yet.");
				}
				
				else
				{
					System.out.println("List of friends:");
					System.out.println(agenda.getListOfFriends());
				}
			}
			
			//README: Please explain and elaborate the elements of the conditional cascade
			else if(response == 4)
			{
				//README: Q20 - Explain the next two lines of code. Why do we close the scanner?
				stopApplication = true;
				scanner.close();
			}
			
			//README: Explain the next lines of code and how they guarantee user's interaction
			System.out.println("Would you like to keep using this App? [Please type: Yes/No]");
			
			String responseToContinue = scanner.nextLine();
			
			if(responseToContinue.equalsIgnoreCase("Yes"))
			{
				//We do nothing
			}
			else
			{
				stopApplication = true;
				scanner.close();
			}
			
		}
		
	}
}
