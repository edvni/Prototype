public class MinuteHand implements IPrototype {
    private int minutes;

    public MinuteHand(int minutes) {
        System.out.println("Creating minute hand object...");
        this.minutes = minutes;
    }

    private MinuteHand(MinuteHand minutehand) {
        this.minutes = minutehand.minutes;
    }

    @Override
    public MinuteHand clone() {
        return new MinuteHand(this);
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
