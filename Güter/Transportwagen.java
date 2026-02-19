import java.util.Scanner;
/**
 * @author 
 * @version 
 */
public abstract class Transportwagen
{
    // Bezugsobjekte

    // Attribute
    protected int leergewicht;
    protected int gesamtgewicht;
    protected char zielgebiet;
    // Konstruktor
    
    public Transportwagen(int pLeergewicht, char pZielgebiet)
    {
        leergewicht = pLeergewicht;
        zielgebiet = pZielgebiet;
    }

    // Dienste
    
    public abstract int auskunft();
}