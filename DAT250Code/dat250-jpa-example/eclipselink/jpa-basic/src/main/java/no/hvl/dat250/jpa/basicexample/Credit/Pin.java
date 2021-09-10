package no.hvl.dat250.jpa.basicexample.Credit;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Pin {
	@Id
	private String pin;
	private int count;
}
