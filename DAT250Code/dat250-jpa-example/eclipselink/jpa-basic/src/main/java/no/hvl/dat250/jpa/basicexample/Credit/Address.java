package no.hvl.dat250.jpa.basicexample.Credit;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Address {
	@Id
	public String street;
	@Id
	public int adnumber;
	@ManyToOne
	private Person owner;
}
