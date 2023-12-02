public class SecondHand extends Hand {
    private static final int MAX_SECONDS = 59;

    @Override
    public void set(int seconds) {
        if (seconds < 0 || seconds > MAX_SECONDS) {
            throw new IllegalArgumentException("Invalid second: " + seconds);
        }
        super.set(seconds);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
