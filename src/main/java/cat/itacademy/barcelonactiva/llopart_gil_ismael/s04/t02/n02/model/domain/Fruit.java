package cat.itacademy.barcelonactiva.llopart_gil_ismael.s04.t02.n02.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "fruit")
public class Fruit implements Serializable {

	private static final long serialVersionUID = -5547302257752530658L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	
	@NotBlank (message = "El nom és obligatori.")
	@Column (name="name")
	private String name;
	
	@NotNull (message = "La quantitat és obligatòria.")
	@Column (name="number_of_kilograms")
	private int numberOfKilograms;
	
	
	public Fruit() {}
	
	public Fruit(String name, int numberOfKilograms) {
		this.name = name;
		this.numberOfKilograms = numberOfKilograms;
	}
	
	public int getId() {
		return id;
	}

	public String getName () {
		return name;
	}
	
	public int getNumberOfKilograms () {
		return numberOfKilograms;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumberOfKilograms(int numberOfKilograms) {
		this.numberOfKilograms = numberOfKilograms;
	}
}
