package ovchipkaart;

import java.util.Scanner;

public class Driver
{

    public static void main(String[] args)
    {

	Chipkaart kaart = new Chipkaart(20.0, 34321, true, false);
	Locatie nijmegen = new Locatie("Nijmegen", 4.0, 4.0);
	Locatie arnhem = new Locatie("Arnhem", 5.0, 6.0);
	Locatie venlo = new Locatie("Venlo", 6.0, 3.0);
	Locatie eindhoven = new Locatie("Eindhoven", 3.0, 2.0);
	Paal incheckPaalTreinNijmegen = new Paal(nijmegen);
	Paal incheckPaalTreinArnhem = new Paal(arnhem);
	Paal incheckPaalTreinVenlo = new Paal(venlo);
	Paal incheckPaalTreinEindhoven = new Paal(eindhoven);
	Scanner sc = new Scanner(System.in);
	Laadpaal oplaadPaal = new Laadpaal();
	boolean systeem = true;
	while (systeem)
	{
	    System.out.println("Wilt u inchecken, uitchecken of opwaarderen?");
	    String keuze = sc.next();

	    if (keuze.equalsIgnoreCase("Inchecken") && !kaart.benIkIngechecked())
	    {
		System.out.println("Welke locatie wilt u bij inchecken?");
		String startLocatie = sc.next();

		switch (startLocatie)
		{
		case "nijmegen":
		    incheckPaalTreinNijmegen.inchecken(kaart);
		    break;

		case "arnhem":
		    incheckPaalTreinArnhem.inchecken(kaart);
		    break;

		case "venlo":
		    incheckPaalTreinVenlo.inchecken(kaart);
		    break;

		case "eindhoven":
		    incheckPaalTreinEindhoven.inchecken(kaart);
		    break;

		default:
		    System.out.println("Kies een geldige locatie.");
		}
	    } else if (keuze.equalsIgnoreCase("Uitchecken") && kaart.benIkIngechecked())
	    {
		System.out.println("Welke locatie wilt u bij uitchecken?");
		String bestemming = sc.next();

		switch (bestemming)
		{
		case "nijmegen":
		    incheckPaalTreinNijmegen.uitchecken(kaart);
		    break;

		case "arnhem":
		    incheckPaalTreinArnhem.uitchecken(kaart);
		    break;

		case "venlo":
		    incheckPaalTreinVenlo.uitchecken(kaart);
		    break;

		case "eindhoven":
		    incheckPaalTreinEindhoven.uitchecken(kaart);
		    break;

		default:
		    System.out.println("Kies een geldige locatie.");

		}
	    } else if (keuze.equalsIgnoreCase("Opwaarderen"))
	    {
		boolean opwaarderen = true;
		while (opwaarderen)
		{
		    System.out.println(
			    "Kies een optie: Scannen || Opwaarderen tot: || Opwaarderen met: || Stoppen || Saldo");
		    String opwaarderingsKeuze = sc.next();
		    if (opwaarderingsKeuze.equalsIgnoreCase("Scannen"))
		    {
			oplaadPaal.scannen(kaart);
		    } else if (opwaarderingsKeuze.equalsIgnoreCase("Opwaarderentot"))
		    {
			System.out.println("Vul hier uw gewenste bedrag in.");
			oplaadPaal.opwaarderenTot(sc.nextDouble());
		    } else if (opwaarderingsKeuze.equalsIgnoreCase("Opwaarderenmet"))
		    {
			System.out.println("Vul hier uw gewenste bedrag in.");
			oplaadPaal.opwaarderenMet(sc.nextDouble());
		    } else if (opwaarderingsKeuze.equalsIgnoreCase("Saldo"))
		    {
			System.out.println(oplaadPaal.getSaldo());
		    } else if (opwaarderingsKeuze.equalsIgnoreCase("Stoppen"))
		    {

			oplaadPaal.stoppen();
			opwaarderen = false;
		    } else
		    {
			System.out.println("Kies een geldige optie");
		    }
		}

	    } else
	    {
		System.out.println("Fout opgetreden.");
	    }
	}

    }
}
