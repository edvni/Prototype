public class Main {
    public static void main(String[] args) {
        System.out.println("Creating clock object...");
        Clock clock = new Clock(new HourHand(12), new MinuteHand(0), new SecondHand(0));

        System.out.println("\nCreation complete\n");

        System.out.println("Cloning clock object...");
        Clock clockClone = clock.clone();
        System.out.println("Cloning hour hand object...");
        HourHand hourHandClone = clockClone.getHourHand().clone();
        System.out.println("Cloning minute hand object...");
        MinuteHand minuteHandClone = clockClone.getMinuteHand().clone();
        System.out.println("Cloning second hand object...");
        SecondHand secondHandClone = clockClone.getSecondHand().clone();

        System.out.println("\nCloning complete\n");

        System.out.println("Setting clock clone hour hand to 6...");
        hourHandClone.setHours(6);
        System.out.println("Setting clock clone minute hand to 30...");
        minuteHandClone.setMinutes(30);
        System.out.println("Setting clock clone second hand to 0...");
        secondHandClone.setSeconds(0);

        clockClone.setHourHand(hourHandClone);
        clockClone.setMinuteHand(minuteHandClone);
        clockClone.setSecondHand(secondHandClone);
        System.out.println("\nSetting complete\n");


        System.out.println("Printing clock...");
        System.out.println(clock);
        System.out.println("Printing clock clone...");
        System.out.println(clockClone);
    }
}
