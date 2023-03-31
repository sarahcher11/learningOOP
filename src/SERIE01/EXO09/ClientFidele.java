package SERIE01.EXO09;

public class ClientFidele {

    private String numeroClient;
    private int numeroSeance;
    

    public ClientFidele(String numeroClient,int numeroSeance) {
        this.numeroClient=numeroClient;
        this.numeroSeance=numeroSeance;
    }

    public void Afficher(){
        System.out.println(this.numeroClient);
        System.out.println(this.numeroSeance);
    }
}
