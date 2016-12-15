
public class DriverPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckOfCardsPart2 deck = new DeckOfCardsPart2(true);
		deck.shuffle();
		DeckOfCardsPart2 playerOne = new DeckOfCardsPart2(false);
		DeckOfCardsPart2 playerTwo = new DeckOfCardsPart2(false);
		for (int n = 0; n < 7; n++){
			deck.deal(playerOne);
			deck.deal(playerTwo);
		}
		System.out.println("PlayerOne's Hand: ");
		for (int n = 0; n < playerOne.deck.size(); n++){
			System.out.println(playerOne.deck.get(n).number() + " of " + playerOne.deck.get(n).suit());
		}
		System.out.println();
		System.out.println("PlayerTwo's Hand: ");
		for (int n = 0; n < playerTwo.deck.size(); n++){
			System.out.println(playerTwo.deck.get(n).number() + " of " + playerTwo.deck.get(n).suit());
		}
		System.out.println();
		System.out.println("Size of original deck: " + deck.deck.size());
	}

}
