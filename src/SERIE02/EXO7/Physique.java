package SERIE02.EXO7;

public class Physique extends Album implements Remboursable{
    private final int delai=7;
    private final int pourcentage=10;
    private double prixLivraison;
    private int nombreAlbumsPhysiques;



     // constructeur d'un album physique
    public Physique(String titre,String nomAuteur,String nomMaisonDeProduction,int anneeEdition,String[] sons,double prix,Style style,double prixLivraison,int nombreAlbumsPhysiques)
    {
        super(titre, nomAuteur, nomMaisonDeProduction, anneeEdition, sons, prix,style);
        this.prixLivraison=prixLivraison;
        this.nombreAlbumsPhysiques=nombreAlbumsPhysiques;
    }



    // Calculer le prix d'un album physique
    @Override
    public  double calculerPrix(Produit produit)
    {
           Album album=(Album) produit;
            double prix;
            prix=(album.getPrix()+this.prixLivraison) *(1-(pourcentage/100) );
           return prix;
    }

    // get le delai
    public int getDelai() {
        return delai;
    }


    //Echanger un album

    public void echanger(Produit album1,Produit album2,int nbrJourDepuisAchat,CompteNetMusic compte)
    {
        double prix;
        if(nbrJourDepuisAchat<=delai)
        {
            if(album1.getPrix()>album2.getPrix())
            {
                prix=album1.getPrix()-album2.getPrix();
                compte.crediter(prix);
            }
            else
            {
                if(album1.getPrix()<album2.getPrix())
                {
                    prix=album2.getPrix()-album1.getPrix();
                    compte.debiter(prix);
                }
            }

        }
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

    public int getNombreAlbumsPhysiques() {
        return nombreAlbumsPhysiques;
    }


    

    
}
