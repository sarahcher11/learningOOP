package SERIE02.EXO7;

public abstract class Produit {
    private String titre;
    //public abstract void echanger(Produit album1,Produit album2,int nbrJourDepuisAchat,CompteNetMusic compte);
    double prix;
    public double getPrix() {
        return prix;
    }
    public String getTitre() {
        return titre;
    }
    public Produit(String titre)
    {
        this.titre=titre;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void afficher()
    {
        System.out.println("LE TITRE " + this.titre);
    }
    public abstract double calculerPrix(Produit produit);

    

    
}
