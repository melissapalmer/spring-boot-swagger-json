package com.example.demo.airport;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Airport {

	/**
	 * Unique identifier of the airport. No two airports can have the same id.
	 */
	@NotNull
	private int id;

	/**
	 * Name of the airport
	 */
	@NotBlank
	@Size(min = 1, max = 20)
	private String name;

	/**
	 * Country of the airport
	 */
	@NotBlank
	private String country;

	public Airport(int id, String name, String country) {
		this.id = id;
		this.name = name;
		this.country = country;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
