// Assignment #: 5
//         Name: Sri Darahas Koneru
//    StudentID: 1226423798
//      Lecture: (TH/TUE 4.30-5.45)
//  Description: This code is for users to choose options for a game

import java.text.DecimalFormat;
public class Fighter extends PlayerEntity {
	private double armor;
	private int maxAttack;
	private boolean isRanged;
	
	public Fighter(double health, String name, int stamina, int attack, String weapon, boolean isRanged) {
		super(health, name, stamina, attack, weapon);
		this.isRanged = isRanged;//using the parent constructor
		if(isRanged==true)//different values for ranged and melle.
		{
			armor=0.25;
			maxAttack=125;
		}
		else
		{
			armor=0.5;
			maxAttack=100;
		}
	}
	public void computeCombatPower() {//computes combat power based on all of the given variables
		if (maxAttack <=attack) {
			combatPoints = (int)((maxAttack + health) * (1-armor));
		}else {
			combatPoints = (int)((attack + health) * (1-armor));
		}
		if  (isRanged==true && weapon.equals("Rock")) {
			combatPoints = combatPoints+50;
		}else if(isRanged==false && weapon.equals("Sword")) {
			combatPoints = combatPoints * 2;
			}
	}
	public String toString() {
		DecimalFormat printfrmt = new DecimalFormat("#");
		if(isRanged == true) {
			return"\nFighter Hero:\t\tRanged Type\n"+super.toString()+"Armor:\t\t\t"+printfrmt.format(armor*100)+"%\n";
		}else {
			return "\nFighter Hero:\t\tMelee Type\n"+super.toString()+"Armor:\t\t\t"+printfrmt.format(armor*100)+"%\n";
		}
	}
}
