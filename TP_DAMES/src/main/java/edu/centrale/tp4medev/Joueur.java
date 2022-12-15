package edu.centrale.tp4medev;

public class Joueur {

    private boolean couleur ;

    /**
     * @param plateau
     * @return
     */
    public int nbpion(Plateau plateau){
        int nbpion = 0;
        for (int i = 0; i < plateau.getNbCol(); i++) {
            for (int j = 0; j < plateau.getNbRow(); j++) {
               if (plateau.getPlateau().get(i).get(j).getPion().getCouleur()== couleur ) {
                nbpion++;
               }
            }
        }
        return nbpion;
    }

    public boolean getCouleur() {
        return this.couleur;
    }

    public void setCouleur(boolean couleur) {
        this.couleur = couleur;
    }
 
}
