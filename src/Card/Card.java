package Card;

import Enumeration.CouleurEnum;
import Enumeration.RangEnum;

public class Card {
    private RangEnum Rang;
    private CouleurEnum colorEnum;
    
	public Card(RangEnum e,CouleurEnum colorEnum) {
		this.Rang=e;
		this.colorEnum=colorEnum;
	}
	
	public RangEnum getRang() {
		return this.Rang;
	}
	public void setRang(RangEnum rang) {
		this.Rang=rang;
	}
	public CouleurEnum getColor() {
		return this.colorEnum;
	}
	
	public void setColor(CouleurEnum colorEnum) {
		this.colorEnum=colorEnum;
	}

}
