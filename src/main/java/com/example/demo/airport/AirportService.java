package com.example.demo.airport;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class AirportService {
	private List<Airport> airports;

	@PostConstruct
	void init() {
		this.airports = new ArrayList<>();

		Airport durban = new Airport(1, "Durban", "South Africa");
		airports.add(durban);

		Airport jhb = new Airport(2, "JHB", "South Africa");
		airports.add(jhb);

		Airport capeTown = new Airport(3, "Cape Town", "South Africa");
		airports.add(capeTown);
	}

	public List<Airport> getAllAirports() {
		return this.airports;
	}

	public Airport getAirportById(int id) {
		return this.airports.stream().filter(airport -> airport.getId() == id).findFirst().orElse(null);
	}

	public Airport createAirport(Airport airport) {
		OptionalInt maxId = this.airports.stream().mapToInt(Airport::getId).max();
		if (maxId.isPresent()) {
			airport.setId(maxId.getAsInt() + 1);
		}

		return airport;
	}

	public void deleteAirport(int id) {
		for (Airport Airport : this.airports) {
			if (Airport.getId() == id) {
				this.airports.remove(Airport);
				return;
			}
		}
	}
}
