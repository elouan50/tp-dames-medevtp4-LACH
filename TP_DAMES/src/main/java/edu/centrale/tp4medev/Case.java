package edu.centrale.tp4medev;

public class Case {

    private int x;
    private int y;
    private Pion p;

    public Case(int x, int y, Pion p){
        this.x = x ;
        this.y = y ;
        this.p = p ;
    }

    public boolean jouable(){
        boolean jouable;
        if ((x+y)%2==0){
            jouable = false;
        }
        else { jouable = true;}
        return jouable;
    }

}
