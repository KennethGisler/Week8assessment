package week8.beans;

import javax.persistence.Embeddable;

/**
 * Kenneth Gisler - kgisler@dmacc.edu
 * CIS171 22149
 * Oct 24, 2022
 */
@Embeddable
public class Army {
	private String name;
	private String faction;
	private int cost;
	
	//constructors
	public Army() {
		super();
	}
	public Army(String name) {
		this.name = name;
	}
	public Army(String name, String faction) {
		this.name = name;
		this.faction = faction;
	}
	public Army(String name, String faction, int cost) {
		this.name = name;
		this.faction = faction;
		this.cost = cost;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public String getFaction() {
		return faction;
	}
	public int getCost() {
		return cost;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setFaction(String faction) {
		this.faction = faction;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	//methods
	@Override
	public String toString() {
		return "Army [name=" + name + ", faction=" + faction + ", cost=" + cost + "]";
	}
	
}
