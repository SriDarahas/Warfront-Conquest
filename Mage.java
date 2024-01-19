// Assignment #: 5
//         Name: Sri Darahas Koneru
//    StudentID: 1226423798
//      Lecture: (TH/TUE 4.30-5.45)
//  Description: This code is for users to choose options for a game
import java.text.DecimalFormat;
public class Mage extends PlayerEntity{
	private double mana;
	public Mage(double health, String name, int stamina, int attack, String weapon, double mana) {
		super(health,name,stamina,attack,weapon);//super constructor
		this.mana = mana;
	}
	public void computeCombatPower() {//calculating the combat power of the mage
		combatPoints = (int)((attack + health)*(1+mana));
		if (weapon.equals("Staff")) {
			combatPoints = combatPoints + 30;
		}
	}
	public String toString() {
		DecimalFormat printfrmt = new DecimalFormat("#");
		return"\nMage Hero:\n"+super.toString()+"Mana:\t\t\t"+printfrmt.format(mana*100)+"%\n";
	}
	
}
