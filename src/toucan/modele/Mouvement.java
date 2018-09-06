package toucan.modele;
/**
 * @author Hornbeck Brandon
 */
public class Mouvement {
    private int noEtape ;
    private int deplacementX ;
    private int deplacementY ;

    /**
     * Constructeur de Mouvement
     * @param noEtape : numéro d'etape
     * @param deplacementX : deplacement en X
     * @param deplacementY : deplacement en Y
     */
    public Mouvement(int noEtape, int deplacementX, int deplacementY){
        this.noEtape = noEtape ;
        this.deplacementX = deplacementX ;
        this.deplacementY = deplacementY ;
    }

    public int getNoEtape() {
        return noEtape;
    }

    public int getDeplacementX() {
        return deplacementX;
    }

    public int getDeplacementY() {
        return deplacementY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mouvement)) return false;

        Mouvement mouvement = (Mouvement) o;

        if (getNoEtape() != mouvement.getNoEtape()) return false;
        if (getDeplacementX() != mouvement.getDeplacementX()) return false;
        return getDeplacementY() == mouvement.getDeplacementY();
    }

    @Override
    public int hashCode() {
        int result = getNoEtape();
        result = 31 * result + getDeplacementX();
        result = 31 * result + getDeplacementY();
        return result;
    }

    @Override
    public String toString() {
        return "Mouvement{" +
                "noEtape=" + noEtape +
                ", deplacementX=" + deplacementX +
                ", deplacementY=" + deplacementY +
                '}';
    }
}
