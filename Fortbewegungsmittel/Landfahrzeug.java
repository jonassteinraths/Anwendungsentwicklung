public abstract class Landfahrzeug extends Fortbewegungsmittel {
    protected int anzahlAchsen;
    public Landfahrzeug(double g, int a) {
        super(g);
        this.anzahlAchsen = a;
    }
    public abstract void lenken(String Lenkung);

}