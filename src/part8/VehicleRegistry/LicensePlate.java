package part8.VehicleRegistry;

import java.util.HashMap;

public class LicensePlate {
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof LicensePlate)) {
            return false;
        }


        if (this.liNumber.equals(((LicensePlate) object).liNumber) && this.country.equals(((LicensePlate) object).country)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.liNumber.hashCode();
    }

}
