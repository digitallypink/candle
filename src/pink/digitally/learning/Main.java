package pink.digitally.learning;

//I am using this class to demonstrate how I can create different types of candles with different characteristics
public class Main {
    public static void main(String[] args) {
        //Below I am constructing a candle with all the parts.
        //Think of this as me buying the parts and building the candle
        Candle standardCandle = new Candle(new Wick(), new Wax(), new LavenderFragrance(), "Blue");

        //Below I am using a subclass of candle instead of creating one.
        // Think of this as me buying a candle from the store
        Candle redBeeswaxCandle = new RedBeesWaxPillarCandle();

        //I also got a fake candle
        Candle electronicCandle = new ElectronicCandle("Green");

        //Now I am going to check the colour of both of my candles
        System.out.printf("The Standard Candle colour is %s\n", standardCandle.getColour());
        System.out.printf("The Red Beeswax Pillar Candle colour is %s\n", redBeeswaxCandle.getColour());
        System.out.printf("The Electronic colour is %s\n", electronicCandle.getColour());

        //Now I am going to light both candles
        System.out.println("\n\nAbout to light the candles");
        standardCandle.light();
        System.out.println();
        redBeeswaxCandle.light();
        System.out.println();
        electronicCandle.light();
        System.out.println("\n\nAbout to blowout the candles");

        //Now I am tired of all the candle light. Now I am going to blow them out
        System.out.println("\nTurning off the candles.");
        standardCandle.blowout();
        System.out.println();
        redBeeswaxCandle.blowout();
        System.out.println();
        electronicCandle.blowout();
    }
}
