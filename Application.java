/**
 * This class is the application for the text-based game
 * @author Kirin Sharma
 * @version 1.0
 * CS 131 Final Project
 *
 */

import java.util.Scanner;


public class Application {

	static Scanner scan = new Scanner(System.in);
	public static void main(String args[])
	{
		// Introduction text
		System.out.print("\nWelcome to the realm of Fritjof!"
				+ "\nFritjof has kidnapped your princess, and your task here is to"
				+ "\nlocate and free her by any means necessary."
				+ "\nBut before we begin on this quest, what should we call you? ");
		
		// Get name of the player
		String name;
		while (true)
		{
			try 
			{
				name = scan.nextLine().strip();
				if (name.length() >= 1)
					break;
				System.out.print("\nYour name must be at least 1 character!"
						+ "\nWhat would you like to be called? ");
			}
			catch (Exception e)
			{
				System.out.print("\nSomething went wrong! What would you like to be called? ");
			}
			
		}
		
		// Create game object and print more introduction text
		Game myGame = new Game(name);
		
		System.out.println("\nHello, " + myGame.playerName + "!");
		System.out.println("\nHere are some instructions to get you started: ");
		myGame.printTutorial();
		System.out.println("Let's get to work!");
		
		// Game loop
		while (!myGame.hasFinishedGame())
		{
			// Check if the movement was successful and determine gameplay based on that
			boolean hasMoved = myGame.travel(scan);
			if (myGame.checkIfInRoom() && hasMoved)
			{
				String currentRoomName = myGame.getRoomName();
				
				if (currentRoomName.equals("Castle"))
				{
					myGame.castleGameplay();
				}
				else if (currentRoomName.equals("Chest"))
				{
					myGame.chestGameplay(scan);
					
				}
				else if (currentRoomName.equals("Dragon Cave"))
				{
					myGame.caveGameplay(scan);
				}
				else if (currentRoomName.equals("Shack"))
				{
					myGame.shackGameplay(scan);
				}	
			}
			else if (!hasMoved)
			{
				System.out.println("\nOops, you can't go that way.");
			}
			else
			{
				System.out.println("\nYou don't see anything here. Keep moving!");
			}
		} // end while
		
		// Print congratulations, end of game
		System.out.println("\nCongratulations, " + myGame.playerName + "!");
		System.out.println("\nYou have saved the princess!"
				+ "\nYour name will now be known across the lands for your heroism!");
		
		return;
		
	} // end main()
	
} // end class
