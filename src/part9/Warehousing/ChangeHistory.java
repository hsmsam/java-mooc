package part9.Warehousing;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> historyChange = new ArrayList<>();

    public ChangeHistory() {
        this.historyChange = new ArrayList<>();
    }

    public void add(double status) {
        historyChange.add(status);
    }

    public void clear() {
        historyChange.clear();
    }

    public double minValue() {
        double min = historyChange.get(0);

        if (historyChange.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < historyChange.size(); i++) {
            if (historyChange.get(i) < min) {
                min = historyChange.get(i);
            }
        }
        return min;
    }

    public double maxValue() {
        double max = historyChange.get(0);

        if (historyChange.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < historyChange.size(); i++) {
            if (historyChange.get(i) > max) {
                max = historyChange.get(i);
            }
        }

        return max;
    }


    public double average() {
        double sum = 0;
        int count = 0;

        if (historyChange.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < historyChange.size(); i++) {
            sum += historyChange.get(i);
            count++;
        }

        return sum / count;
    }

    public String toString() {
        return historyChange.toString();
    }
}
