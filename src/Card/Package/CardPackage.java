package Card.Package;

import java.util.ArrayList;
import java.util.List;

import Card.Card;
import Enumeration.CouleurEnum;
import Enumeration.RangEnum;

public class CardPackage{

	private List CardList;
	private static final int LENGHT_CARD=52;
	Card [] CardBoard;
	private Card card;
	
	public CardPackage() {
		// TODO Auto-generated constructor stub
		CardList=new ArrayList<Card>();
		this.CardBoard=new Card[LENGHT_CARD];
		
		InitPackage(this.CardBoard);
	}
	
	public static void InitPackage(Card []CardBoard) {
		
		for(RangEnum rang:RangEnum.values()) {
			int i=0;
			    for(CouleurEnum color:CouleurEnum.values()) {
				    CardBoard[i]=new Card(rang,color);
				    System.out.println(CardBoard[i].ToString());
			    }
			i++;
		}
	}
	}
