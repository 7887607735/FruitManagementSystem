package com.SpringBootCRUDOperationsOfFruit.FruitCRUDOperation;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Fruit {
	
	@Id
	int id;
	String name;
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fruit(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + "]";
	}
	
	

}
