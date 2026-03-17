package ovchipkaart;

public class Chipkaart
{

    private double saldo = 7.0;
    private int kaartnummer;
    private boolean geldigheid;
    private boolean ingechecked;

    public void inchecken(double instapTarief)
    {
	this.saldo = this.saldo - instapTarief;
	this.ingechecked = true;
    }
    
    public boolean benIkIngechecked() {
	return this.ingechecked;
    }

    public double getSaldo()
    {
	return this.saldo;
    }
}