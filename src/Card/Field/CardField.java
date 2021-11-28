package Card.Field;
import java.util.ArrayList;
import java.util.List;

import Card.Card;
import Card.Package.CardPackage;
import User.Player.Player;
public class CardField {
	private List <Card> CardOfTheCenter;
	private Player player;
	private CardPackage PackCard;
	
	public CardField(CardPackage PackCard,Player player) {
		// TODO Auto-generated constructor stub
		this.PackCard=PackCard;
		this.player=player;
		this.CardOfTheCenter=new ArrayList<Card>();
		
	}
	public void initCenter() {
		
	}
	

}
