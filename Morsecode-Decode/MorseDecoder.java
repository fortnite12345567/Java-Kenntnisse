
/**
 * @author 
 * @version 
 */
public class MorseDecoder
{
    BinaryTree<Character> dc;
    public MorseDecoder()
    {
    
    }
    
    public void setBinarayTreeUp(){
        dc = new BinaryTree<Character>();
        
        //#Rechter Baum
        
        dc.setRightTree(new BinaryTree<Character>('T',
        
        new BinaryTree<Character>('N',
        new BinaryTree<Character>('D', new BinaryTree<Character>('B'), new BinaryTree<Character>('X')),
        new BinaryTree<Character>('K', new BinaryTree<Character>('C'), new BinaryTree<Character>('Y'))),
        
        new BinaryTree<Character>('M',
        new BinaryTree<Character>('G', new BinaryTree<Character>('Z'), new BinaryTree<Character>('Q')),
        new BinaryTree<Character>('O'))));
        
        
        //#Linker Baum
        
        dc.setLeftTree(new BinaryTree<Character>('E',
        
        new BinaryTree<Character>('I',
        new BinaryTree<Character>('S', new BinaryTree<Character>('H'), new BinaryTree<Character>('V')),
        new BinaryTree<Character>('U', new BinaryTree<Character>('F'), new BinaryTree<Character>())),
        
        new BinaryTree<Character>('A',
        new BinaryTree<Character>('R', new BinaryTree<Character>('L'), new BinaryTree<Character>()),
        new BinaryTree<Character>('W', new BinaryTree<Character>('P'), new BinaryTree<Character>('J')))));
        
    }
    
    public void decoder(String morsecode){
        BinaryTree<Character> zs = dc;
        for(int i = 0; i<morsecode.length();i++){
            if(morsecode.charAt(i) == '.'){
                zs = zs.getLeftTree();
            }
            else
            {
                zs = zs.getRightTree();
            }
            System.out.println(zs);
        }
    }
}