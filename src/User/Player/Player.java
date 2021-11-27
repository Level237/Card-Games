package User.Player;

import java.util.ArrayList;
import java.util.List;

import Card.Card;
import Card.Package.CardPackage;
import User.UserInterFace;

public class Player implements UserInterFace{

	private List <Card> CardOfPlayer;
	private String Name;
	private int NumberOfDraw;
	public Player(String Name) {
		// TODO Auto-generated constructor stub
		this.CardOfPlayer=new ArrayList <Card>();
		this.NumberOfDraw=5;
		this.Name=Name;
		
	}
	@Override
	public void PickOut(CardPackage pack) {
		// TODO Auto-generated method stub
		
	}
	

	}
