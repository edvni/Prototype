public class HourHand implements IPrototype {
    private int hours;

    public HourHand(int hours) {
        System.out.println("Creating hour hand object...");
        this.hours = hours;
    }

    private HourHand(HourHand hourhand) {
        this.hours = hourhand.hours;
    }

    @Override
    public HourHand clone() {
        return new HourHand(this);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
