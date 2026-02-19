
/**
 * @author 
 * @version 
 */
public class Steuerung
{
    protected int anzahlLEDs;
    List <LED> lichterkette  = new List<LED>();
    public Steuerung(){
        
    }
    public void lichterketteAnhängen(List <LED> pLichterkette){
        lichterkette.concat(pLichterkette);
    }
    public void alleLEDsAnmachen(){
        lichterkette.toFirst();
        while(lichterkette.hasAccess() == true){
            lichterkette.getContent().lichtAn();
            lichterkette.next();
        }
    }
    public void jedes2teLEDAnmachen(){
        lichterkette.toFirst();
        while(lichterkette.hasAccess() == true){
            if(lichterkette.getContent().leuchtet == true){
                lichterkette.getContent().lichtAus();
                lichterkette.next();
            }
        }
    }
    public void jedes3teLEDAnmachen(){
        lichterkette.toFirst();
        while(lichterkette.hasAccess() == true){
            lichterkette.getContent().lichtAn();
            lichterkette.next();
            lichterkette.next();
            lichterkette.next();
        }
    }
}