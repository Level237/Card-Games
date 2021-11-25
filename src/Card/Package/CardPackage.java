package Card.Package;

import java.util.ArrayList;
import java.util.List;

import Card.Card;
import Enumeration.CouleurEnum;
import Enumeration.RangEnum;

public class CardPackage
{

	private List CardList;
	private static final int LENGHT_CARD=52;
	private static Card [] CardBoard;
	private Card card;
	
	public CardPackage() {
		
		CardList=new ArrayList<Card>();

		this.CardBoard=new Card[CouleurEnum.values().length*RangEnum.values().length];
		
		InitPackage();
		
		
	}
	

	public static void InitPackage()
	{
		for(int i=0;i<CouleurEnum.values().length;i++) {
			for(int j=0;j<RangEnum.values().length;j++) {
				CardBoard[i*RangEnum.values().length + j]=new Card(RangEnum.values()[j],CouleurEnum.values()[i]);
				System.out.println(CardBoard[i*RangEnum.values().length + j].ToString());
			}
		}
	}

    public  void ToMixTogether() {
        for(int i=0;i<52;i++) {
        	System.out.println(this.CardBoard[i]);
        }
    }
}

