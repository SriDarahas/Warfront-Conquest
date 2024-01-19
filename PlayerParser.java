// Assignment #: 5
//         Name: Sri Darahas Koneru
//    StudentID: 1226423798
//      Lecture: (TH/TUE 4.30-5.45)
//  Description: This code is for users to choose options for a game
public class PlayerParser{
	public static PlayerEntity parseNewPlayer(String lineToParse) {
		String[] players = lineToParse.split("/");//using split method to 'split' the string into smaller strings.
		if (players[0].equalsIgnoreCase("mage")) {//assigns the smaller strings by parsing them into different variables
			Mage player = new Mage(Double.parseDouble(players[1]),players[2],Integer.parseInt(players[3]),Integer.parseInt(players[4]),players[5],Double.parseDouble(players[6]));
			return player;
		}else {
			if(players[6].equalsIgnoreCase("melee")) {
				Fighter player = new Fighter(Double.parseDouble(players[1]),players[2],Integer.parseInt(players[3]),Integer.parseInt(players[4]),players[5],false);
						return player;
			}else {
				Fighter player = new Fighter(Double.parseDouble(players[1]),players[2],Integer.parseInt(players[3]),Integer.parseInt(players[4]),players[5],true);
			
			    return player;
			}
		}
	}
}


