
/**
 * @author 
 * @version 
 */
public class Papiere extends Schreibwaren
{
    // Bezugsobjekte

    // Attribute
    String farbe;
    String format;
    String dicke;
    // Konstruktor
    public Papiere(int pBestand, int pVerkauft, boolean pVorhanden, String pArt, String pName, int pArtNr, double pPreis, String pDicke, String pFormat, String pFarbe)
    {
        super(pBestand, pVerkauft, pVorhanden, pArt, pName, pArtNr, pPreis);
        farbe = pFarbe;
        format = pFormat;
        dicke = pDicke;
    }

    public String getFarbe(){
        return farbe;
    }
    public String getFormat(){
        return format;
    }
    public String getDicke(){
        return dicke;
    }
    
    public void setFarbe(String pFarbe){
        farbe = pFarbe;
    }
    public void setFormat(String pFormat){
        format = pFormat;
    }
    public void setDicke(String pDicke){
        dicke = pDicke;
    }

}