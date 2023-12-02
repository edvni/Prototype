public class HourHand extends Hand {
    private static final int MAX_HOURS = 12;

    @Override
    public void set(int hours) {
        if (hours < 1 || hours > MAX_HOURS) {
            throw new IllegalArgumentException("Invalid hour: " + hours);
        }
        super.set(hours);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
