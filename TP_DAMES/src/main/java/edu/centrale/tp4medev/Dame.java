package edu.centrale.tp4medev;

public class Dame {
    public Dame(){
        super();
    }

    /**
     * Constructeur d'une nouvelle Dame (pour la couleur : 1 = blanc, 0 = noir)
     */
    public Dame(boolean couleur) {
        super(couleur);
    }

    public boolean deplace_possible(Case i, Case f, Plateau p) {
        if (f.getPion() == null) {
            if (i.getX()+i.getY() == f.getX()+f.getY()) {
                // Cas d'une diagonale /
                if (i.getX()<=f.getX()) {
                    for (int j=i.getX()+1 ; j<f.getX() ; j++) {
                        if (p[j][i.getX()+i.getY()-j].getPion()==i.getPion()) {
                            return false;
                        }
                    }
                } else {
                    for (int j=f.getX()+1 ; j<i.getX() ; j++) {
                        if (p[j][i.getX()+i.getY()-j].getPion()==i.getPion()) {
                            return false;
                        }
                    }
                }
            } else if(i.getX()-i.getY() == f.getX()-f.getY()){
                // Cas d'une diagonale \
                if (i.getX()<=f.getX()) {
                    for (int j=i.getX()+1 ; j<f.getX() ; j++) {
                        if (p[j][j-i.getX()+i.getY()].getPion()==i.getPion()) {
                            return false;
                        }
                    }
                } else {
                    for (int j=f.getX()+1 ; j<i.getX() ; j++) {
                        if (p[j][j-i.getX()+i.getY()].getPion()==i.getPion()) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }


    @Override
    public void manger(Case) {

    }

    @Override
    public void deplacer(Case i, Case f) {
        
    }
}
