package week8.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Kenneth Gisler - kgisler@dmacc.edu
 * CIS171 22149
 * Oct 24, 2022
 */
@Entity
public class Player {
	@Id
	@GeneratedValue
	private long  id;
	private String name;
	private String phone;
	@Autowired
	private Army army;
	
	//constructors
	public Player() {
		super();
	}
	public Player(String name) {
		this.name = name;
	}
	public Player(String name,String phone) {
		this.name = name;
		this.phone = phone;
	}
	public Player(String name, String phone, Army army) {
		this.name = name;
		this.phone = phone;
		this.army = army;
	}
	
	//getters
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public Army getArmy() {
		return army;
	}
	
	//setters
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setArmy(Army army) {
		this.army = army;
	}
	
	//methods
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", phone=" + phone + ", army=" + army + "]";
	}
	
	
}
