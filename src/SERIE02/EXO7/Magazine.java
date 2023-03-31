package SERIE02.EXO7;
public  class  Magazine extends Produit implements Remboursable {

    private int numero;
    private String sommaire;
    private int AnneeApparition;
    private String url;
    private final int delai=7;
    private final double prixLivraison=200;
    private final int pourcentage=5;

    public Magazine(String titre,double prix, int numero, String sommaire, int anneeApparition, String url) {
        super(titre);
        super.setPrix(prix);
        this.numero = numero;
        this.sommaire = sommaire;
        AnneeApparition = anneeApparition;
        this.url = url;
      
    }
    

    public void  afficherMagazine()
    {
        System.out.println("numero         " + this.numero);
        System.out.println("sommaire       " + this.sommaire);
        System.out.println("anneeApparition" + this.AnneeApparition);
        System.out.println("url            " + this.url);
    }

    public int getNumero() {
        return numero;
    }
    public void setSommaire(String sommaire) {
        this.sommaire = sommaire;
    }
    public String getUrl() {
        return url;
    }
    public int getAnneeApparition() {
        return AnneeApparition;
    }

    @Override
    public double calculerPrix(Produit produit) {
        
         double prix =produit.getPrix()*(this.pourcentage)+this.prixLivraison;
        return prix;
    }

    @Override
    public boolean rembourser(CompteNetMusic compte,int nbrJourDepuisAchat)
    {
        double prixremboursement;
        boolean trouv=false;
        for (Produit album : compte.getMesAchats().keySet()) {
         
            if (album.getTitre().equals(this.getTitre()) && nbrJourDepuisAchat<=delai) {
                 trouv=true;
                 prixremboursement= this.getPrix() *(pourcentage/100);
                 compte.crediter(prixremboursement); 
            }
        }
        return trouv;

    }

    
}
