import java.lang.Comparable;
public class Card implements Comparable {
	public int suit;
	public int number;
	public Card(int s, int n){
		suit = s;
		number = n;
	}
	public String suit(){
		if (suit == 0){
			return "spades";
		}
		else if (suit == 1){
			return "clubs";
		}
		else if (suit == 2){
			return "hearts";
		}
		else if (suit == 3) {
			return "diamonds";
		}
		else{
			return "invalid";
		}
	}
	public String number(){
		if (number == 0){
			return "Ace";
		}
		else if (number == 10){
			return "Jack";
		}
		else if (number == 11){
			return "Queen";
		}
		else if (number == 12){
			return "King";
		}
		else{
			return "" + (number + 1);
		}
	}
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
