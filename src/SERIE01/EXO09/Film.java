package SERIE01.EXO09;

public class Film {

    private String titreDuFilm;
    private int anneeDeProduction;
    private String realisateur;
    private String[] nomDesActeurs;
    private String Synopsis;


    public Film(String titreDuFilm,int anneeDeProduction,String realisateur,String[] nomDesActeur)
    {
        this.titreDuFilm=titreDuFilm;
        this.anneeDeProduction=anneeDeProduction;
        this.realisateur=realisateur;
        this.nomDesActeurs=nomDesActeur;
    }

    public void afficherFilm(){
        System.out.println("Titre                    :"+ this.titreDuFilm);
        System.out.println("Annee de prodution       :"+ this.anneeDeProduction);
        System.out.println("realisateur              :"+ this.realisateur);
        System.out.println("Synopsis                 :"+ this.Synopsis);
        for (int i=0;i<nomDesActeurs.length;i++){
            System.out.println("Acteur " +i+ ""+nomDesActeurs[i]);

        }

        
    }

    
}
