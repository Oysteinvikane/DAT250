package no.hvl.dat250.jpa.basicexample.Credit;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Pin {
	@Id
	public String pin;

	public int count;
}
