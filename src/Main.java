public class Main {
    public static void main(String[] args) {
        // ------- Deep Copy -------
        // make clock prototype
        System.out.println("------------ Deep Copy ------------");
        IPrototype originalClock = new Clock();
        originalClock.setHands(12, 30, 45);

        // clone original clock
        IPrototype clonedClock = originalClock.clone();

        // show original clock and cloned clocks
        System.out.println("Original clock:");
        originalClock.showTime();

        System.out.println("\nCloned clock:");
        clonedClock.showTime();

        // change time of original clock
        originalClock.setHands(3, 15, 30);

        // show original clock and cloned clocks again
        System.out.println("\nAfter changing original clock:");
        System.out.println("Original clock:");
        originalClock.showTime();

        System.out.println("\nCloned clock:");
        clonedClock.showTime();

        // ------- Shallow Copy -------
        System.out.println("------------ Shallow Copy ------------");
        IPrototype originalClock2 = new Clock();
        originalClock2.setHands(10, 10, 10);

        IPrototype shallowClonedClock = originalClock2.shallowClone();

        System.out.println("Original clock 2:");
        originalClock2.showTime();

        System.out.println("\nShallow cloned clock:");
        shallowClonedClock.showTime();

        originalClock2.setHands(11, 11, 11);

        System.out.println("\nAfter changing original clock 2:");
        System.out.println("Original clock 2:");
        originalClock2.showTime();

        System.out.println("\nShallow cloned clock:");
        shallowClonedClock.showTime();
    }
}
