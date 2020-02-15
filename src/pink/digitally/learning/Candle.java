package pink.digitally.learning;

/**
 * This is my candle super class
 * So as with every object, Objects can have other objects and it can have characteristics.
 * <p>
 * For my candle I have decided that the objects it has are:
 * 1. Wick
 * 2. Wax
 * 3. Fragrance
 * 4. Colour
 * <p>
 * I Decided that the characteristics of the candle is as follows:
 * 1. The Candle can be lit
 * 2. The Candle can be blown out.
 * 2. The Candle can give off scent.
 * 3. It has a height that can be reduced due to the burning.
 * I am basically just using my imagination. I am thinking of how a real candle is and I am modelling it with this class.
 */
public class Candle {
    /*
     *   If this were a production software I would have preferred the first 4 variables to be final.
     *   (the final keyword means you cannot change the value.)
     *   This is because in real life you cannot change the wick, wax, fragrance or colour of a candle after it has been made.
     */
    private final Wick wick;
    private final Wax wax;
    private final Fragrance fragrance;
    private final String colour;

    public Candle(Wick wick, Wax wax, Fragrance fragrance, String colour) {
        this.wick = wick;
        this.wax = wax;
        this.fragrance = fragrance;
        this.colour = colour;
    }

    public void light() {
        System.out.println("The Room now smells of "+ fragrance.getScent());
        wick.burn();
        wax.melt();
    }

    public void blowout(){
        System.out.println("If the candle was lit, it would now be blownout.");
        wick.stopBurning();
        wax.stopMelting();
    }

    public String getColour(){
        return colour;
    }
}
