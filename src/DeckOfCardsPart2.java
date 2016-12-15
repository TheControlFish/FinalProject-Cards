import java.util.*;
public class DeckOfCardsPart2 {
	public ArrayList<Card> deck;
	Random rndm;
	public DeckOfCardsPart2(boolean filled){ //constructs the deck filled or empty
		rndm = new Random();
		deck = new ArrayList<Card>();
		if (filled){
			for (int s = 0; s < 4; s++){
				for (int n = 0; n < 13; n++){
					deck.add(new Card(s,n));
				}
			}
		}
	}
	public void removeTopCard(){ //removes the top card
		deck.remove(0);
	}
	public void addCard(String number, String suit){ //adds to the bottom of the deck
		int s = 0;
		int n = 0;
		boolean valid = true;
		if (suit.equalsIgnoreCase("spades")){
			s = 0;
		}
		else if (suit.equalsIgnoreCase("clubs")){
			s = 1;
		}
		else if (suit.equalsIgnoreCase("hearts")){
			s = 2;
		}
		else if (suit.equalsIgnoreCase("diamonds")){
			s = 3;
		}
		else{
			System.out.println("INVALID");
			valid = false;
		}
		if(number.equalsIgnoreCase("ace")){
			n = 0;
		}
		else if (number.charAt(0) >= 49 && number.charAt(0) <= 57 && number.length()==1){
			n = (int)number.charAt(0) - 49;
		}
		else if (number.equalsIgnoreCase("10")){
			n = 9;
		}
		else if (number.equalsIgnoreCase("jack") || number.equalsIgnoreCase("11")){
			n = 10;
		}
		else if (number.equalsIgnoreCase("queen")|| number.equalsIgnoreCase("12")){
			n = 11;
		}
		else if (number.equalsIgnoreCase("king")|| number.equalsIgnoreCase("13")){
			n = 12;
		}
		else {
			System.out.println("INVALID");
			valid = false;
		}
		if (valid){
			deck.add(new Card(s,n));
		}
	}
	public void shuffle(){
		for (int n = 0; n < deck.size(); n++){
			int x = rndm.nextInt(52);
			int s = deck.get(n).suit;
			int num = deck.get(n).number;
			deck.set(n, deck.get(x));
			deck.set(x, new Card(s,num));
		}
	}
	public void deal(DeckOfCardsPart2 otherDeck){ //puts the top card of the deck at the bottom of the otherDeck
		otherDeck.addCard(deck.get(0).number(), deck.get(0).suit());
		removeTopCard();
	}
}
