package fr.btsciel.personnes.basicclasses;

import fr.btsciel.personnes.enums.Gender;
import fr.btsciel.personnes.enums.Rank;

public class Coureur extends Personnes {

    private int temps;
    private Rank rank;

    public Coureur(String nom, String prenom, Gender gender, Rank rank) {
        super(nom, prenom, gender);
        this.temps = getTemps();
        this.rank = getRank();
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
