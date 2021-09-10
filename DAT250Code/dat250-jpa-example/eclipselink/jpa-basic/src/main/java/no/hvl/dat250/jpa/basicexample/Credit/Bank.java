package no.hvl.dat250.jpa.basicexample.Credit;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Bank {
	@Id
	public String bankname;
	@OneToMany
	private ArrayList<Card> cardowner;
}
