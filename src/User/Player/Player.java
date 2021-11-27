package User.Player;

import java.util.ArrayList;
import java.util.List;

import Card.Card;
import Card.Package.CardPackage;
import User.UserInterFace;

public class Player implements UserInterFace{

	private List <Card> CardOfPlayer;
	private String Name;
	private int MaximumPickOut;
	public Player(String Name) {
		// TODO Auto-generated constructor stub
		this.CardOfPlayer=new ArrayList <Card>();
		this.MaximumPickOut=5;
		this.Name=Name;
		
	}
	@Override
	public void PickOut(CardPackage pack) {
		// TODO Auto-generated method stub
		this.CardOfPlayer.add(pack.TakeFirstCardOfTheList());
		pack.RemoveCardOfTheList(1);
		System.out.println(pack.RestOftheCard());
		this.MaximumPickOut--;
		}
	public void TravelCardofPlayer() {
		for(int i=0;i<this.CardOfPlayer.size();i++) {
			
			System.out.println(this.CardOfPlayer.get(i).ToString());
		}
	}
	
	
	//getter 
	public int getMaximumPickOut() {
		return this.MaximumPickOut;
	}
	public void getCardOfPlayer() {
		System.out.println("Card Of Player "+this.Name+"------------------------------------");
		this.TravelCardofPlayer();
	}
	
	

	}
