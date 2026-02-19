
/**
 * @author 
 * @version 
 */
public class Karte
{
    private String name;
    private int st;
    private int gk;
    private int sk;
    public Karte(String pName, int pSt, int pGk, int pSk)
    {
        name = pName;
        st = pSt;
        gk = pGk;
        sk = pSk;
    }
    
    public String getName(){
        return name;
    }
    
    public int getStaerke(){
        return st;
    }
    
    public int getGeisteskraft(){
        return gk;
    }
    
    public int getSchnelligkeit(){
        return sk;
    }
}