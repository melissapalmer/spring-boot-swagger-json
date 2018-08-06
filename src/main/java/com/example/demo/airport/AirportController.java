package com.example.demo.airport;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Set of endpoints for Creating, Retrieving, Updating and Deleting of Airports.
 * 
 * @author melissa.palmer
 */
@RestController
@RequestMapping("/v2/airports/")
public class AirportController {

	private AirportService airportService;

	/**
	 * Returns list of all Persons in the system.
	 * 
	 * @return airpots list
	 */
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<Airport> getAllAirports() {
		return airportService.getAllAirports();
	}
}
