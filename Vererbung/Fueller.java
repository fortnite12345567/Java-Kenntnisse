
/**
 * @author 
 * @version 
 */
public class Fueller extends Schreibwaren
{
    // Bezugsobjekte

    // Attribute
    String schreibfarbe;
    String strichstaerke;
    String artDerPatrone;

    // Konstruktor
    public Fueller(int pBestand, int pVerkauft, boolean pVorhanden, String pArt, String pName, int pArtNr, double pPreis, String pSchreibfarbe, String pStrichstaerke, String pArtDerPatrone)
    {
        super(pBestand, pVerkauft, pVorhanden, pArt, pName, pArtNr, pPreis);
        schreibfarbe = pSchreibfarbe;
        strichstaerke = pStrichstaerke;
        artDerPatrone = pArtDerPatrone;
    }

    public String getSchreibfarbe(){
        return schreibfarbe;
    }
    public String getStrichstaerke(){
        return strichstaerke;
    }
    public String getArtDerPatrone(){
        return artDerPatrone;
    }
    
    public void setFarbe(String pSchreibfarbe){
        schreibfarbe = pSchreibfarbe;
    }
    public void setFormat(String pStrichstaerke){
        strichstaerke = pStrichstaerke; 
    }
    public void setDicke(String pArtDerPatrone){
        artDerPatrone = pArtDerPatrone;
    }
}