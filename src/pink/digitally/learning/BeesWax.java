package pink.digitally.learning;

/**
 * This is a child of the Wax class.
 * I am intentionally not overriding the stopMelting method because it will stop melting in exactly the same way.
 */
public class BeesWax extends Wax {
    @Override
    public void melt() {
        System.out.println("Beeswax melting slowly");
    }
}
