
/**
 * @author 
 * @version 
 */
public class Containerschiff
{
    Stack<Container> turm1;
    Stack<Container> turm2;
    Stack<Container> turm3;
    Stack<Container> turm4;
    
    private int höhe;
    
    
    public Containerschiff(int pHöhe){
        höhe = pHöhe;
        
        turm1 = new Stack<Container>();
        turm2 = new Stack<Container>();
        turm3 = new Stack<Container>();
        turm4 = new Stack<Container>();
    }
    
    public void aufSchiffladen(Container pContainer){
        
    }
    
    public boolean schiffLeer(){
        if(turm1.isEmpty() && turm2.isEmpty() && turm3.isEmpty() && turm4.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean schiff(){
        return true;
    }
    
    public void ladungLöschen(){
        while(!turm1.isEmpty() && !turm2.isEmpty() && !turm3.isEmpty() && !turm4.isEmpty()){
            if(!turm1.isEmpty()){
                turm1.pop();
            }
            if(!turm2.isEmpty()){
                turm2.pop();
            }
            if(!turm3.isEmpty()){
                turm3.pop();
            }
            if(!turm4.isEmpty()){
                turm4.pop();
            }
        }
    }
}