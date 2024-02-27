package com.SpringBootCRUDOperationsOfFruit.FruitCRUDOperation;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitController {
	
	public ArrayList<Fruit> al=new ArrayList<Fruit>();

	
		@Autowired
		SessionFactory sf;
		
		public FruitController() {
			al.add(new Fruit(1,"Mango"));
			al.add(new Fruit(2,"Apple"));
			al.add(new Fruit(3,"Orange"));
			al.add(new Fruit(4,"Banana"));
			al.add(new Fruit(5,"Gauva"));
			al.add(new Fruit(6,"Waterlemon"));
			al.add(new Fruit(7,"Grapes"));

			
		}
		
		@GetMapping("allFruits")
		public ArrayList<Fruit> allFruits() {
			return al;
			
		}
			
		@GetMapping("SingleFruit/{id}")
		public Fruit SingleStudent(@PathVariable int id) {
			Fruit f=new Fruit();
			for(Fruit fruit:al) {
				if(fruit.id==id) {
				f=fruit;
				}
			}
				System.out.println(f);
				return f;
	}
		@PostMapping("insertSingleRecord")
		public ArrayList<Fruit> insertSingleRecord(@RequestBody Fruit fruit) {
			al.add(fruit);
			return al;
			}
		@PutMapping("updateSingleRecord")
		public ArrayList<Fruit> updateSingleRecord(@RequestBody Fruit fruit) {
			al.add(fruit);
			return al;
			}
		
		@DeleteMapping("deleteSingleFuit/{id}")
		public ArrayList<Fruit> deleteSingleFuit(@PathVariable int id){
			Fruit f=new Fruit(); {
				for(Fruit fruit:al) {
					if(fruit.id==id) {
						f=fruit;
					}
				}
				al.remove(f);
				return al;
			}
		}
}



