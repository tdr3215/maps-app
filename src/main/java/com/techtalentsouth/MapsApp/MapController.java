package com.techtalentsouth.MapsApp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {
	@GetMapping("/home")
	public String getDefaultMap() {
		
		
		MapService mapService = new MapService();
		Location location = new Location();
		location.setCity("Dallas");
		location.setState("Texas");
		mapService.addCoordinates(location);
		System.out.println(location);
		
		return "index.html";
	}
	
	
}
