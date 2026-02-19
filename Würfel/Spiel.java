import java.util.Random;
/**
 * @author 
 * @version 
 */
public class Spiel
{
    private Random random = new Random();
    private int array[][]  = new int [4][5];
    private int würfeln;
    
    public Spiel(){}
    
    public void würfeln(){
        System.out.println("");
        for(int eintragen=0; eintragen < array.length; eintragen++){
            for(int eintragen1=0; eintragen1 < array[eintragen].length; eintragen1++){
                würfeln = random.nextInt(5)+1;
                array[eintragen][eintragen1] = würfeln;
            }
        }
        for(int y=0; y <  4; y++){
            System.out.println("");
            for(int x=0; x < 5; x++){
                System.out.print(array[y][x]);   
            }
        }
        System.out.println("");
    }
    
    public void besterDurchgang(){
        for(int durchgang = 0; durchgang < array.length; durchgang++)
        {
            
        }
    }
}
