package Start.main;

import Card.Field.CardField;
import Card.Package.CardPackage;
import User.Player.Player;

public class PlayTheBasicsWithMe {

	public static void main(String[] args) {
		CardPackage Card=new CardPackage();
		Player player=new Player("martin");
		CardField field=new CardField(Card,player);
		
		System.out.println(Card.LenghtOfCard());
	}

}
