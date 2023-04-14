package jgj891_lab2;
import java.util.ArrayList;

/**
 * Starship is a class that represents a Starship object.
 * It creates a Starship object with a name, registry, ship class and an ArrayList of CrewMember objects.
 * 
 * @author Sarthak Negi (jgj891)
 * UTSA CS 3443 - Lab 2
 * Spring 2023
 *
 */

public class Starship {
	private String shipName;
	private String registry;
	private String starshipClass;
	private int crewCount = 0;
	public ArrayList<CrewMember> crewList;
	
	/**
	 * 
	 * @param shipName
	 * @param registry
	 * @param starshipClass
	 * 
	 * constructor that calls the functions that assign the values to the Starship objects
	 */
	public Starship(String shipName, String registry, String starshipClass){
		setShipName(shipName);
		setRegistry(registry);
		setStarshipClass(starshipClass);
		crewList = new ArrayList<CrewMember>();
	}
	
	/**
	 * 
	 * @param shipName
	 * 
	 * function that sets the name of the ship
	 */
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	
	/**
	 * 
	 * @param registry
	 * 
	 * function that sets the registry of the ship
	 */
	public void setRegistry(String registry) {
		this.registry = registry;
		
	}
	
	/**
	 * 
	 * @param starshipClass
	 * 
	 * function that sets the class of the ship
	 */
	public void setStarshipClass(String starshipClass) {
		this.starshipClass = starshipClass;
	}	
	
	/**
	 * 
	 * @return name of the ship
	 */
	public String getShipName() {
		return (this.shipName);
	}
	
	/**
	 * 
	 * @return registry of the ship
	 */
	public String getRegistry() {
		return (this.registry);
		
	}
	
	/**
	 * 
	 * @return class of the ship
	 */
	public String getStarshipClass() {
		return (this.starshipClass);
	}
	
	/**
	 * @return string representation of the Starship object
	 */
	public String toString() {
		String str = this.getShipName()+", "+this.getStarshipClass()+". Registry: "+this.getRegistry();
		str += "\n"+ this.getNumberOfPersonnel()+" crew members assigned.";
		for(int i = 0; i < this.crewCount;i++) {
			str += "\n"+this.crewList.get(i).toString();		
		}
		return(str);
	}
	
	/**
	 * 
	 * @param CM
	 * 
	 * adds a CrewMember object to the ArrayList crewList
	 */
	public void addCrewMember(CrewMember CM) {
		this.crewList.add(CM);
		setCrewCount();
	}
	
	/**
	 * increases the number of crew members in the ship, everytime a new member is added
	 */
	public void setCrewCount() {
		this.crewCount++;
	}
	
	/**
	 * 
	 * @return number of crew members assigned to a ship
	 */
	public int getNumberOfPersonnel() {
		return getCrewCount();
	}
	
	/**
	 * 
	 * @return number of crew members assigned to a ship
	 */
	public int getCrewCount() {
		return this.crewCount;
	}
}
