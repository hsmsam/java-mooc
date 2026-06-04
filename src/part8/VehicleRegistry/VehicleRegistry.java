package part8.VehicleRegistry;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry = new HashMap<>();

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!(registry.containsKey(licensePlate))) {
            registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            return registry.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        boolean removed = false;

        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            removed = true;
        }
        return removed;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : registry.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> printed = new ArrayList<>();

        for (String owner : registry.values()) {
            if (!printed.contains(owner)) {
                System.out.println(owner);
                printed.add(owner);
            }
        }
    }
}
