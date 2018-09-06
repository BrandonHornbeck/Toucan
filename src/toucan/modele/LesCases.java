package toucan.modele;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * @author Hornbeck Brandon
 */


public class LesCases {
    private ArrayList<Case> cases ;
    private static int tailleCote;

    static {
        tailleCote = 5;
    }

    /**
     * @param nbCases: nombre de cases
     */
    public LesCases(int nbCases){
        Case c ;
        cases = new ArrayList<>(nbCases) ;
        for (int i = 0 ; i < nbCases; i++){
            c = new Case (i*tailleCote, 0, i) ;
            cases.add(c);
        }
    }

    /**
     *
     * @param noCase numéro de la case recherchée
     * @return la case avec le numero
     * @throws NoSuchElementException
     */
    public Case getCase (int noCase) throws NoSuchElementException{
        if (noCase >= cases.size() || noCase < 0) throw new NoSuchElementException() ;
        else {
            Case res = null;
            for (Case c : cases){
                if (noCase == c.getNoCase()){
                    res = c ;
                }
            }
            return res ;
        }
    }

    /**
     * fait avancer une case vers la droite
     * @param noCase
     * @param etape
     * @param dep
     */

    public void droite (int noCase, int etape, int dep) {
        try {
            getCase(noCase).droite(etape,dep) ;
        }
        catch (NoSuchElementException nse){

        }
    }

    public int getNbCases () {
        return cases.size() ;
    }

    @Override
    public String toString() {
        return "LesCases{" +
                "cases=" + cases +
                '}';
    }
}
