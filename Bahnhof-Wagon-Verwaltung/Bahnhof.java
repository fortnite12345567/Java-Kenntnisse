
/**
 * @author 
 * @version 
 */
public class Bahnhof
{
    // Bezugsobjekte
    
    // Attribute
    Stack<Integer> A; 
    Stack<Integer> B;
    Stack<Integer> C;
    // Konstruktor
    public Bahnhof()
    {
        A = new Stack<Integer>();
        B = new Stack<Integer>();
        C = new Stack<Integer>();
        A.push(14);
        A.push(15);
        A.push(11);
        A.push(16);
    }

    // Dienste
    public void Sortieren(){
        if(!(A.isEmpty() && B.isEmpty())){
            int i = A.top();
            // Durchlauf von Gleis A und Übergaben der Elemente in Gleis B
            while(!A.isEmpty()){
                // Suche nach kleinsten Element von Gleis A
                if(i > A.top()){
                   i = A.top();
                }
                B.push(A.top());
                A.pop();
            }
            // Durchlauf von Gleis B
            while(!B.isEmpty()){
                if(B.top() == i){ // Suche nach kleinsten Element in Gleis B 
                   C.push(B.top()); // Übergabe des kleinsten Elementes in Gleis C
                   B.pop();
                }else{
                   A.push(B.top()); // Übergabe in Gleis A
                   B.pop();
                }
            }  
        }else{
            System.out.println("In Gleis A und B befinden sich keine Waggons");
        }
    }
}