package edu.centrale.tp4medev;

public class Case {

    private int x;
    private int y;
    private Pion p;

    /**
     * 
     */
    public Case() {
        x = 0;
        y = 0;
        p = null;
    }

    /**
     * @param x
     * @param y
     * @param p
     */
    public Case(int x, int y, Pion p) {
        this.x = x ;
        this.y = y ;
        this.p = p ;
    }

    public boolean jouable() {
        boolean jouable;
        if (((x+y)%2==0)||(p != null)){
            jouable = false;
        }
        else {jouable = true;}            
        return jouable;
    }

    public int getX() {
        return x;
    }

    public setX(int x) {
         this.x = x;
    }

    public int getY() {
        return y;
    }

    public setY(int y) {
        this.y = y;
    }

    public boolean getPion() {
        return p.getCouleur();
    }

    public setPion( Pion p) {
        this. p = p;
    }



}
