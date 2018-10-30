package straight;


import java.util.Scanner;

public class mainProgram {
	
	player player1Name = new player();
	player player2Name = new player();
	
	static int player1Score;
	static int player2Score;
	static int currentBalls;
	static int previousBalls = 15;
	public static void main(String[] args) {
		System.out.println("Player 1, what is your name?");
		Scanner player1 = new Scanner(System.in);
		String player1Name = player1.next();
		System.out.println("Welcome, " + player1Name + "!");
		
		
		System.out.println("Player 2, what is your name?");
		Scanner player2 = new Scanner(System.in);		
		String player2Name = player2.next();
		System.out.println("Welcome, " + player2Name + "!");
		
		
		System.out.println("Who starts?");
		Scanner robot = new Scanner(System.in);
		String playerToStart = robot.next();
		
		System.out.println("What Race-To would you like to have set for the game?");
		int raceTo = robot.nextInt();
		
		String activePlayer = "";	
		if (playerToStart == player1Name) {activePlayer = player1Name;}
		else {activePlayer = player2Name;}
		
		
		while (player1Score < raceTo && player2Score < raceTo) 

			
			
		{
			if (activePlayer == player1Name) {
				
															//PLAYER 1 TURN
											
			
		System.out.println(player1Name + ", it's your turn.");
		

		
		
		System.out.println("Hello, " + player1Name + ", first: How many balls are left on the table?");
		currentBalls = robot.nextInt();
		player1Score = player1Score + player.getPoints(currentBalls, previousBalls);
		previousBalls = currentBalls;
		System.out.println("Your current score is: " + player1Score + "! Did you get any fouls? 'n' for no, 'y' for yes");
		
				
		

		
		
		
			char ifFoul1 = robot.next().charAt(0);
			if (ifFoul1 == 'n') {
				System.out.println("Nice!");				
			}

			else if (ifFoul1 == 'y') {
				System.out.println("Not so good.. what kind of foul? '1' for a normal foul, '2' for a foul at break and '14' for a special case");
				player1Score = player1Score - player.foul(robot.nextInt());
				System.out.println("Ok, your score is " + player1Score + " now.");									
				
				
				
			}
			
			if(currentBalls == 1) {
				currentBalls = 15;
				previousBalls = 15;
				System.out.println("New rack, current balls on table: 15");
			}
		
			else if (currentBalls == 0) {
				currentBalls = 15;
				previousBalls = 15;
				System.out.println("You cleared the table! New rack, current balls on table: 15");
			}
			else {
				System.out.println("You missed. There is " + currentBalls + " left on the table.");
				activePlayer = player2Name;
			}
		
		}	
		
		
		
		
		
		
		else if (activePlayer == player2Name) {
		
		System.out.println(player2Name + ", it's your turn.");
		
		
			
		
		System.out.println("Hello, " + player2Name + ", first: How many balls are left on the table?");
		currentBalls = robot.nextInt();
		player2Score = player2Score + player.getPoints(currentBalls, previousBalls);
		previousBalls = currentBalls;
		System.out.println("Your current score is: " + player2Score + "! Did you get any fouls? 'n' for no, 'y' for yes");
				
			
			char ifFoul2 = robot.next().charAt(0);
			if (ifFoul2 == 'n') {
					System.out.println("Nice!");				
			}

			else if (ifFoul2 == 'y') {
				System.out.println("Not so good.. what kind of foul? '1' for a normal foul, '2' for a foul at break and '14' for a special case");
				player2Score = player2Score - player.foul(robot.nextInt());
				System.out.println("Ok, your score is " + player2Score + " now.");									
					
					
					
			}		
		
			
			
			if(currentBalls == 1) {
				currentBalls = 15;
				previousBalls = 15;
				System.out.println("New rack, current balls on table: 15");
			}
		
			else if (currentBalls == 0) {
				currentBalls = 15;
				previousBalls = 15;
				System.out.println("You cleared the table! New rack, current balls on table: 15");
			}
			
			else {
				System.out.println("You missed. There is " + currentBalls + " left on the table.");
				activePlayer = player1Name;
			}
		
			
		
			}
			
			
			
		}
		
		
		
		
		if(player1Score < player2Score) {
			System.out.println("Congrats," + player2Name + ", you WON!!");
		}
		else {
			System.out.println("Congrats," + player1Name + ", you WON!!");
		}
		
		
	}
		
		
		
	}

		
		
		
		
		
		
		
		
		
	

