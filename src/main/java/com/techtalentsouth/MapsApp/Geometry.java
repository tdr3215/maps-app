package com.techtalentsouth.MapsApp;

import javax.tools.DocumentationTool.Location;

import lombok.Data;

@Data
public class Geometry {
    private Location location;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
    
}
