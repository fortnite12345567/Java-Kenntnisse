
/**
 * @author 
 * @version 
 */
public class Verkehrskontrolle
{
    Queue<Fahrzeug> angehalteneQueue;
    Queue<Fahrzeug> kontrollQueue;
    int mängel;
    int anzahlKontrolle;
    public void Verkehrskontrolle(){}
    public void hinzufügen(Fahrzeug pF){
        kontrollQueue.enqueue(pF);
    }
    public void weiterfahren(){
        kontrollQueue.dequeue();
    }
    public void weiterleiten(Fahrzeug pF){
        angehalteneQueue.enqueue(kontrollQueue.front());
        kontrollQueue.dequeue();
    }
    public boolean verkehrstauglichkeitPrüfen(){
        if(angehalteneQueue.front().getVerkehrstauglichkeit() == false){
            mängel += mängel;   
        }
        anzahlKontrolle += anzahlKontrolle;
        angehalteneQueue.dequeue();
        return angehalteneQueue.front().getVerkehrstauglichkeit();
    }
    public void auflösen(){
        while(kontrollQueue.front() != null){
            kontrollQueue.dequeue();
        }
    }
}