package ovchipkaart;

public class Chipkaart
{

    private double saldo;
    private int kaartnummer;
    private boolean geldigheid;
    private boolean ingechecked;
    private Locatie startLocatie;


    public Chipkaart(double saldo, int kaartnummer, boolean geldigheid, boolean ingechecked)
    {
	this.saldo = saldo;
	this.kaartnummer = kaartnummer;
	this.geldigheid = geldigheid;
	this.ingechecked = ingechecked;
    }

    public void inchecken(Locatie locatie, double instapTarief)
    {
	this.saldo = this.saldo - instapTarief;
	this.ingechecked = true;
	startLocatie = locatie;
    }
    
    public void uitchecken(Locatie locatie, double instapTarief) {
	this.ingechecked = false;
	this.saldo = this.saldo - startLocatie.afstandBerekenen(locatie) + instapTarief;
	startLocatie = null;
    }
    
    public void opwaarderenMet(double toegevoegdBedrag) {
	this.saldo = this.saldo + toegevoegdBedrag;
    }

    public boolean benIkIngechecked()
    {
	return this.ingechecked;
    }
  
    public boolean isMijnKaartGeldig() {
	return this.geldigheid;
    }
    
    public double getSaldo()
    {
	return this.saldo;
    }
      
}