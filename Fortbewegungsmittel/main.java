public class main {
    public static void main(String[] args) {   
        Pkw meinPkw = new Pkw(2500, 2, 15, 5);
        meinPkw.bremsen();
        meinPkw.lenken();
        meinPkw.hupen();

        System.out.println("Der Pkw hat ein Gewicht von" + meinPkw.gewicht + "kg " + " und eine Anzahl von " + meinPkw.anzahlAchsen + "Achsen, eine Bodenfreiheit von " + meinPkw.bodenfreiheit + "cm und " + meinPkw.anzahlPlätze + " Plätze.");

    }   
}