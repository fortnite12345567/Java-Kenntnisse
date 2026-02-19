
/**
 * @author 
 * @version 
 */
public class Kochbuch
{
    private BinarySearchTree <Rezept> rezeptbaum;
    private List<Zutaten> zutatenliste;
    public Kochbuch(){}
    public void baumAufstellen(){
        rezeptbaum.insert(new Rezept("M"));
        rezeptbaum.insert(new Rezept("C"));
        rezeptbaum.insert(new Rezept("R"));
        rezeptbaum.insert(new Rezept("A"));
        rezeptbaum.insert(new Rezept("E"));
        rezeptbaum.insert(new Rezept("R"));
        rezeptbaum.insert(new Rezept("T"));
        rezeptbaum.insert(new Rezept("N"));
        rezeptbaum.insert(new Rezept("K"));
    }
    public void suche(String pSchluessel){
        Rezept pRezept = new Rezept(pSchluessel);
        rezeptbaum.search(pRezept);
    }
    public void getZutaten(String pSchluessel){
        if(suche(pSchluessel = null)){
            suche(pSchluessel).getzList().toFirst();
            while(suche(pSchluessel).getzList().hasAccess()){
            }
        }
    }
}