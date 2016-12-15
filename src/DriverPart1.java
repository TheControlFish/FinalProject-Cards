
public class DriverPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckOfCardsPart1 deck = new DeckOfCardsPart1();
		deck.shuffle();
		for (int n = 1; n <= 5; n++){
			System.out.println(deck.deal(n).number() + " of " + deck.deal(n).suit());
		}
	}

}
