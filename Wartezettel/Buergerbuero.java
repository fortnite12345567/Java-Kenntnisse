
/**
 * @author 
 * @version 
 */
public class Buergerbuero 
{
    // Bezugsobjekte

    // Attribute
    private int aktNummer;
    private Queue<Wartezettel> warteraum;
    private Queue<Wartezettel> Onlinewarteraum;
    // Konstruktor
    public  Buergerbuero(boolean Online){
        if(Online = true){
            warteraum = new Queue<Wartezettel>();
        warteraum1 = new Queue<OnlineWartezettel>();
    }
    
    public void kundeKommt(Wartezettel pW, OnlineWartezettel pW1){
        warteraum.enqueue(pW);
        warteraum1.enqueue(pW1);
    }
    
    public void kundeIstDran(){
        warteraum.dequeue();
        warteraum1.dequeue();
    }
    
    public boolean keineKunden(){
        return warteraum.isEmpty() | warteraum1.isEmpty();
    }
    
    public int aktNummer(){
        return warteraum.front().getNummer() | warteraum1.front().getNummer();
    }
    
    //-----------------------------
    
    

    // Dienste

}