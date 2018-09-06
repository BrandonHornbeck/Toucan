package toucan.modele;

/**
 * @author Brandon Hornbeck
 */
public class Toucan {
    private LesCases lesCases ;
    private int nombreTotalDEtapes ;
    static {
        int NORD = 0 ;
        int SUD = 1 ;
        int OUEST = 2 ;
        int EST = 3 ;
    }
    public Toucan (int nbCases){
        lesCases = new LesCases(nbCases) ;
        nombreTotalDEtapes = 0 ;
    }

    /**
     *
     * @param noCase
     * @param direction : NORD, SUD, OUEST ou EST
     * @param dep
     */
    public void ajouterMouvement (int noCase, int direction, int dep){
        switch (direction){
            case 0 : break ;
            case 1 : break ;
            case 2 : break ;
            case 3 : lesCases.droite(noCase, ++nombreTotalDEtapes, dep) ;
            default: break ;
        }
    }

    public LesCases getLesCases() {
        return lesCases;
    }

    public int getNombreTotalDEtapes() {
        return nombreTotalDEtapes;
    }

    @Override
    public String toString() {
        return "Toucan{" +
                "lesCases=" + lesCases +
                ", nombreTotalDEtapes=" + nombreTotalDEtapes +
                '}';
    }
}
