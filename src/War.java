public class War {
	//Infinite games are fairly common, I don't know whether that's an error in the code, or if that's just how the game is
	//Also, the count of cards in each deck may be wrong for the last round or 2
	public static void main(String[] args) {
		DeckOfCardsPart2 deck = new DeckOfCardsPart2(true);
		deck.shuffle();
		DeckOfCardsPart2 player1 = new DeckOfCardsPart2(false);
		DeckOfCardsPart2 player2 = new DeckOfCardsPart2(false);
		DeckOfCardsPart2 pot = new DeckOfCardsPart2(false);
		while (deck.deck.size() > 0){
			deck.deal(player1);
			deck.deal(player2);
		}
		int count = 1;
		while (player1.deck.size() > 0 && player2.deck.size() > 0){
			System.out.println("Round " + count + ":");
			System.out.println(player1.deck.get(0).number() + " of " + player1.deck.get(0).suit() + " vs. " + player2.deck.get(0).number() + " of " + player2.deck.get(0).suit() + ". The winner is: ");
			player1.deal(pot);
			player2.deal(pot);
			if(pot.deck.get(pot.deck.size() - 1).number < pot.deck.get(pot.deck.size() - 2).number){
				System.out.println("Player One!");
				while(pot.deck.size() > 0){
					pot.deal(player2);
				}
			}
			else if(pot.deck.get(pot.deck.size() - 1).number > pot.deck.get(pot.deck.size() - 2).number){
				System.out.println("Player Two!");
				while(pot.deck.size() > 0){
					pot.deal(player1);
				}
			}
			else if (pot.deck.get(pot.deck.size() - 1).number == pot.deck.get(pot.deck.size() - 2).number){
				while (pot.deck.size() > 1 && pot.deck.get(pot.deck.size() - 1).number == pot.deck.get(pot.deck.size() - 2).number){
					System.out.println("It's a Tie! Dealing three more cards to the pot then continuing.");
					if(player1.deck.size() > 3 && player2.deck.size() > 3){
						player1.deal(pot);
						player2.deal(pot);
						player1.deal(pot);
						player2.deal(pot);
						player1.deal(pot);
						player2.deal(pot);
						System.out.println(player1.deck.get(0).number() + " of " + player1.deck.get(0).suit() + " vs. " + player2.deck.get(0).number() + " of " + player2.deck.get(0).suit() + ". The winner is: ");
						player1.deal(pot);
						player2.deal(pot);
						if(pot.deck.get(pot.deck.size() - 1).number < pot.deck.get(pot.deck.size() - 2).number){
							System.out.println("Player One!");
							while(pot.deck.size() > 0){
								pot.deal(player2);
							}
						}
						else if(pot.deck.get(pot.deck.size() - 1).number > pot.deck.get(pot.deck.size() - 2).number){
							System.out.println("Player Two!");
							while(pot.deck.size() > 0){
								pot.deal(player1);
							}
						}
					}
					else{
						break;
					}
				}
			}
			System.out.println("Size of Player One's deck: " + player1.deck.size());
			System.out.println("Size of Player Two's deck: " + player2.deck.size());
			count++;
			System.out.println();
		}
		String s = "Nobody";
		if (player1.deck.size() > player2.deck.size()){
			s = "Player One";
		}
		else if (player1.deck.size() < player2.deck.size()){
			s = "Player Two";
		}
		System.out.println("Game Over! " + s + " Wins!");
	}

}
