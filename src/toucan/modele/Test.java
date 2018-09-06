package toucan.modele;
/**
 * @author Hornbeck Brandon
 */
public class Test {
    public static void main (String[] args){
        testAjouterMouvement();
    }
    private static void testAjouterMouvement (){
        Toucan toucan = new Toucan(4) ;
        toucan.ajouterMouvement(2, 3, 3);
        assert toucan.getNombreTotalDEtapes() ==1 : "Le nombre d'Etapes n'est pas le bon" ;
        assert toucan.getLesCases().getCase(2).getLesMouvements().get(0).equals(new Mouvement(1, 3, 0)) : "Le mouvement n'est pas le bon" ;

    }
}
