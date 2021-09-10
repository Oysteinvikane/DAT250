package no.hvl.dat250.jpa.basicexample.Credit;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private String name;
	@ManyToOne
	private Address address;
	@OneToOne
	private ArrayList<Card> cards;
	
}
