package part4.TelevisionPrograms;

public class TelevisionProgram {
    private String showName;
    private int showDuration;

    public TelevisionProgram(String showName, int showDuration) {
        this.showName = showName;
        this.showDuration = showDuration;
    }

    public String getsShowName() {
        return showName;
    }

    public int getShowDuration() {
        return showDuration;
    }

    public String toString() {
        return showName + ", " + showDuration + " minutes";
    }

}
