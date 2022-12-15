package edu.centrale.tp4medev;

import java.util.LinkedList;
import java.util.List;

public class Plateau {
    private int nbCol;
    private int nbRow;
    private List<List<Case>> plateau;

    public Plateau() {
        nbCol = 10;
        nbRow = 10;
        plateau = new LinkedList<>();
        initPlateau(plateau);
    }

    private void initPlateau(List<List<Case>> plateau2) {
        for (int i = 0; i < nbCol; i++) {
            List<Case> row = new LinkedList<>();
            for (int j = 0; j < nbRow; j++) {
                if (i + j % 2 == 1) {
                    if (i < 5) {
                        row.add(new Case(i, j, new Pion(true)));
                    } else if (i > 6) {
                        row.add(new Case(i, j, new Pion(false)));
                    } else {
                        row.add(new Case(i, j, null));
                    }
                } else {
                    row.add(new Case(i, j, null));
                }
            }
        }
    }

}
