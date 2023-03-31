package SERIE01.EXO09;

public class Salles {
    private int numeroSalle;
    private final int capacite=40;
    private int nbDePlacesOccupees;
    private Seance[] seances;

    public Salles(int numeroSalle,Seance[] seances)
    {
        this.numeroSalle=numeroSalle;
        this.seances=seances;
    }

    public int getNbDePlaceOccupees()
    {
        return nbDePlacesOccupees;
    }
    public void afficherSeances()
    {
        for (int i=0;i<=seances.length;i++){
            System.out.println("La seance num " + seances[i].getNumeroSeance());
        }
       
    }

    public boolean reserver(int numeroClient,int nbDePlaces){

        if(this.nbDePlacesOccupees<capacite)
        {
            this.nbDePlacesOccupees++;
            return true;

        }
        else
        {
            return false;
        }
    }
    public int getNumeroSalle() {
        return numeroSalle;
    }
     

    
}
