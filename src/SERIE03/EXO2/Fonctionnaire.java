package SERIE03.EXO2;


public class Fonctionnaire implements AugmentationSalaire{
    protected String nom,prenom;
    protected double salaire;
    public Fonctionnaire(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

}
