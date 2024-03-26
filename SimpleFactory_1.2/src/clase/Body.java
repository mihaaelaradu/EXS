package clase;

public class Body extends MedicamentAbstract{
    protected Body(String denumire, float pret) {
        super(denumire,pret);
    }

    @Override
    public void descriere() {
        System.out.println("Acest medicament este pentru body");
        System.out.println("Medicamentul " + super.getDenumire() + " este un medicament de tip Body si are pretul de " + super.getPret() + " RON.");

    }
}
