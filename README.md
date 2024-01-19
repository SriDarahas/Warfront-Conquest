**Project Overview**
In Assignment 5, you'll create a class hierarchy for calculating battle statistics in an action role-playing game. The program allows users to manage heroes with different characteristics and compute their combat power. The heroes can be mages or fighters, each with unique attributes. The program provides a menu-driven interface for adding heroes, computing combat points, counting heroes above a specified threshold, and listing all heroes in the guild.

**How to Run:**
Download the Main.java file.
Add code to complete the file based on provided comments.
Download the other necessary files: PlayerEntity.java, Fighter.java, Mage.java, PlayerParser.java.
Implement the methods and classes as described in the assignment.
Run the Main class to interact with the battle stats simulator.

**Project Structure**
Class Hierarchy
PlayerEntity (abstract class):

**Attributes**: 
health, entityName, stamina, attack, combatPoints, weapon
Abstract Method: computeCombatPower()
Method: toString()
Mage (extends PlayerEntity):

**Additional Attribute:**
Constructor: Mage(double health, String name, int stamina, int attack, String weapon, double mana)
Method: computeCombatPower()
Fighter (extends PlayerEntity):

**Requirements**:
Include assignment details, name, ID, lecture info in each file.
Describe each method and provide comments for clarity.
Implement inheritance, the protected modifier, the super reference, abstract classes, and use of wrapper classes.
Utilize ArrayList for managing heroes.
Implement UML diagram and class descriptions.


