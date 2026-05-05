package part5.FitByte;

public class FitByte {
    private int age;
    private int restingHeartRate;
    private double maximumHearRate;
    private double percentageOfMaximum;

    public FitByte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        maximumHearRate = 206.3 - (0.711 * age);
        double targetHeartRate = (maximumHearRate - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
        return targetHeartRate;
    }
}
