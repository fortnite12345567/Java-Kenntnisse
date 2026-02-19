
/**
 * @author 
 * @version 
 */
public class Bleistift extends Schreibwaren
{
    // Bezugsobjekte

    // Attribute
    String schreibfarbe;
    String strichstaerke;
    String haerteGrad;

    // Konstruktor
    public Bleistift(int pBestand, int pVerkauft, boolean pVorhanden, String pArt, String pName, int pArtNr, double pPreis, String pSchreibfarbe, String pStrichstaerke, String pHaerteGrad)
    {
        super(pBestand, pVerkauft, pVorhanden, pArt, pName, pArtNr, pPreis);
        schreibfarbe = pSchreibfarbe;
        strichstaerke = pStrichstaerke;
        haerteGrad = pHaerteGrad;
    }

    public String getSchreibfarbe(){
        return schreibfarbe;
    }
    public String getStrichstaerke(){
        return strichstaerke;
    }
    public String getHaerteGrad(){
        return haerteGrad;
    }
    
    public void setFarbe(String pSchreibfarbe){
        schreibfarbe = pSchreibfarbe;
    }
    public void setFormat(String pStrichstaerke){
        strichstaerke = pStrichstaerke; 
    }
    public void setDicke(String pHaertegrad){
        haerteGrad = pHaertegrad;
    }
    // Dienste

}