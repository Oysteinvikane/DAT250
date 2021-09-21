package no.hvl.dat250.jpa.basicexample.Credit;

import javax.persistence.*;

@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public String Name;

	@Override
	public String toString() {
		return "Bank{" +
				"id=" + id +
				", Name='" + Name + '\'' +
				'}';
	}
}
