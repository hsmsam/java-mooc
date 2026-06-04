package part8.StorageFacility;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> facility = new HashMap<>();
    private ArrayList<String> storageUnits = new ArrayList<>();

    public StorageFacility() {
        this.facility = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.facility.putIfAbsent(unit, new ArrayList<>());
        facility.get(unit).add(item);
        if (!(storageUnits.contains(unit))) {
            storageUnits.add(unit);
        }
    }

    public ArrayList<String> contents(String storageUnit) {
        if (facility.containsKey(storageUnit)) {
            return facility.get(storageUnit);
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item) {
        if (facility.containsKey(storageUnit)) {
            facility.get(storageUnit).remove(item);

            if (facility.get(storageUnit).isEmpty()) {
                facility.remove(storageUnit);
                storageUnits.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        return storageUnits;
    }
}
