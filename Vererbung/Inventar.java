
/**
 * @author 
 * @version 
 */
public class Inventar
{
    // Bezugsobjekte

    // Attribute
    int bestand;
    int verkauft;
    boolean vorhanden;
    
    // Konstruktor
    public Inventar(int pBestand, int pVerkauft, boolean pVorhanden)
    {
        bestand = pBestand;
        verkauft = pVerkauft;
        vorhanden = pVorhanden;
    }

    public int getBestand(){
        return bestand;
    }
    public int getVerkauft(){
        return verkauft;
    }
    public boolean getVorhanden(){
        return vorhanden;
    }

    public void setBestand(int pBestand){
        bestand = pBestand;
    }
    public void setVerkauft(int pVerkauft){
        verkauft = pVerkauft;
    }
    public void setVorhanden(boolean pVorhanden){
        vorhanden = pVorhanden;
    }
    
}