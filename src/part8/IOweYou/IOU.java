package part8.IOweYou;

import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> IOU = new HashMap<>();

    public IOU() {
        this.IOU = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        IOU.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        for (String person : IOU.keySet()) {
            if (person.contains(toWhom)) {
                return IOU.get(toWhom);
            }
        }
        return 0;
    }
}
