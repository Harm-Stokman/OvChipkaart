package ovchipkaart;

public class Locatie
{
    String locatienaam;
    double xPositie;
    double yPositie;

    public Locatie(String locatienaam, double xPositie, double yPositie)
    {
	this.locatienaam = locatienaam;
	this.xPositie = xPositie;
	this.yPositie = yPositie;
    }
    
    public double afstandBerekenen(Locatie bestemming) {
	
	double verschilXPos = this.xPositie - bestemming.xPositie;
	double verschilYPos = this.yPositie - bestemming.yPositie;
		
	double kwadraatX = verschilXPos * verschilXPos; 
	double kwadraatY = verschilYPos * verschilYPos; 
	
	double kwadraatAfstand = kwadraatX + kwadraatY;
	
	double afstand = Math.sqrt(kwadraatAfstand);
	
	return afstand;
	
    }
    
}