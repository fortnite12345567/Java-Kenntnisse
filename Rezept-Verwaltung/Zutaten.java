
/**
 * @author 
 * @version 
 */
public class Zutaten
{
    private String zName;
    private String zBeschreibung;
    public Zutaten(String name)
    {
        zName = name;
    }
    
    public String getName(){
        return zName;
    }
    public String getBeschreibung(){
        return zBeschreibung;
    }
    public void setBeschreibung(String text){
        zBeschreibung = text;
    }

}