
/**
 * @author 
 * @version 
 */
public class Rezept implements ComparableContent<Rezept>
{
    private String rSchluessel;
    private String rBeschreibung;
    List<Zutaten> zList;
    public Rezept(String schluessel)
    {
        rSchluessel = schluessel;
    }

    public void setBeschreibung(String text){
        rBeschreibung = text;
    }
    
    public String getBeschreibung(){
        return rBeschreibung;
    }
    
    public String getSchluessel(){
        return rSchluessel;
    }
    
    public boolean isGreater(Rezept pRezept){
        return this.rSchluessel.compareTo(pRezept.getSchluessel())>0;
    }
    
    public boolean isLess(Rezept pRezept){
        return this.rSchluessel.compareTo(pRezept.getSchluessel())<0;
    }
    
    public boolean isEqual(Rezept pRezept){
        return this.rSchluessel.compareTo(pRezept.getSchluessel())==0;
    }

}