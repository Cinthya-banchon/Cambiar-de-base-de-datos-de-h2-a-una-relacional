package com.ug.hotels.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.ug.hotels.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import com.ug.hotels.model.Hotel;

@RestController
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	@GetMapping("hotels")
	public List<Hotel> search(){
		return hotelService.seach();
		
	}

}
