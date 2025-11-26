package fr.btsciel.personnes.basicclasses;

import fr.btsciel.personnes.enums.Gender;

public class Personnes {
    private String nom;
    private String premom;
    private Gender gender;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Personnes(String nom, String premom, Gender gender) {
        this.nom = nom;
        this.premom = premom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPremom() {
        return premom;
    }

    public void setPremom(String premom) {
        this.premom = premom;
    }
}