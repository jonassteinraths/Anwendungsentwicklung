public abstract class Fortbewegungsmittel {
    protected double gewicht;
    public Fortbewegungsmittel(double g) {
        gewicht = g;
    }
    public abstract void bremsen(double b);
}