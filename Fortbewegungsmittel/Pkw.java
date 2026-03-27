public class Pkw extends Straßenfahrzeug {
    protected int anzahlPlätze;
    public Pkw(double g, int a, double bodenfreiheit, int aP){
        super(g,a,bodenfreiheit);
        this.anzahlPlätze = aP;
    }

    @Override
    public void bremsen(double b) {
        System.out.println("Quitschen");
    } 

    @Override
    public void lenken(String lenkung) {
        System.out.println("Der Pkw lenkt mit dem Lenkrad.");
    }
    @Override
    public void hupen(String hupen){
        System.out.println("Der Pkw hupt mit der Hupe.");
    }
}