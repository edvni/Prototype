public class Clock implements IPrototype {
    private HourHand hourhand;
    private MinuteHand minutehand;
    private SecondHand secondhand;

    public Clock(HourHand hourhand, MinuteHand minutehand, SecondHand secondhand) {
        this.hourhand = hourhand;
        this.minutehand = minutehand;
        this.secondhand = secondhand;
    }

    private Clock(Clock clock) {
        this.hourhand = clock.hourhand.clone();
        this.minutehand = clock.minutehand.clone();
        this.secondhand = clock.secondhand.clone();
    }

    @Override
    public Clock clone() {
        return new Clock(this);
    }

    public HourHand getHourHand() {
        return hourhand;
    }

    public void setHourHand(HourHand hourhand) {
        this.hourhand = hourhand;
    }

    public MinuteHand getMinuteHand() {
        return minutehand;
    }

    public void setMinuteHand(MinuteHand minutehand) {
        this.minutehand = minutehand;
    }

    public SecondHand getSecondHand() {
        return secondhand;
    }

    public void setSecondHand(SecondHand secondhand) {
        this.secondhand = secondhand;
    }

    @Override
    public String toString() {
        return "Clock: " + hourhand.getHours() + ":" + minutehand.getMinutes() + ":" + secondhand.getSeconds();
    }
}
