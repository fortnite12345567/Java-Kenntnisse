
/**
 * @author 
 * @version 
 */
public class Schreibwaren extends Inventar
{
    // Bezugsobjekte

    // Attribute
    String art;
    String name;
    int artNr;
    double preis;
    // Konstruktor
    public Schreibwaren(int pBestand, int pVerkauft, boolean pVorhanden, String pArt, String pName, int pArtNr, double pPreis)
    {
        super(pBestand, pVerkauft, pVorhanden);
        art = pArt;
        name = pName;
        artNr = pArtNr;
        preis = pPreis;
    }

    public String getArt(){
        return art;
    }
    public String getName(){
        return name;
    }
    public int getArtNr(){
        return artNr;
    }
    public double getPreis(){
        return preis;
    }
    
    public void setArt(String pArt){
        art = pArt;
    }
    public void setName(String pName){
        name = pName;
    }
    public void setArtNr(int pArtNr){
        artNr = pArtNr;
    }
    public void preis(double pPreis){
        preis = pPreis;
    }
}