
/**
 * @author 
 * @version 
 */
public class Kreis implements Flaecheninhalt
{
    // Bezugsobjekte

    // Attribute
    private double radius;
    // Konstruktor
    public Kreis(double pRadius)
    {
        radius = pRadius;
    }
    public double getRadius(){
        return radius;
    }
    
    public double berechneFlaecheninhalt(){
         return Math.PI * (radius * radius);
    }
    public double berechneUmfang(){
        return 2*Math.PI*radius;
    }

    // Dienste

}