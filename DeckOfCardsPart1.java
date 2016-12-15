import java.util.*;
public class DeckOfCardsPart1 {
	public Card[] deck;
	Random rndm;
	public DeckOfCardsPart1(){
		rndm = new Random();
		deck = new Card[52];
		int c = 0;
		for (int s = 0; s < 4; s++){
			for (int n = 0; n < 13; n++){
				deck[c] = new Card(s,n);
				c++;
			}
		}
	}
	public void shuffle(){
		for (int n = 0; n < deck.length; n++){
			int x = rndm.nextInt(52);
			int s = deck[n].suit;
			int num = deck[n].number;
			deck[n] = deck[x];
			deck[x] = new Card(s,num);
		}
	}
	public Card deal(int spot){ //1 is the top of the deck, 52 is the bottom
		if (spot < 53){
			return deck[spot - 1];
		}
		else{
			return null;
		}
	}
}
