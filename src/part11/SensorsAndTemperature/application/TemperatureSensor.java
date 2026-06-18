package part11.SensorsAndTemperature.application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean running;

    @Override
    public boolean isOn() {
        return running;
    }

    @Override
    public void setOn() {
        running = true;
    }

    @Override
    public void setOff() {
        running = false;
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalArgumentException();
        }
        Random random = new Random();
        int number = random.nextInt(61) - 30;

        return number;
    }
}
