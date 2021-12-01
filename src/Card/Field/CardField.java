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
		System.out.println("Start -------------------------");
		initCenter();
		this.getCardOfTheCenter();
		
	}
	public void initCenter() {
		this.CardOfTheCenter.add(this.PackCard.getIndexOfTheCard(1));
		this.PackCard.RemoveCardOfTheList(1);
		
	}
	public void getCardOfTheCenter() {
		System.out.println("List of Card in the center");
		for(int i=0;i<this.CardOfTheCenter.size();i++) {
			System.out.println(this.CardOfTheCenter.get(i).ToString());
		}
		System.out.println("---------------------------------------------");
		System.out.println("There are "+this.PackCard.LenghtOfCard()+" Cards in the package");
	}
	

}
