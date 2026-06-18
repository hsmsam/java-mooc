package part11.SensorsAndTemperature.application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors = new ArrayList<>();
    private List<Integer> readings = new ArrayList<>();

    public AverageSensor() {
        this.sensors = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                sensor.setOn();
            }
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn()) {
                sensor.setOff();
            }
        }
    }

    @Override
    public int read() {
        int sum = 0;

        if (!isOn() || sensors.isEmpty()) {
            throw new IllegalArgumentException();
        }

        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }

        int average = sum / sensors.size();

        readings.add(average);

        return average;
    }
}
