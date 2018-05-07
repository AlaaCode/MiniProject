package com.work.classes.service;


import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.work.classes.dao.ReservationRepository;
import com.work.classes.dao.TerrainRepository;
import com.work.classes.entities.Reservation;
import com.work.classes.entities.Terrain;

@RestController
public class ReservationTerrainRestService {

	@Autowired
	private TerrainRepository terrainRepository;
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	//for the test
	public ReservationTerrainRestService( ReservationRepository reservationRepository) {
		this.reservationRepository=reservationRepository;
	}
	
	
}
