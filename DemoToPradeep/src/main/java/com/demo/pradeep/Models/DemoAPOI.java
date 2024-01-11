package com.demo.pradeep.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DemoAPOI {

	@Id
	private int id;
	private String name;

	@Override
	public String toString() {
		return "DemoAPOI [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}