package ovchipkaart;

public class Chipkaart
{

    private double saldo;
    private int kaartnummer;
    private boolean geldigheid;
    private boolean ingechecked;

    public Chipkaart(double saldo, int kaartnummer, boolean geldigheid, boolean ingechecked)
    {
	this.saldo = saldo;
	this.kaartnummer = kaartnummer;
	this.geldigheid = geldigheid;
	this.ingechecked = ingechecked;
    }

    public void inchecken(double instapTarief)
    {
	this.saldo = this.saldo - instapTarief;
	this.ingechecked = true;
	System.out.println("U bent nu ingechecked.");
    }

    public boolean benIkIngechecked()
    {
	return this.ingechecked;
    }

    public double getSaldo()
    {
	return this.saldo;
    }
    
    
    
}