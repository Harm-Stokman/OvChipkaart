package ovchipkaart;

import java.util.Scanner;

public class Driver
{

    public static void main(String[] args)
    {

	Chipkaart kaart = new Chipkaart(50.0, 34321, true, false);
	Locatie nijmegen = new Locatie("Nijmegen", 4.0, 4.0);
	Locatie arnhem = new Locatie("Arnhem", 5.0, 6.0);
	Locatie venlo = new Locatie("Venlo", 6.0, 3.0);
	Locatie eindhoven = new Locatie("Eindhoven", 3.0, 2.0);
	Paal incheckPaalTreinNijmegen = new Paal(nijmegen);
	Paal incheckPaalTreinArnhem = new Paal(arnhem);
	Paal incheckPaalTreinVenlo = new Paal(venlo);
	Paal incheckPaalTreinEindhoven = new Paal(eindhoven);
	Scanner sc = new Scanner(System.in);
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
		 
		 switch (bestemming) {
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
		 }  else if (keuze.equalsIgnoreCase("Saldo"))
	    {
		System.out.println(kaart.getSaldo());
	    } else {
		System.out.println("Fout opgetreden tijdens het in / uitchecken.");
	    }
	}

    }
    }
