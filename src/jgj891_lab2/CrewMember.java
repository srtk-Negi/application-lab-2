package jgj891_lab2;

/**
 * CrewMember is java class that represents a CrewMember object.
 * It creates a CrewMember object with a name, position, rank, species and an optional assignment.
 * Has the appropriate getters and setters.
 * 
 * @author Sarthak Negi (jgj891)
 * UTSA CS 3443 - Lab 2
 * Spring 2023
 */

public class CrewMember {
	private String name;
	private String position;
	private String rank;
	private String species;
	private String assignment;
	
	/**
	 * 
	 * @param name
	 * @param position
	 * @param rank
	 * @param species
	 * @param assignment
	 * 
	 * constructor that calls the functions to assign values to the CrewMember object (including assignment)
	 */
	public CrewMember(String name, String position, String rank, String species, String assignment) {
		this.setName(name);
		this.setPosition(position);
		this.setRank(rank);
		this.setSpecies(species);
		this.setAssignment(assignment);
	}
	
	/**
	 * 
	 * @param name
	 * @param position
	 * @param rank
	 * @param species
	 * 
	 * constructor that calls the functions to assign the values to the CrewMember object (excluding assignment) 
	 */
	public CrewMember(String name, String position, String rank, String species) {
		this.setName(name);
		this.setPosition(position);
		this.setRank(rank);
		this.setSpecies(species);
	}
	
	/**
	 * 
	 * @param name
	 * 
	 * function to set the name of the CrewMember object
	 */
	private void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @param position
	 * 
	 * function to set the position of the CrewMember object
	 */
	private void setPosition(String position) {
		this.position = position;
	}
	
	/**
	 * 
	 * @param rank
	 * 
	 * function to set the rank of the CrewMember object
	 */
	private void setRank(String rank) {
		this.rank = rank;
	}
	
	/**
	 * 
	 * @param species
	 * 
	 * function to set the species of the CrewMember object
	 */
	private void setSpecies(String species) {
		this.species = species;
	}
	
	/**
	 * 
	 * @param assignment
	 * 
	 * function to set the assignment of the CrewMember object
	 */
	private void setAssignment(String assignment) {
		this.assignment = assignment;
	}
	
	/**
	 * 
	 * @return name of the CrewMember object
	 */
	public String getName() {
		return(this.name);
	}
	
	/**
	 * 
	 * @return position of the CrewMember object
	 */
	public String getPosition() {
		return(this.position);
	}
	
	/**
	 * 
	 * @return rank of the CrewMember object
	 */
	public String getRank() {
		return(this.rank);
	}
	
	/**
	 * 
	 * @return species of the CrewMember object
	 */
	public String getSpecies() {
		return(this.species);
	}
	
	/**
	 * 
	 * @return assignment of the CrewMember object
	 */
	public String getAssignment() {
		return(this.assignment);
	}
	
	/**
	 * @return string representation of the CrewMember object
	 */
	public String toString() {
		return(" - "+this.getName()+" ("+this.getRank()+") - "+this.getPosition()+" ["+this.getSpecies()+"]");
	}
}
