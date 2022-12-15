package edu.centrale.tp4medev;

public class Pion {
    private bool couleur; 
    // noir : 0 
    // blanc : 1 


    // Constructeurs 
    public Pion(){
        this.couleur=false; // couleur par défaut
    }

    public Pion(bool c){
        this.couleur=c;
    }

    //Getters
    public getCouleur(){
        return this.couleur;
    }

    //Setters 
    public setCouleur(bool c){
        this.couleur=c;
    }

    //Méthodes

    public void deplacer(Case ca, int dx, int dy){
        ca.setX(ca.getX()+dx);
        ca.setY(ca.getY()+dy);
    }
}
