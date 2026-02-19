
/**
 * @author 
 * @version 
 */
public class Quadrat implements Flaecheninhalt
{
    // Bezugsobjekte

    // Attribute
    private double seitenlaenge;
    // Konstruktor
    public Quadrat(double pSeitenlaenge)
    {
        seitenlaenge = pSeitenlaenge;
    }
    public double getSeitenlaenge(){
        return seitenlaenge;
    }
    
    public double berechneFlaecheninhalt(){
        return seitenlaenge * seitenlaenge;
    }
    public double berechneUmfang(){
        return 4 * seitenlaenge;
    }
}