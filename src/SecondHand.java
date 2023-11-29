public class SecondHand {
    private int seconds;

    public SecondHand(int seconds) {
        System.out.println("Creating second hand object...");
        this.seconds = seconds;
    }

    private SecondHand(SecondHand secondhand) {
        this.seconds = secondhand.seconds;
    }

    @Override
    public SecondHand clone() {
        return new SecondHand(this);
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
