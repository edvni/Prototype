public class Hand implements Cloneable {
    private int position;

    public void set(int position) {
        this.position = position;
    }

    public Hand clone() {
        try {
            return (Hand) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(position);
    }
}
