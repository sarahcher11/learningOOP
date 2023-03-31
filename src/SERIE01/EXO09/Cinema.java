package SERIE01.EXO09;

public class Cinema {
    private String nom;
    private String adresse;
    private Salles[] salles;
    private ClientFidele[] clientFideles;

    public Cinema(String nom,String adresse){
             this.nom=nom;
             this.adresse=adresse;
    }

    public void setSalles(Salles[] salles)
    {
        this.salles=salles;
    }

    public void afficherCinema(){
        System.out.println(this.nom);
        System.out.println(this.adresse);
        System.out.println(this.salles);
    }
    public ClientFidele[] getClientFideles()
    {
        return this.clientFideles;
    }
    public void afficherClient(){
    }

    public boolean isFideles(ClientFidele clientFidele)
    {
        boolean a=false;
        for (int i=0;i<clientFideles.length;i++)
        {
            if(this.clientFideles[i].equals(clientFidele))
            {
                a=true;
            }
           
        }
        return a;
    }
    
}
