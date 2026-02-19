
/**
 * @author 
 * @version 
 */
public class Fahrzeug
{
    private String modell;
    private String farbe;
    private String kennzeichen;
    private boolean verkehrstauglichkeit; 
    public Fahrzeug(String pModell, String pFarbe, String pKennzeichen, boolean pVerkehrstauglichkeit)
    {
        modell = pModell;
        farbe = pFarbe;
        kennzeichen = pKennzeichen;
        verkehrstauglichkeit = pVerkehrstauglichkeit;
    }
    public boolean getVerkehrstauglichkeit(){
        return verkehrstauglichkeit;
    }
}