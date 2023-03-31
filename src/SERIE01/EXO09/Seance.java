package SERIE01.EXO09;

public class Seance {
    private int numeroSeance;
    private String heureDebut,heureFin;
    private int tarifs;
    private Film film;

    public int getNumeroSeance(){
        return numeroSeance;
    }

    public Seance(int numeroSeance,String heureDebut,String heureFin,int tarifs){
        this.tarifs=tarifs;
        this.heureFin=heureFin;
        this.heureDebut=heureDebut;
        this.numeroSeance=numeroSeance;
    }

    public void  afficherSeance(){
        System.out.println(this.numeroSeance);
        System.out.println(this.heureDebut);
        System.out.println(this.heureFin);
        System.out.println(this.tarifs);
    }

    public Film getFilm() {
        return film;
    }


    
    
}
