
/**
 * @author 
 * @version 
 */
public class Test
{
    public BinaryTree<Integer> dc;
    
    public Test(){}
    
    public void setBinaryTreeUp(){
        dc = new BinaryTree<Integer>(5);
        
        dc.setRightTree(new BinaryTree<Integer>(9,
        
        new BinaryTree<Integer>(6,
        new BinaryTree<Integer>(), new BinaryTree<Integer> (7)), 
        
        new BinaryTree<Integer>(11,
        new BinaryTree<Integer> (10), new BinaryTree<Integer>())));
        
        dc.setLeftTree(new BinaryTree<Integer>(3));
    }
    
    int finn = 0;
    public void preOrder(int pFinn , BinaryTree<Integer> pDc){
        if(pDc == null || pDc.isEmpty()){
            return;
        }
        pFinn++;
        if(pFinn == 0){
            System.out.print("           finn is 0 "); 
        }
        if(pFinn == 1){
            System.out.print("           "); 
        }
        if(pFinn == 2){
            System.out.println("          / \\ finn is 2 ");
            System.out.print("         ");
        }
        if(pFinn == 3){
            System.out.print("           finn is 3  ");
        }
        if(pFinn == 4){
            System.out.print("           finn is 4  ");
        }
        if(pFinn == 5){
            System.out.print("           finn is 5  ");
        }
        System.out.println(pDc.getContent());
        preOrder(pFinn, pDc.getLeftTree());
        preOrder(pFinn, pDc.getRightTree());
    }
    
    public void ausgeben(BinaryTree<Integer> pDc){
        System.out.print("\u000C");
        preOrder(finn, pDc);
    }
    
    

    // Dienste

}