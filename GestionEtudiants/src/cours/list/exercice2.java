/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours.list;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;


/**
 *
 * @author Fatima
 */
public class exercice2 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        List<String> lString=new ArrayList();
        
        lString.add("Dielo Ba");
        lString.add("Couty Ndiaye");
        lString.add("Hawa lom");
        
        lString.add("Moustapha Der");
        lString.add("Mouhamed Sangare");
        lString.add("Daouda Samb");
        
        
            System.out.println("affichage liste personnes : ");
                lString.forEach((elt) -> {
                System.out.println(elt);
                });
                
              
                

        
    }
    
}
