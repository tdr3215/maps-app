package com.techtalentsouth.MapsApp;

import java.util.List;

import lombok.Data;

@Data
public class GeocodingReponse {
    private List<Geocoding> results;

	public List<Geocoding> getResults() {
		return results;
	}

	public void setResults(List<Geocoding> results) {
		this.results = results;
	}

	
}