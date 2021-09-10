package no.hvl.dat250.jpa.basicexample.Credit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Card {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int number;
	private int limit;
	private int balance;
	
	@OneToOne
	private Pin pin;
	
	@ManyToOne
	private Bank bank;
}
