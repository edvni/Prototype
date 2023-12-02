public class MinuteHand extends Hand {
    private static final int MAX_MINUTES = 59;

    @Override
    public void set(int minutes) {
        if (minutes < 0 || minutes > MAX_MINUTES) {
            throw new IllegalArgumentException("Invalid minute: " + minutes);
        }
        super.set(minutes);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
