package ovchipkaart;

public class Paal
{

    private double instapTarief = 20.0;
    private Locatie locatie;

    public Paal(double instapTarief, Locatie locatie)
    {
	this.instapTarief = instapTarief;
	this.locatie = locatie;
    }

    public Paal(Locatie locatie)
    {
	this.locatie = locatie;
    }

    public void inchecken(Chipkaart chipkaart)
    {
	boolean geldigheid = chipkaart.isMijnKaartGeldig();
	boolean ingechecked = chipkaart.benIkIngechecked();
	double genoegSaldo = chipkaart.getSaldo();

	if (geldigheid && !ingechecked && genoegSaldo >= instapTarief)
	{
	    chipkaart.inchecken(this.locatie, instapTarief);
	    System.out.println("U bent ingechecked.");
	} else if (!geldigheid)
	{
	    System.out.println("Ongeldige kaart");
	} else if (ingechecked)
	{
	    System.out.println("U bent al ingechecked, Probeer eerst uit te checken.");
	} else if (genoegSaldo < instapTarief)
	{
	    System.out.println("Onvoldoende saldo.");
	}
    }

    public void uitchecken(Chipkaart chipkaart)
    {
	boolean ingechecked = chipkaart.benIkIngechecked();
	
	if (ingechecked) {
	    chipkaart.uitchecken(locatie, instapTarief);
	}
	
    }
}