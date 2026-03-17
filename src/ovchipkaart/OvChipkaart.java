package ovchipkaart;

import java.util.Scanner;

public class OvChipkaart
{

    public static void main(String[] args)
    {

	Chipkaart kaart = new Chipkaart();
	Paal incheckPaalBus = new Paal(4.0);
	Paal incheckPaalTrein = new Paal(20.0);
	Scanner sc = new Scanner(System.in);
	boolean reizenMetVervoer = true;

	while (reizenMetVervoer)
	{
	    System.out.println("Wilt u inchecken, uitchecken, of uw saldo opwaarderen?");

	    boolean keuzeMaken = false;

	    while (!keuzeMaken)
	    {
		System.out.println("Uw huidige saldo is: €" + kaart.getSaldo());
		boolean ingecheckedOfNiet = kaart.benIkIngechecked();

		if (ingecheckedOfNiet)
		{
		    System.out.println("U bent op dit moment ingechecked.");
		} else
		{
		    System.out.println("U bent op dit moment niet ingechecked.");
		}

		String eersteKeuze = sc.next();

		if (eersteKeuze.equalsIgnoreCase("Inchecken") && !ingecheckedOfNiet)
		{
		    System.out.println("Bus of Trein?");
		    String vervoersKeuze = sc.next();
		    boolean keuzeGemaakt = false;
		    while (!keuzeGemaakt)
		    {
			if (vervoersKeuze.equalsIgnoreCase("Bus"))
			{
			    if (kaart.getSaldo() >= 4.0) {
				kaart.inchecken(incheckPaalBus.getInstapTarief());
				System.out.println("U bent zojuist ingechecked \n" + " ");
			        keuzeGemaakt = true;
			    } else {
				System.out.println("Te laag saldo, Verhoog je saldo door je chipkaart te gaan opwaarderen.");
				vervoersKeuze = sc.next();
			    }
			    
			} else if (vervoersKeuze.equalsIgnoreCase("Trein"))
			{
			    if (kaart.getSaldo() >= 20.0) {
				kaart.inchecken(incheckPaalTrein.getInstapTarief());
				    System.out.println("U bent zojuist ingechecked  \n" + " ");
				    keuzeGemaakt = true;
			    } else {
				System.out.println("Te laag saldo, Verhoog je saldo door je chipkaart te gaan opwaarderen.");
				vervoersKeuze = sc.next();
			    }
			    
			    
			} else
			{
			    System.out.println("Maak een geldige keuze. Kies voor de bus of de trein.");
			    vervoersKeuze = sc.next();
			}
		    }
		} else
		{
		    System.out.println("U bent al ingechecked, zorg ervoor dat u eerst bent uitgechecked");
		}
	    }

	}

    }

}
