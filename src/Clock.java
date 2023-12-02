public class Clock implements IPrototype, Cloneable {
    private HourHand hourhand;
    private MinuteHand minutehand;
    private SecondHand secondhand;

    public Clock() {
        hourhand = new HourHand();
        minutehand = new MinuteHand();
        secondhand = new SecondHand();
    }

    public void setHands(int hours, int minutes, int seconds) {
        hourhand.set(hours);
        minutehand.set(minutes);
        secondhand.set(seconds);
    }

    public void showTime() {
        System.out.println(hourhand + ":" + minutehand + ":" + secondhand);
    }

    public IPrototype clone() {
        try {
            Clock clonedClock = (Clock) super.clone();
            clonedClock.hourhand = (HourHand) hourhand.clone();
            clonedClock.minutehand = (MinuteHand) minutehand.clone();
            clonedClock.secondhand = (SecondHand) secondhand.clone();
            return clonedClock;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public IPrototype shallowClone() {
        try {
            return (IPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
