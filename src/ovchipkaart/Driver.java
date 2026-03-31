package ovchipkaart;

import java.util.Scanner;

public class Driver
{

    public static void main(String[] args)
    {

	Locatie nijmegen = new Locatie("Nijmegen", 4.0, 3.0);
	Locatie arnhem = new Locatie("Arnhem", 5.0, 6.0);
	Chipkaart kaart = new Chipkaart(30.0, 34321, true, false);
	Paal incheckPaalTrein = new Paal(nijmegen);
	Scanner sc = new Scanner(System.in);
	boolean systeem = true;
	while (systeem)
	{
	    System.out.println("Wilt u inchecken, uitchecken of opwaarderen?");
	    String keuze = sc.next();

	    if (keuze.equalsIgnoreCase("Inchecken"))
	    {
		incheckPaalTrein.inchecken(kaart);
	    } else if (keuze.equalsIgnoreCase("Uitchecken"))
	    {
		incheckPaalTrein.uitchecken(kaart);
	    }
	}

    }
}
