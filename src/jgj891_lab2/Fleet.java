package jgj891_lab2;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
/**
 * Fleet is a class that represents a fleet of starships.
 * It creates a Fleet object with a fleetName and an ArrayList of Starship objects. 
 * 
 * @author Sarthak Negi (jgj891)
 * UTSA CS 3443 - Lab 2
 * Spring 2023
 *
 */

public class Fleet{
	private String fleetName;
	private static int numStarShips = 0;
	
	private static ArrayList<Starship> starShipList = new ArrayList<Starship>();
	
	/**
	 * 
	 * @param fleetName
	 * 
	 * constructor that calls the function to set the name of the fleet
	 */
	public Fleet(String fleetName) {
		setFleetName(fleetName);
	}
	
	/**
	 * 
	 * @param fleetName
	 * 
	 * function that sets the name of the fleet
	 */
	public void setFleetName(String fleetName) {
		this.fleetName = fleetName;
	}
	
	/**
	 * 
	 * @param SS
	 * 
	 * function that adds a Starship object to the ArrayList starShipList
	 */
	public void addStarship(Starship SS) {
		starShipList.add(SS);
		setNumStarShips();
	}
	
	/**
	 * 
	 * @return function that calls getNumStarShips() to get the number of Starships object in the fleet and then return that 
	 */
	public int getSizeOfFleet() {
		return getNumStarShips();
	}
	
	/**
	 * function that increases the number of Starship objects in the fleet everytime a ship is added
	 */
	public static void setNumStarShips() {
		numStarShips++;
	}
	
	/**
	 * 
	 * @return function that returns the number of starships in the fleet 
	 */
	public static int getNumStarShips() {
		return numStarShips;
	}
	
	/**
	 * 
	 * @return returns a string representation of the fleet name
	 */
	public String getFleetName() {
		String str = "";
		int dashLength = this.fleetName.length();
		for (int i = 0; i < dashLength; i++) {
			str = str + "-";
		}
		str = str+"\n";
		str = str+this.fleetName;
		str = str+"\n";
		for (int i = 0; i < dashLength; i++) {
			str = str + "-";
		}
		str += "\n";
		return str;
	}
	
	/**
	 * 
	 * @param cm
	 * @return string representation of the a CrewMember object
	 * calls the toString() method on a CrewMember object
	 */
	public String getCrewString(CrewMember cm) {
		return cm.toString();
	}
	
	/**
	 * @return a string representation of the fleet with all its ships and crew members
	 */
	public String toString() {
		String str = this.getFleetName();
		
		for (int i = 0; i < starShipList.size(); i++) {
			str += starShipList.get(i).toString();
			str += "\n\n";
		}
		
		return str;
	}
	
	/**
	 * 
	 * @param directoryName
	 * @throws FileNotFoundException
	 * 
	 * reads the crew members data from the given data file.
	 * creates the Starship and CrewMember objects with the data read from the data files.
	 * calls the function addCrewMember() to add the crew member object to its assigned ship.
	 * calls the function addStarship() to add the star ships to the fleet  
	 */
	public void loadStarships(String directoryName) throws FileNotFoundException {
		File f = new File(directoryName);
		File fileList[] = f.listFiles();
		for(File file: fileList) {
			Scanner sc = new Scanner(file);
			String str = sc.nextLine();
			
			String[] shipArray = str.split(",");
			
			Starship stShip = new Starship(shipArray[0],shipArray[1],shipArray[2]);

			while (sc.hasNext()) {
				str = sc.nextLine();
				String[] cmArray = str.split(",");
				CrewMember cm = new CrewMember(cmArray[0],cmArray[1],cmArray[2],cmArray[3]);
				stShip.addCrewMember(cm);
			}
			
			this.addStarship(stShip);
			sc.close();
		}
	}

}
