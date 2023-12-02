public interface IPrototype extends Cloneable {
    IPrototype clone();

    IPrototype shallowClone();

    void showTime();

    void setHands(int i, int i1, int i2);
}
