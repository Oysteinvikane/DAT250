package no.hvl.dat250.jpa.basicexample.Credit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

import java.util.ArrayList;
import java.util.function.IntFunction;

@Entity
@Data
public class Card extends ArrayList<Card> {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int number;
	private int limit;
	private int balance;
	
	@OneToOne
	public Pin pin;
	
	@ManyToOne
	public Bank bank;

}
