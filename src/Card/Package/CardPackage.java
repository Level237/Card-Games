package Card.Package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import Card.Card;
import Enumeration.CouleurEnum;
import Enumeration.RangEnum;

public class CardPackage
{

	private List <Card> CardList;
	private static final int LENGHT_CARD=52;
	private static Card [] CardBoard;
	private Card card;
	
	public CardPackage() 
	{
		
		CardList=new ArrayList<Card>();

		this.CardBoard=new Card[CouleurEnum.values().length*RangEnum.values().length];
		
		// We initialize the card pack with the function InitPackage,and one sorting function with the function ToMixTogether.
		InitPackage();
		ToMixTogether(this.CardList);
		
    }
	
    public void InitPackage()
	{
		for(int i=0;i<CouleurEnum.values().length;i++) {
			for(int j=0;j<RangEnum.values().length;j++) {
				CardBoard[i*RangEnum.values().length + j]=new Card(RangEnum.values()[j],CouleurEnum.values()[i]);
				this.CardList.add(CardBoard[i*RangEnum.values().length + j]);
			}
		}
		
	}

    public  void ToMixTogether(List <Card> cardlist) {
    	System.out.println("Mixing cards in progress..........");
              Collections.shuffle(cardlist);
              TravelMapList(cardlist);
        }
    
     public static void TravelMapList(List <Card> MapList) {
    	 for(int i=0;i<MapList.size();i++) {
    		 System.out.println(MapList.get(i).ToString());
    	 }
     }
     public void cardTakeCardsOfTheList(int numberOfCard) {
    	 for(int i=0;i<this.CardList.size();i++) {
    		 System.out.println("Cards taken in the package ---------------");
    		 System.out.println(this.CardList.get(i).ToString());
    	 }
     }
     
     
     public Card TakeFirstCardOfTheList() {
    	 
    	 return this.CardList.get(1);
     }
     
     public void RemoveCardOfTheList(int index) {
    	 this.CardList.remove(index);
     }
     
     // Getters and other method of the List
     public void getListCard() {
    	 TravelMapList(this.CardList);
     }
     public int LenghtOfCard() {
    	 return this.CardList.size();
     }
     public String RestOftheCard() {
    	 return "there are "+this.LenghtOfCard()+" Card(s) in the package";
     }
     
    }


