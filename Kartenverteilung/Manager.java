
/**
 * @author 
 * @version 
 */
public class Manager
{
    Spieler spieler1;
    Spieler spieler2;
    
    public Manager(Spieler pSpieler1, Spieler pSpieler2)
    {   
        spieler1 = pSpieler1;
        spieler2 = pSpieler2;
    }
    
    public Spieler getGewinner(int sP1, int sP2){
        if(spieler1.getHand()[sP1].getStaerke()< spieler2.getHand()[sP2].getStaerke()){
            return spieler2; 
        }
        else
        {
            return spieler1;
        }
    }

    // Dienste

}