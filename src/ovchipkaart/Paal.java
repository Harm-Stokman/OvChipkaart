package ovchipkaart;

public class Paal
{

    private double instapTarief;

    public Paal(double instapTarief)
    {
	this.instapTarief = instapTarief;
    }
    
    
    public void inchecken(Chipkaart chipkaart)
    {
	boolean geldigheid = chipkaart.isMijnKaartGeldig();
	boolean ingechecked = chipkaart.benIkIngechecked();
	double genoegSaldo = chipkaart.getSaldo();

	if (geldigheid && !ingechecked && genoegSaldo >= instapTarief)
	{
	    chipkaart.inchecken(instapTarief);
	    System.out.println("U bent ingechecked.");

	} else if (!geldigheid) {
	    System.out.println("Ongeldige kaart");
	} else if (ingechecked) {
	    System.out.println("U bent al ingechecked, Probeer eerst uit te checken.");
	} else if (genoegSaldo < instapTarief) {
	    System.out.println("Onvoldoende saldo.");
	}
    }
} 