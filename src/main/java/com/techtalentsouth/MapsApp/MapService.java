package com.techtalentsouth.MapsApp;



import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MapService {
    @Value("${api_key}")
    private String apiKey;
    
    public void addCoordinates(com.techtalentsouth.MapsApp.Location location) {
        String url = "https://maps.googleapis.com/maps/api/geocode/json?address=" + 
        location.getCity() + "," + location.getState() + "&key=" + apiKey;
        
        RestTemplate restTemplate = new RestTemplate();
        GeocodingReponse response = restTemplate.getForObject(url, GeocodingReponse.class);
       
        
        
}
    
    
  
 
  
   
    
}
