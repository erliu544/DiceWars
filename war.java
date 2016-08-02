import java.util.Scanner;
import java.lang.Math;

public class war {
	static Scanner in = new Scanner(System.in);
	static int numberOfPlayers;
	
	public static void menu(){
		System.out.println("Please choose option 1, 2, or 3: ");
		System.out.println("1. Battle");
		System.out.println("2. Check your own score.");
		System.out.println("3. I surrender!");
		System.out.println("4. Check Game Rules.");
	}
	
	public static void gameInfo(){
		System.out.println("The name of the game is Dice Wars.");
		System.out.println("Each player starts with 0 points.");
		System.out.println("Each player takes turn rolling the die.");
		System.out.println("The player that rolls the highest number gets that number added to their points total.");
		System.out.println("If there is a tie roll in any of the rounds, then there is a re-roll and the winner gets "
				+ "2 times their roll amount for points.");
		System.out.println("If they tie the second time, then no one gets points.");
		System.out.println("The players will continue to roll until one or more have the point total of exactly 50 points.");
		System.out.println("If a player hits exactly 50, game immediately ends and that player wins!");
		System.out.println("If both players reach 50 at the same time, then a final roll will decide the winner.");
		System.out.println("Good luck!");
		System.out.println("");
	}
	
	
	public static void checkEveryoneScore1(Player player1, Player player2){
		if(player1.score != -1)	
		System.out.println(player1.name+" has a score total of " + player1.getScore());
		if(player2.score != -1)	
		System.out.println(player2.name+" has a score total of " + player2.getScore());

	}
	
	public static void checkEveryoneScore2(Player player1, Player player2, Player player3){
		if(player1.score != -1)	
		System.out.println(player1.name+" has a score total of " + player1.getScore());
		if(player2.score != -1)	
		System.out.println(player2.name+" has a score total of " + player2.getScore());
		if(player3.score != -1)	
		System.out.println(player3.name+" has a score total of " + player3.getScore());

	}
	
	public static void checkEveryoneScore3(Player player1, Player player2, Player player3, Player player4){
		if(player1.score != -1)	
		System.out.println(player1.name+" has a score total of " + player1.getScore());
		if(player2.score != -1)	
		System.out.println(player2.name+" has a score total of " + player2.getScore());
		if(player3.score != -1)	
		System.out.println(player3.name+" has a score total of " + player3.getScore());
		if(player4.score != -1)	
		System.out.println(player4.name+" has a score total of " + player4.getScore());
	}
	
	public static void checkEveryoneScore4(Player player1, Player player2, Player player3, Player player4, Player player5){
		if(player1.score != -1)	
		System.out.println(player1.name+" has a score total of " + player1.getScore());
		if(player2.score != -1)	
		System.out.println(player2.name+" has a score total of " + player2.getScore());
		if(player3.score != -1)	
		System.out.println(player3.name+" has a score total of " + player3.getScore());
		if(player4.score != -1)	
		System.out.println(player4.name+" has a score total of " + player4.getScore());
		if(player5.score != -1)	
		System.out.println(player5.name+" has a score total of " + player5.getScore());
	
	}
	public static void checkEveryoneScore5(Player player1, Player player2, Player player3, Player player4, Player player5, Player player6){
		if(player1.score != -1)	
		System.out.println(player1.name+" has a score total of " + player1.getScore());
		if(player2.score != -1)	
		System.out.println(player2.name+" has a score total of " + player2.getScore());
		if(player3.score != -1)	
		System.out.println(player3.name+" has a score total of " + player3.getScore());
		if(player4.score != -1)	
		System.out.println(player4.name+" has a score total of " + player4.getScore());
		if(player5.score != -1)	
		System.out.println(player5.name+" has a score total of " + player5.getScore());
		if(player6.score != -1)
		System.out.println(player6.name+" has a score total of " + player6.getScore());

	}

	
	public static int getMenuChoice() {
		System.out.print("---> ");
		while(! in.hasNextInt() )
			{
				in.nextLine();
				System.out.print("---> ");
			}
			
			int menuChoice = in.nextInt();
			
			return menuChoice;
		}
	
	public static int numberOfPlayersEntry(){
		System.out.println("How many players are there? (Please enter 2 to 6)");
				
		numberOfPlayers = getMenuChoice();
				
				
		if(numberOfPlayers<2 || numberOfPlayers>6){
			System.out.println("Ineligible number of players, please enter 2-6.");
			numberOfPlayersEntry();
		}
		
		if(numberOfPlayers==2)
			System.out.println("2 Players are playing.");
	
		if(numberOfPlayers==3)
			System.out.println("3 Players are playing.");
			
		if(numberOfPlayers==4)
			System.out.println("4 Players are playing.");	

		if(numberOfPlayers==5)
			System.out.println("5 Players are playing.");	
		
		if(numberOfPlayers==6)	
			System.out.println("6 Players are playing.");	
	
		return numberOfPlayers;	
		
	}
	public static void main(String[] args) {
		gameInfo();
		Scanner cin = new Scanner(System.in);
		int scoreToWin = 50;
		
		String name1, name2,name3,name4,name5,name6;
		
		Player player3 = new Player();	
		Player player4 = new Player();	
		Player player5 = new Player();	
		Player player6 = new Player();
		Player player2 = new Player();
		Player player1 = new Player();
		
		
		
		
		//Test Setup Code is below, delete in actual submission--------------------------------------------------
		player1.score=40;
		player2.score=40;
		player3.score=40;
		player4.score=40;
		player5.score=40;
		player6.score=40;	
		//---------------------------------------------------------------------
		
		
		int numberOfPlayers = numberOfPlayersEntry();
		
		
		System.out.println("Enter Player 1's name:");
		name1 = cin.nextLine();
		player1.name = name1;
		
		
		System.out.println("Enter Player 2's name:");
		name2 = cin.nextLine();
		player2.name = name2;
		
		if(numberOfPlayers>=3){
			System.out.println("Enter Player 3's name:");
			name3 = cin.nextLine();
			player3.name = name3;
		}
		if(numberOfPlayers>=4){
			System.out.println("Enter Player 4's name:");
			name4 = cin.nextLine();
			player4.name = name4;
		}
		if(numberOfPlayers>=5){
			System.out.println("Enter Player 5's name:");
			name5 = cin.nextLine();
			player5.name = name5;
			
		}
		if(numberOfPlayers>=6){
			System.out.println("Enter Player 6's name:");
			name6 = cin.nextLine();
			player6.name = name6;
		}
		
		System.out.println("Go!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		int gameover = 0;
		while(gameover==0){
			int memory1, memory2, memory3, memory4, memory5, memory6;
			
			memory1 = player1.score;
			memory2 = player2.score;
			memory3 = player3.score;
			memory4 = player4.score;
			memory5 = player5.score;
			memory6 = player6.score;
			
			if(player1.score != -1){
				Move(player1);
				//if(player1.rollhold + player1.score == scoreToWin){
				//	win(player1);
				//	return;
				//}
			}

			if(player2.score != -1)	{
				Move(player2);	
				//if(player2.rollhold + player2.score == scoreToWin){
				//	win(player2);
				//	return;
				//}
			}
			
			if(numberOfPlayers>=3){
				if(player3.score != -1)	{
					Move(player3);
				//	if(player3.rollhold + player3.score == scoreToWin){
				//		win(player3);
				//		return;
				//	}
				}
			}
			if(numberOfPlayers>=4){
				if(player4.score != -1)	{
					Move(player4);	
					//if(player4.rollhold + player4.score == scoreToWin){
					//	win(player4);
					//	return; 
					//}
				}
				
			
			}			
			if(numberOfPlayers>=5){
				if(player5.score != -1)	{
					Move(player5);
					//if(player5.rollhold + player5.score == scoreToWin){
					//	win(player5);
					//	return; 
					//}
				}
				
			
			}
			if(numberOfPlayers>=6){
				if(player6.score != -1)	{
					Move(player6);
					//if(player6.rollhold + player6.score == scoreToWin){
					//	win(player6);
					//	return; 
					//}
				}
		
			}
			
			int winnerCounter;
			winnerCounter = 0;
			
			if(numberOfPlayers==2){
				int hold1 = Math.max(player1.rollhold,player2.rollhold);
				
				if(hold1 == player1.rollhold)
					winnerCounter++; 
				if(hold1 == player2.rollhold)
					winnerCounter++; 
				
				if(winnerCounter==1){		//finish copying this code to other in program
					System.out.println("We have a single winner for this round!");
					if(hold1 == player1.rollhold){
						System.out.println(player1.name + " wins this round!");
						player1.score += player1.rollhold;
					}
					if(hold1 == player2.rollhold){
						System.out.println(player2.name + " wins this round!");
						player2.score += player2.rollhold;
					}
				}
				
				if(winnerCounter>1){		//TIE
					System.out.println("We have a tie for this round!");
					System.out.println("");


					if(hold1 != player1.rollhold){
						player1.rollhold=0;
					}
					if(hold1 != player2.rollhold){
						player2.rollhold=0;
					}
					if(hold1 == player1.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player1);
					}
					if(hold1 == player2.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player2);
					}
					

					
					
					hold1 = Math.max(player1.rollhold,player2.rollhold);
					winnerCounter = 0;
					if(hold1 == player1.rollhold)
						winnerCounter++; 
					if(hold1 == player2.rollhold)
						winnerCounter++; 
					
					if(winnerCounter==1){		//finish copying this code to other in program
						System.out.println("We have a single winner for the tie-breaking round!");
						if(hold1 == player1.rollhold){
							System.out.println(player1.name + " wins this round! Double the points!");
							player1.score += (player1.rollhold * 2);
						}
						if(hold1 == player2.rollhold){
							System.out.println(player2.name + " wins this round! Double the points!");
							player2.score += (player2.rollhold * 2);
						}
					}
					
					if(winnerCounter>1){		//second tie
						System.out.println("Boo hoo! Another Tie! No one gets points! :(");
					}
	
				}
				
				
				
			}
				
			if(numberOfPlayers==3){
				Math.max(player1.rollhold,player2.rollhold);
				int hold1 = Math.max(player1.rollhold,player2.rollhold);
				int hold2 = Math.max(player3.rollhold,hold1);
				
				if(hold2 == player1.rollhold)
					winnerCounter++; 
				if(hold2 == player2.rollhold)
					winnerCounter++; 
				if(hold2 == player3.rollhold)
					winnerCounter++; 
				
				if(winnerCounter==1){		//finish copying this code to other in program
					System.out.println("We have a single winner for this round!");
					
					if(hold2 == player1.rollhold){
						System.out.println(player1.name + " wins this round!");
						player1.score += player1.rollhold;
					}
					if(hold2 == player2.rollhold){
						System.out.println(player2.name + " wins this round!");
						player2.score += player2.rollhold;
					}
					if(hold2 == player3.rollhold){
						System.out.println(player3.name + " wins this round!");
						player3.score += player3.rollhold;
					}
				}
				
				
				
				
				
				
				
				if(winnerCounter>1){		//TIE
					System.out.println("We have a tie for this round!");
					System.out.println("");
					if(hold2 != player1.rollhold){
						player1.rollhold=0;
					}
					if(hold2 != player2.rollhold){
						player2.rollhold=0;
					}
					if(hold2 != player3.rollhold){
						player3.rollhold=0;
					}

					
					if(hold2 == player1.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player1);
					}
					if(hold2 == player2.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player2);
					}
					if(hold2 == player3.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player3);
					}

					
					hold1 = Math.max(player1.rollhold,player2.rollhold);
					hold2 = Math.max(player3.rollhold,hold1);
					winnerCounter = 0;
					
					if(hold2 == player1.rollhold)
						winnerCounter++; 
					if(hold2 == player2.rollhold)
						winnerCounter++; 
					if(hold2 == player3.rollhold)
						winnerCounter++; 
					
					if(winnerCounter==1){		//finish copying this code to other in program
						System.out.println("We have a single winner for the tie-breaking round!");
						if(hold2 == player1.rollhold){
							System.out.println(player1.name + " wins this round! Double the points!");
							player1.score += (player1.rollhold * 2);
						}
						if(hold2 == player2.rollhold){
							System.out.println(player2.name + " wins this round! Double the points!");
							player2.score += (player2.rollhold * 2);
						}
						if(hold2 == player3.rollhold){
							System.out.println(player3.name + " wins this round! Double the points!");
							player3.score += (player3.rollhold * 2);
						}
					}
					
					if(winnerCounter>1){		//second tie
						System.out.println("Boo hoo! Another Tie! No one gets points! :(");
					}
	
				}
				
				
				
				
				
				
				
				
				
				
			
			}
			if(numberOfPlayers==4){
				int hold1 = Math.max(player1.rollhold,player2.rollhold);
				int hold2 = Math.max(player3.rollhold,hold1);
				int hold3 = Math.max(player4.rollhold,hold2);
				
				if(hold3 == player1.rollhold)
					winnerCounter++; 
				if(hold3 == player2.rollhold)
					winnerCounter++; 
				if(hold3 == player3.rollhold)
					winnerCounter++; 
				if(hold3 == player4.rollhold)
					winnerCounter++; 
				
				if(winnerCounter==1){		//finish copying this code to other in program
					System.out.println("We have a single winner for this round!");
					
					if(hold3 == player1.rollhold){
						System.out.println(player1.name + " wins this round!");
						player1.score += player1.rollhold;
					}
					if(hold3 == player2.rollhold){
						System.out.println(player2.name + " wins this round!");
						player2.score += player2.rollhold;
					}
					if(hold3 == player3.rollhold){
						System.out.println(player3.name + " wins this round!");
						player3.score += player3.rollhold;
					}
					if(hold3 == player4.rollhold){
						System.out.println(player4.name + " wins this round!");
						player4.score += player4.rollhold;
					}
				}
				
				
				
				
				
				
				if(winnerCounter>1){		//TIE
					System.out.println("We have a tie for this round!");
					System.out.println("");
					
					if(hold3 != player1.rollhold){
						player1.rollhold=0;
					}
					if(hold3 != player2.rollhold){
						player2.rollhold=0;
					}
					if(hold3 != player3.rollhold){
						player3.rollhold=0;
					}
					if(hold3 != player4.rollhold){
						player4.rollhold=0;
					}				
					
					if(hold3 == player1.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player1);
					}

					if(hold3 == player2.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player2);
					}

					if(hold3 == player3.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player3);
					}

					if(hold3 == player4.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player4);
					}
					
					

					
					
					hold1 = Math.max(player1.rollhold,player2.rollhold);
					hold2 = Math.max(player3.rollhold,hold1);
					hold3 = Math.max(player4.rollhold,hold2);
					winnerCounter = 0;
					
					if(hold3 == player1.rollhold)
						winnerCounter++; 
					if(hold3 == player2.rollhold)
						winnerCounter++; 
					if(hold3 == player3.rollhold)
						winnerCounter++; 
					if(hold3 == player4.rollhold)
						winnerCounter++; 
					
					if(winnerCounter==1){	
						System.out.println("We have a single winner for the tie-breaking round!");
						if(hold3 == player1.rollhold){
							System.out.println(player1.name + " wins this round! Double the points!");
							player1.score += (player1.rollhold * 2);
						}
						if(hold3 == player2.rollhold){
							System.out.println(player2.name + " wins this round! Double the points!");
							player2.score += (player2.rollhold * 2);
						}
						if(hold3 == player3.rollhold){
							System.out.println(player3.name + " wins this round! Double the points!");
							player3.score += (player3.rollhold * 2);
						}
						if(hold3 == player4.rollhold){
							System.out.println(player4.name + " wins this round! Double the points!");
							player4.score += (player4.rollhold * 2);
						}
					}
					
					if(winnerCounter>1){		//second tie
						System.out.println("Boo hoo! Another Tie! No one gets points! :(");
					}
	
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}			
			if(numberOfPlayers==5){
				int hold1 = Math.max(player1.rollhold,player2.rollhold);
				int hold2 = Math.max(player3.rollhold,hold1);
				int hold3 = Math.max(player4.rollhold,hold2);
				int hold4 = Math.max(player5.rollhold,hold3);
				
				if(hold4 == player1.rollhold)
					winnerCounter++; 
				if(hold4 == player2.rollhold)
					winnerCounter++; 
				if(hold4 == player3.rollhold)
					winnerCounter++; 
				if(hold4 == player4.rollhold)
					winnerCounter++; 
				if(hold4 == player5.rollhold)
					winnerCounter++; 
				
				if(winnerCounter==1){		//finish copying this code to other in program
					System.out.println("We have a single winner for this round!");
					
					if(hold4 == player1.rollhold){
						System.out.println(player1.name + " wins this round!");
						player1.score += player1.rollhold;
					}
					if(hold4 == player2.rollhold){
						System.out.println(player2.name + " wins this round!");
						player2.score += player2.rollhold;
					}
					if(hold4 == player3.rollhold){
						System.out.println(player3.name + " wins this round!");
						player3.score += player3.rollhold;
					}
					if(hold4 == player4.rollhold){
						System.out.println(player4.name + " wins this round!");
						player4.score += player4.rollhold;
					}
					
					if(hold4 == player5.rollhold){
						System.out.println(player5.name + " wins this round!");
						player5.score += player5.rollhold;
					}
					
					
				}
				
				
				
				
				
				
				if(winnerCounter>1){		//TIE
					System.out.println("We have a tie for this round!");
					System.out.println("");
					
					if(hold4 != player1.rollhold){
						player1.rollhold=0;
					}
					if(hold4 != player2.rollhold){
						player2.rollhold=0;
					}
					if(hold4 != player3.rollhold){
						player3.rollhold=0;
					}
					if(hold4 != player4.rollhold){
						player4.rollhold=0;
					}
					if(hold4 != player5.rollhold){
						player5.rollhold=0;
					}
									
					
					if(hold4 == player1.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player1);
					}

					if(hold4 == player2.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player2);
					}

					if(hold4 == player3.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player3);
					}

					if(hold4 == player4.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player4);
					}
					if(hold4 == player5.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player5);
					}
					
					

					
					hold1 = Math.max(player1.rollhold,player2.rollhold);
					hold2 = Math.max(player3.rollhold,hold1);
					hold3 = Math.max(player4.rollhold,hold2);
					hold4 = Math.max(player5.rollhold,hold3);
					winnerCounter = 0;
					
					if(hold4 == player1.rollhold)
						winnerCounter++; 
					if(hold4 == player2.rollhold)
						winnerCounter++; 
					if(hold4 == player3.rollhold)
						winnerCounter++; 
					if(hold4 == player4.rollhold)
						winnerCounter++; 
					if(hold4 == player5.rollhold)
						winnerCounter++; 
					
					if(winnerCounter==1){	
						System.out.println("We have a single winner for the tie-breaking round!");
						if(hold4 == player1.rollhold){
							System.out.println(player1.name + " wins this round! Double the points!");
							player1.score += (player1.rollhold * 2);
						}
						if(hold4 == player2.rollhold){
							System.out.println(player2.name + " wins this round! Double the points!");
							player2.score += (player2.rollhold * 2);
						}
						if(hold4 == player3.rollhold){
							System.out.println(player3.name + " wins this round! Double the points!");
							player3.score += (player3.rollhold * 2);
						}
						if(hold4 == player4.rollhold){
							System.out.println(player4.name + " wins this round! Double the points!");
							player4.score += (player4.rollhold * 2);
						}
						if(hold4 == player5.rollhold){
							System.out.println(player5.name + " wins this round! Double the points!");
							player5.score += (player5.rollhold * 2);
						}
					}
					
					if(winnerCounter>1){		//second tie
						System.out.println("Boo hoo! Another Tie! No one gets points! :(");
					}
	
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
			if(numberOfPlayers==6){
				int hold1 = Math.max(player1.rollhold,player2.rollhold);
				int hold2 = Math.max(player3.rollhold,hold1);
				int hold3 = Math.max(player4.rollhold,hold2);
				int hold4 = Math.max(player5.rollhold,hold3);
				int hold5 = Math.max(player6.rollhold,hold4);
				
				if(hold5 == player1.rollhold)
					winnerCounter++; 
				if(hold5 == player2.rollhold)
					winnerCounter++; 
				if(hold5 == player3.rollhold)
					winnerCounter++; 
				if(hold5 == player4.rollhold)
					winnerCounter++; 
				if(hold5 == player5.rollhold)
					winnerCounter++; 
				if(hold5 == player6.rollhold)
					winnerCounter++; 
				
				if(winnerCounter==1){		//finish copying this code to other in program
					System.out.println("We have a single winner for this round!");
					
					if(hold5 == player1.rollhold){
						System.out.println(player1.name + " wins this round!");
						player1.score += player1.rollhold;
					}
					if(hold5 == player2.rollhold){
						System.out.println(player2.name + " wins this round!");
						player2.score += player2.rollhold;
					}
					if(hold5 == player3.rollhold){
						System.out.println(player3.name + " wins this round!");
						player3.score += player3.rollhold;
					}
					if(hold5 == player4.rollhold){
						System.out.println(player4.name + " wins this round!");
						player4.score += player4.rollhold;
					}
					
					if(hold5 == player5.rollhold){
						System.out.println(player5.name + " wins this round!");
						player5.score += player5.rollhold;
					}
					if(hold5 == player6.rollhold){
						System.out.println(player6.name + " wins this round!");
						player6.score += player6.rollhold;
					}
					
				}
				
				
				if(winnerCounter>1){		//TIE
					System.out.println("We have a tie for this round!");
					System.out.println("");
							
					
					if(hold5 != player1.rollhold){
						player1.rollhold=0;
					}
					if(hold5 != player2.rollhold){
						player2.rollhold=0;
					}
					if(hold5 != player3.rollhold){
						player3.rollhold=0;
					}
					if(hold5 != player4.rollhold){
						player4.rollhold=0;
					}
					if(hold5 != player5.rollhold){
						player5.rollhold=0;
					}
					if(hold5 != player6.rollhold){
						player6.rollhold=0;
					}
					
					
					if(hold5 == player1.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player1);
					}

					if(hold5 == player2.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player2);
					}

					if(hold5 == player3.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player3);
					}

					if(hold5 == player4.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player4);
					}
					if(hold5 == player5.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player5);
					}
					if(hold5 == player6.rollhold){
						System.out.println("This is your tie-breaking move!");					
						Move(player6);
					}
					
					

					
					hold1 = Math.max(player1.rollhold,player2.rollhold);
					hold2 = Math.max(player3.rollhold,hold1);
					hold3 = Math.max(player4.rollhold,hold2);
					hold4 = Math.max(player5.rollhold,hold3);
					hold5 = Math.max(player6.rollhold,hold4);
					winnerCounter = 0;
					
					if(hold5 == player1.rollhold)
						winnerCounter++; 
					if(hold5 == player2.rollhold)
						winnerCounter++; 
					if(hold5 == player3.rollhold)
						winnerCounter++; 
					if(hold5 == player4.rollhold)
						winnerCounter++; 
					if(hold5 == player5.rollhold)
						winnerCounter++; 
					if(hold5 == player6.rollhold)
						winnerCounter++; 
					
					if(winnerCounter==1){	
						System.out.println("We have a single winner for the tie-breaking round!");
						if(hold5 == player1.rollhold){
							System.out.println(player1.name + " wins this round! Double the points!");
							player1.score += (player1.rollhold * 2);
						}
						if(hold5 == player2.rollhold){
							System.out.println(player2.name + " wins this round! Double the points!");
							player2.score += (player2.rollhold * 2);
						}
						if(hold5 == player3.rollhold){
							System.out.println(player3.name + " wins this round! Double the points!");
							player3.score += (player3.rollhold * 2);
						}
						if(hold5 == player4.rollhold){
							System.out.println(player4.name + " wins this round! Double the points!");
							player4.score += (player4.rollhold * 2);
						}
						if(hold5 == player5.rollhold){
							System.out.println(player5.name + " wins this round! Double the points!");
							player5.score += (player5.rollhold * 2);
						}
						if(hold5 == player6.rollhold){
							System.out.println(player6.name + " wins this round! Double the points!");
							player6.score += (player6.rollhold * 2);
						}
					}
					
					if(winnerCounter>1){		//second tie
						System.out.println("Boo hoo! Another Tie! No one gets points! :(");
					}
	
				}
				
				
				
				
			}
			
			
			
			
			
			
			
			
			if(numberOfPlayers==2){
				checkEveryoneScore1( player1,  player2);
			}
			
			System.out.println("It's The End of The Round! Let's See Everyone's Scores!");
			
			if(numberOfPlayers==3){
				checkEveryoneScore2( player1,  player2,  player3);
			}
			if(numberOfPlayers==4){
				checkEveryoneScore3( player1,  player2,  player3,  player4);
			}			
			if(numberOfPlayers==5){
				checkEveryoneScore4( player1,  player2,  player3,  player4, player5);
			}
			if(numberOfPlayers==6){
				checkEveryoneScore5( player1,  player2,  player3,  player4, player5, player6);
			}
			System.out.println("");
			
			int winnercount99=0;
			
			
			
			
			
			
			if(player1.score>=54){
				System.out.println("Sorry " + player1.name + ", you went above 50 points! Your score has been reset to its previous score.");
				player1.score = memory1;
			}
			
			if(player2.score>=54){
				System.out.println("Sorry " + player2.name + ", you went above 50 points! Your score has been reset to its previous score.");
				player2.score = memory2;
			}	
				
			if(numberOfPlayers>=3){
				if(player3.score>=54){
					System.out.println("Sorry " + player3.name + ", you went above 50 points! Your score has been reset to its previous score.");
					player3.score = memory3;
				}
			
			}
			if(numberOfPlayers>=4){
				if(player4.score>=54){
					System.out.println("Sorry " + player4.name + ", you went above 50 points! Your score has been reset to its previous score.");
					player4.score = memory4;
				}
			
			}			
			if(numberOfPlayers>=5){
				if(player5.score>=54){
					System.out.println("Sorry " + player5.name + ", you went above 50 points! Your score has been reset to its previous score.");
					player5.score = memory5;
				}
			
			}
			if(numberOfPlayers>=6){
				if(player6.score>=54){
					System.out.println("Sorry " + player6.name + ", you went above 50 points! Your score has been reset to its previous score.");
					player6.score = memory6;
				}
			}
			
			
			
			
			
			
			
			
			if((player1.score>49)&&(player1.score<54)){
				winnercount99++;
			}
			
			if((player2.score>49)&&(player2.score<54)){
				winnercount99++;
			}	
				
			if(numberOfPlayers>=3){
				if((player3.score>49)&&(player3.score<54)){
					winnercount99++;
				}
			
			}
			if(numberOfPlayers>=4){
				if((player4.score>49)&&(player4.score<54)){
					winnercount99++;
				}
			
			}			
			if(numberOfPlayers>=5){
				if((player5.score>49)&&(player5.score<54)){
					winnercount99++;
				}
			
			}
			if(numberOfPlayers>=6){
				if((player6.score>49)&&(player6.score<54)){
					winnercount99++;
				}
		
			}
			
			
			
			
			
			
			
			
			if(winnercount99 == 1){
				if((player1.score>49)&&(player1.score<54)){
					win(player1);
					gameover = 1;
				}	
				if((player2.score>49)&&(player2.score<54)){
					win(player2);
					gameover = 1;
				}	
				
				if(numberOfPlayers>=3){
					if((player3.score>49)&&(player3.score<54)){
						win(player3);
						gameover = 1;
					}	
				
				}
				if(numberOfPlayers>=4){
					if((player4.score>49)&&(player4.score<54)){
						win(player4);
						gameover = 1;
					}	
				
				}			
				if(numberOfPlayers>=5){
					if((player5.score>49)&&(player5.score<54)){
						win(player5);
						gameover = 1;
					}	
				
				}
				if(numberOfPlayers>=6){
					if((player6.score>49)&&(player6.score<54)){
						win(player6);
						gameover = 1;
					}	
				}	
			}
			
			
			/*
			int hold1 = Math.max(player1.rollhold,player2.rollhold);
			int hold2 = Math.max(player3.rollhold,hold1);
			int hold3 = Math.max(player4.rollhold,hold2);
			int hold4 = Math.max(player5.rollhold,hold3);
			int hold5 = Math.max(player6.rollhold,hold4);
			*/
			
			if(winnercount99 > 1){
				System.out.println("Looks like multiple players achieved 50 points in the same round! Time for a sudden death roll!");
				
				player1.rollhold = 0;
				player2.rollhold = 0;
				player3.rollhold = 0;
				player4.rollhold = 0;
				player5.rollhold = 0;
				player6.rollhold = 0;
				
				
				if((player1.score>49)&&(player1.score<54)){
					System.out.println("This is your final move to try to win the game ending tie breaker!");
					Move(player1);
				}	
				
				if((player2.score>49)&&(player2.score<54)){
					System.out.println("This is your final move to try to win the game ending tie breaker!");
					Move(player2);
				}	
				
				if(numberOfPlayers>=3){
					if((player3.score>49)&&(player3.score<54)){
						System.out.println("This is your final move to try to win the game ending tie breaker!");
						Move(player3);
					}	
				
				}
				if(numberOfPlayers>=4){
					if((player4.score>49)&&(player4.score<54)){
						System.out.println("This is your final move to try to win the game ending tie breaker!");
						Move(player4);
					}	
				
				}			
				if(numberOfPlayers>=5){
					if((player5.score>49)&&(player5.score<54)){
						System.out.println("This is your final move to try to win the game ending tie breaker!");
						Move(player5);
					}	
				
				}
				if(numberOfPlayers>=6){
					if((player6.score>49)&&(player6.score<54)){
						System.out.println("This is your final move to try to win the game ending tie breaker!");
						Move(player6);
					}
				}
				int hold1 = Math.max(player1.rollhold,player2.rollhold);
				int hold2 = 0;
				int hold3 = 0;
				int hold4 = 0;
				int hold5 =0;
				
				if(numberOfPlayers>=3){
					hold2 = Math.max(player3.rollhold,hold1);
				}
				if(numberOfPlayers>=4){
					hold3 = Math.max(player4.rollhold,hold2);
				
				}			
				if(numberOfPlayers>=5){
					hold4 = Math.max(player5.rollhold,hold3);
				
				}
				if(numberOfPlayers>=6){
					hold5 = Math.max(player6.rollhold,hold4);
				}
						
				if(numberOfPlayers==2){
					if(player1.rollhold==hold1)
						System.out.println(player1.name + ", Congratulations! You have won!");
						gameover = 1;
					if(player2.rollhold==hold1)
						System.out.println(player2.name + ", Congratulations! You have won!");
						gameover = 1;
				}
				
				if(numberOfPlayers==3){
					if(player1.rollhold==hold2)
						System.out.println(player1.name + ", Congratulations! You have won!");
						gameover = 1;
					if(player2.rollhold==hold2)
						System.out.println(player2.name + ", Congratulations! You have won!");
						gameover = 1;
					if(player3.rollhold==hold2)
						System.out.println(player3.name + ", Congratulations! You have won!");
						gameover = 1;
				}
				if(numberOfPlayers==4){
					if(player1.rollhold==hold3)
						System.out.println(player1.name + ", Congratulations! You have won!");
						gameover = 1;
					if(player2.rollhold==hold3)
						System.out.println(player2.name + ", Congratulations! You have won!");
						gameover = 1;
					if(player3.rollhold==hold3)
						System.out.println(player3.name + ", Congratulations! You have won!");
						gameover = 1;
					if(player4.rollhold==hold3)
						System.out.println(player4.name + ", Congratulations! You have won!");
						gameover = 1;
				}
				if(numberOfPlayers==5){
					if(player1.rollhold==hold4)
						System.out.println(player1.name + ", Congratulations! You have won!");
						gameover = 1;
					if(player2.rollhold==hold4)
						System.out.println(player2.name + ", Congratulations! You have won!");
						gameover = 1;
					if(player3.rollhold==hold4)
						System.out.println(player3.name + ", Congratulations! You have won!");
						gameover = 1;
					if(player4.rollhold==hold4)
						System.out.println(player4.name + ", Congratulations! You have won!");
						gameover = 1;
					if(player5.rollhold==hold4)
						System.out.println(player5.name + ", Congratulations! You have won!");
						gameover = 1;
				}
				if(numberOfPlayers==6){
					if(player1.rollhold==hold5)
						System.out.println(player1.name + ", Congratulations! You have won!");
						gameover = 1;
					if(player2.rollhold==hold5)
						System.out.println(player2.name + ", Congratulations! You have won!");
						gameover = 1;
					if(player3.rollhold==hold5)
						System.out.println(player3.name + ", Congratulations! You have won!");
						gameover = 1;
					if(player4.rollhold==hold5)
						System.out.println(player4.name + ", Congratulations! You have won!");
						gameover = 1;
					if(player5.rollhold==hold5)
						System.out.println(player5.name + ", Congratulations! You have won!");
						gameover = 1;
					if(player6.rollhold==hold5)
						System.out.println(player6.name + ", Congratulations! You have won!");
						gameover = 1;
				}

				
				if(hold5 == player1.rollhold)
					winnerCounter++; 
				if(hold5 == player2.rollhold)
					winnerCounter++; 
				if(hold5 == player3.rollhold)
					winnerCounter++; 
				if(hold5 == player4.rollhold)
					winnerCounter++; 
				if(hold5 == player5.rollhold)
					winnerCounter++; 
				if(hold5 == player6.rollhold)
					winnerCounter++; 

				
				
				
				
				
			
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
		}

	}
	
	public static void win(Player player){
		System.out.println(player.name + ", Congratulations! You have won!");
	}
	
	public static void Move(Player player){
		System.out.println(player.name + ", it is your turn, what would you like to do?");
		menu();
		int command = getMenuChoice();	
		
		if (command == 1){//Battle
			player.rollhold=player.rollDice();
			
		}
		
		if (command == 2){//Check Individual Score
			System.out.println(player.name + "'s score is: " + player.score);
			Move(player);
			return;
			
		}
		
		if (command == 3){//Surrender
			System.out.println("coward.");
			System.out.println(player.name + " has left the game.");
			player.score=-1;
			
			
			
		}
		if (command == 4){//Check Game Rules
			gameInfo();
			Move(player);
			return;
			
		}
		
		if((command != 1)&&(command != 2)&&(command != 3)&&(command != 4)){
			System.out.println("Invalid Command. Try Again");
			Move(player);
			return;
		}
		

	}

}