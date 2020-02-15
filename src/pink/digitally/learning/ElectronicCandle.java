package pink.digitally.learning;

/**
 * As this is an electronic Candle. The wax and the wick will never burn. in fact they do not exist.
 * All it does is shine bright.
 */
public class ElectronicCandle extends Candle{

    public ElectronicCandle(String colour) {
        super(null, null, new Fragrance(), colour);
    }

    @Override
    public void light() {
        System.out.println("Electronic Candle.... Shine Bright!");
    }

    @Override
    public void blowout() {
        System.out.println("Turning out the bright lights");
    }
}
