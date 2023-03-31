package SERIE02.EXO7;

public abstract class Album extends Produit{
    private String nomAuteur;
    private String nomMaisonDeProduction;
    private int anneeEdition;
    private String[] sons;
    private double prix;
    private Style style;

    public double getPrix() {
        return prix;
    }
 

    public Album(String titre,String nomAuteur,String nomMaisonDeProduction,int anneeEdition,String[] sons,Double prix,Style style)
    {
       super(titre);
        this.anneeEdition=anneeEdition;
        this.nomMaisonDeProduction=nomMaisonDeProduction;
        this.prix=prix;
        this.nomAuteur=nomAuteur;
        this.sons=sons;
        this.style=style;
    }

    public void afficherAlbum()
    {
       super.afficher();
        System.out.println("L'auteur :"+nomAuteur);
        System.out.println("Annee d'edition :"+ anneeEdition);
        System.out.println("prix :"+ prix);
        System.out.println("Les sons de l'album");
        afficherSons();
        System.out.println("Maison de production :"+ nomMaisonDeProduction);
    }


    public String[] getSons() {
        return sons;
    }
     

  public void afficherSons()
    {
        for (int i=0;i<this.sons.length;i++)
        {
            System.out.println(this.sons[i]);
        }
    }

    public Style getStyle() {
        return style;
    }
     
    


    
}
