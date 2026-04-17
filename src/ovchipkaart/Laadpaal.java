package ovchipkaart;

public class Laadpaal
{

    private Chipkaart huidigeKaart;

    public void scannen(Chipkaart chipkaart)
    {
	huidigeKaart = chipkaart;
	System.out.println("Uw kaart is gescand.");
    }

    public void opwaarderenTot(double maxBedrag)
    {
	if (huidigeKaart != null) {
	double saldo = huidigeKaart.getSaldo();
	double verschil = maxBedrag - saldo;
	huidigeKaart.opwaarderenMet(verschil);
	System.out.println("Het bedrag is toegevoegd aan uw saldo.");
	} else {
	    System.out.println("Bied eerst een kaart aan A.U.B.");
	}
    }

    public void opwaarderenMet(double toegevoegdBedrag)
    {
	if (huidigeKaart != null) {
	    huidigeKaart.opwaarderenMet(toegevoegdBedrag);
	    System.out.println("Het bedrag is toegevoegd aan uw saldo.");
	} else {
	    System.out.println("Bied eerst een kaart aan A.U.B.");
	}	
    }

    public void stoppen()
    {
	huidigeKaart = null;
    }
    
    public double getSaldo() {
	if (huidigeKaart != null) {
	    return huidigeKaart.getSaldo();
	} else {
	    return 0.0;
	}
	
    }
}