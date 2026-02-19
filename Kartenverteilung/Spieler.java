
/**
 * @author 
 * @version 
 */
public class Spieler
{
    private Karte[] deck;
    private String name;
    private Karte gespielteKarte;
    private Karte t[][];
    
    public Spieler(String pName)
    {
        name = pName;
        deck = new Karte[5];
        gespielteKarte = null;
        t = new Karte[3][5];
        System.out.println(t[0].length);
    }
    
    
    public void printAktuellesDeck(){
        for(int x=0; x<deck.length; x++){
            for(int c=0; c<t[0].length; c++){
                 System.out.print(deck[x]);
                 t[0][c] = deck[x];
            }
        }
        System.out.print("fertig");
        for(int y=0; y <  5; y++){
            System.out.print(t[0][y]);              
        }
    }
    
    public void tausche(int pSpalte1, int pSpalte2){
        Karte speicher = t[0][pSpalte1];
        t[0][pSpalte1] = t[0][pSpalte2];
        t[0][pSpalte2] = speicher;        
    }
    
    public void umsortieren(){
        for(int i=1; i<t.length; i++){
            if(t[0][i-1] == null){
                tausche(i-1,i);
            }
        }
    }
    
    public String getName(){
        return name;
    }
    
    public Karte[] getHand(){
        return deck;
    }
    
    public Karte getKarte(int pI){
        return deck[pI];
    }
    
    public String karteSpielen(int pI){
        return deck[pI].getName();
    }
    
    public void karteZumDeck(Karte pK, int pI){
        deck[pI] = pK;
    }
}