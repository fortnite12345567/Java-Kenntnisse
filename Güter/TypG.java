import java.util.Scanner;

/**
 * @author 
 * @version 
 */
public class TypG extends Gueterwagen
{
    Scanner scan = new Scanner(System.in);
    
    int ladungsGewicht;
    
    public TypG(int pLeergewicht, char pZielgebiet, int pLadungsGewicht)
    {
        super(pLeergewicht, pZielgebiet);
        ladungsGewicht = pLadungsGewicht;
    }

    // Dienste
    public int auskunft(){
        System.out.println("Ladungsgewicht:");
        int ladungsGewicht = scan.nextInt();
        ladungsGewicht + leergewicht = gesamtGewicht;
        System.out.println("Wagen von TypG mit Gesamtgewicht " + ladungsGewicht + "!");
        return gesamtGewich;
    }
}