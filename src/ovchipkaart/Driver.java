package ovchipkaart;

import java.util.Scanner;

public class Driver
{

    public static void main(String[] args)
    {

	Chipkaart kaart = new Chipkaart(14.0, 34321, true, false);
	Paal incheckPaalBus = new Paal(4.0);
	Paal incheckPaalTrein = new Paal(20.0);
	Scanner sc = new Scanner(System.in);

	System.out.println("Wilt u inchecken, uitchecken of opwaarderen?");

	String keuze = sc.next();
	
    }
}
