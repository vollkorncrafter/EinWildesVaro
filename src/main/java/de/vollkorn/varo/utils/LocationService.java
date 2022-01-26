package de.vollkorn.varo.utils;

import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;

public class LocationService {

    private final List<Location> spawnLocations = new ArrayList<>();


    public List<Location> getSpawnLocations() {
        return spawnLocations;
    }
}
