package toucan.modele;
/**
 * author: Mathieu levy
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Case {
    private int x ;
    private int y ;
    private int noCase ;

    private ArrayList<Mouvement> lesMouvements;


    //faire une fonction qui deplace reellement la case

    /**
     * Constructeur d'une case
     * @param x position en x sur la grille
     * @param y position en y sur la grille
     * @param noCase numero de la case qui doit etre unique
     */
    public Case(int x, int y, int noCase){
        this.x = x ;
        this.y = y ;
        this.noCase = noCase ;
        lesMouvements = new ArrayList<>() ;
    }

    /**
     * Permet de faire monter ou descendre(si depY est negatif) une case
     * @param depY la valeur de la prochaine position de la case
     */
    public void monter(int etape, int depY){
        lesMouvements.add(new Mouvement(etape, 0, depY));
    }

    /**
     * Permet de deplacer a droite ou a gauche(si depX est negatif) une case
     * @param depX
     */
    public void droite(int etape, int depX){
        lesMouvements.add(new Mouvement(etape, depX, 0));
    }

    /**
     * Astuce: nous n'avons besoin que de la premiere etape de l'arraylist
     * puisque les numeros des suivantes sont forcement superieures.
     * Verifie qu'il y a un mouvement disponible, si oui,
     * regarde le numero d'etape du mouvement.
     * @param etapeActuelle le numero de l'etape actuelle
     * @return true si c'est l'etape actuelle
     */
    public boolean monTour(int etapeActuelle){
        boolean res = false;
        if(lesMouvements.size() > 0) {
            if (lesMouvements.get(0).getNoEtape() == etapeActuelle) {
                res = true;
            }
        }
        return res;
    }

    /**
     * fonction a appeler pour deplacer la case.
     * verifie que c'est bien le tour de la case puis la deplace.
     * @param etapeActuelle
     */
    public void deplacementCase(int etapeActuelle){
        if(monTour(etapeActuelle)){
            int nextX = getX();
            int nextY = getY();
            nextX += lesMouvements.get(0).getDeplacementX();
            nextY += lesMouvements.get(0).getDeplacementY();
            setX(nextX);
            setY(nextY);
        }

    }

    /**
     * Private car les mouvements en x sont gere par droite
     * @param x
     */
    private void setX(int x) {
        this.x = x;
    }

    /**
     * Private car les mouvements en y sont gere par monter
     * @param y
     */
    private void setY(int y) {
        this.y = y;
    }

    /**
     * getter
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * getter
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * getter
     * @return le numero de la case
     */
    public int getNoCase() {
        return noCase;
    }

    public ArrayList<Mouvement> getLesMouvements() {
        return lesMouvements;
    }

    @Override
    public String toString() {
        return "Case{" +
                "noCase=" + noCase +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

}