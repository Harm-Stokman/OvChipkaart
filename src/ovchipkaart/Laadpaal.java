package ovchipkaart;

public class Laadpaal
{

    private Chipkaart huidigeKaart;

    public void scannen(Chipkaart chipkaart)
    {
	huidigeKaart = chipkaart;
    }

    public void opwaarderenTot(double maxBedrag)
    {
	if (huidigeKaart != null) {
	double saldo = huidigeKaart.getSaldo();
	double verschil = maxBedrag - saldo;
	huidigeKaart.opwaarderenTot(verschil);
	} else {
	    System.out.println("Bied eerst een kaart aan A.U.B.");
	}
    }

    public void opwaarderenMet(double toegevoegdBedrag)
    {
	if (huidigeKaart != null) {
	    huidigeKaart.opwaarderenMet(toegevoegdBedrag);
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