public abstract class Straßenfahrzeug extends Landfahrzeug {
    protected double bodenfreiheit;
    public Straßenfahrzeug(double g, int a, double bodenfreiheit) {
        super(g, a);
        this.bodenfreiheit = bodenfreiheit;
    
    }
    public abstract void hupen(String hupen);
}