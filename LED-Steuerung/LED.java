
/**
 * @author 
 * @version 
 */
public class LED
{
    protected boolean leuchtet;
    public LED(boolean pLeuchtet){
        leuchtet = pLeuchtet;
    }
    public void lichtAn(){
        leuchtet = true;
    }
    public void lichtAus(){
        leuchtet = false;
    }
}