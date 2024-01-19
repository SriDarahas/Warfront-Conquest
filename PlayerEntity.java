// Assignment #: 5
//         Name: Sri Darahas Koneru
//    StudentID: 1226423798
//      Lecture: (TH/TUE 4.30-5.45)
//  Description: This code is for users to choose options for a game
abstract class PlayerEntity{ 
	protected double health;//Variable for health
	protected String entityName; //Variable name of the character
	protected int stamina;//Variable of stamina
	protected int attack;//Variable of attack
	protected int combatPoints;//Variable of combat points
	protected String weapon;//Variable of the weapon
	public PlayerEntity(double health, String name, int stamina, int attack, String weapon) {
		//Constructor to assign
		this.health = health;
		this.entityName = name;
		this.stamina = stamina;
		this.weapon = weapon;
		combatPoints = 0;
		this.attack=attack;
	}
	public int getCombatPoints() {
		//Returns combat points
		return combatPoints;
	}
	public abstract void computeCombatPower();//Abstract method
	public String toString() {
		return "Hero name:\t\t"+entityName+"\nCurrent Health:\t\t"+health+"\nStamina:\t\t"+stamina+"\nAttack Damage:\t\t"+attack+"\nWeapon:\t\t\t"+weapon+"\nCurrent Combat Points:\t"+combatPoints+"\n";
				
	}
}