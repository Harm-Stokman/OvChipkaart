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
		if (startLocatie.equalsIgnoreCase("Nijmegen"))
		{
		    incheckPaalTreinNijmegen.inchecken(kaart);
		} else if (startLocatie.equalsIgnoreCase("Arnhem"))
		{
		    incheckPaalTreinArnhem.inchecken(kaart);
		} else if (startLocatie.equalsIgnoreCase("Venlo"))
		{
		    incheckPaalTreinVenlo.inchecken(kaart);
		} else if (startLocatie.equalsIgnoreCase("Eindhoven"))
		{
		    incheckPaalTreinEindhoven.inchecken(kaart);
		} else {
		    System.out.println("Kies een geldige locatie");
		}

	    } else if (keuze.equalsIgnoreCase("Uitchecken") && kaart.benIkIngechecked())
	    {
		System.out.println("Welke locatie wilt u bij uitchecken?");
		String bestemming = sc.next();

		if (bestemming.equalsIgnoreCase("Nijmegen"))
		{
		    incheckPaalTreinNijmegen.uitchecken(kaart);
		} else if (bestemming.equalsIgnoreCase("Arnhem"))
		{
		    incheckPaalTreinArnhem.uitchecken(kaart);
		} else if (bestemming.equalsIgnoreCase("Venlo"))
		{
		    incheckPaalTreinVenlo.uitchecken(kaart);
		} else if (bestemming.equalsIgnoreCase("Eindhoven"))
		{
		    incheckPaalTreinEindhoven.uitchecken(kaart);
		} else {
		    System.out.println("Kies een geldige locatie");
		}

	    } else if (keuze.equalsIgnoreCase("Opwaarderen"))
	    {
		boolean opwaarderen = true;
		while (opwaarderen)
		{
		    System.out.println(
			    "Kies een optie: 1. Scannen van kaart || 2.  Opwaarderen tot: || 3. Opwaarderen met: || 4. Stoppen || 5. Saldo checken");
		    int opwaarderingsKeuze = sc.nextInt();
		    switch (opwaarderingsKeuze) {
		    case 1:
			oplaadPaal.scannen(kaart);
			break;
	
		    case 2:
			System.out.println("Vul hier uw gewenste bedrag in.");
			oplaadPaal.opwaarderenTot(sc.nextDouble());
			break;
		    
		    case 3:
			System.out.println("Vul hier uw gewenste bedrag in.");
			oplaadPaal.opwaarderenMet(sc.nextDouble());
			break;
		  
		    case 4:
			oplaadPaal.stoppen();
			opwaarderen = false;
			break;
			
		    case 5:
			System.out.println(oplaadPaal.getSaldo());
			break;
			
		    default:
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