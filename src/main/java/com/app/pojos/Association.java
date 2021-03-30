package com.app.pojos;



import javax.persistence.*;

@Entity
public class Association {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private String description;
	
	public Association() {
		System.out.println("In constructore of "+getClass().getName());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public Association(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Association [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
}