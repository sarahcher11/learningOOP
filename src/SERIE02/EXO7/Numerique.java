package SERIE02.EXO7;
public  class Numerique extends Album {
    private String url;
    private final int pourcentage=5;

    // Constructeur d'un album numérique

    public Numerique(String titre,String nomAuteur,String nomMaisonDeProduction,int anneeEdition,String[] sons,double prix,Style style,String url)
    {
        super(titre, nomAuteur, nomMaisonDeProduction, anneeEdition, sons, prix,style);
        this.url=url;
    }


    // calculer le prix d'un album numérique
    @Override
    public double calculerPrix(Produit album)
    {
        
        double prix;
        prix=album.getPrix()*(1-(pourcentage/100) );
       return prix;
    }


    //getters et setters
    public int getPourcentage() {
        return pourcentage;
    }

   

    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }
    

    
     


   
    
    
    
}
