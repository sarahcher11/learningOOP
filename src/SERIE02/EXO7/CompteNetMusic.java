package SERIE02.EXO7;

import java.util.ArrayList;
import java.util.HashMap;

public class CompteNetMusic {
    private String userID;
    private String Password;
    private double solde;
    private ArrayList<Produit> panier;
    private HashMap<Produit,String> mesAchats;// les albums et leurs Dates d'achats
    private Client client;

    public CompteNetMusic(String userID,String Password,double solde,Client client)
    {

        this.userID=userID;
        this.Password=Password;
        this.solde=solde;
        this.client=client;

    }
    //s'authentifier au compteNetMusic
   

    public String getUserID() {
        return userID;
    }
    

     public double getSolde()
     {
        return this.solde;
     }


     public ArrayList<Produit> getPanier()
     {
        return this.panier;
     }

     public void crediter(double valeur)
     {
        this.solde=this.solde+valeur;
     }

     public boolean debiter(double valeur)
     {
        boolean operationReussie=false;
        if(this.solde>=valeur)
        {
            this.solde=this.solde-valeur;
            operationReussie=true;
        }
        return operationReussie;
     
     }

     public void AjouterAupanier(Album album)
     {
        this.panier.add(album);
     }


     public boolean acheter(Produit produit,String date)
     {
        Boolean operationFaite=false;
        if (debiter(produit.getPrix()))
        {
            this.mesAchats.put(produit, date);
            operationFaite=true;
        
        }
       return operationFaite;
     
     }
     public String getPassword() {
         return Password;
     }
     public Client getClient() {
         return client;
     }
     public void setPanier(ArrayList<Produit> panier) {
         this.panier = panier;
     }
     public void setMesAchats(HashMap<Produit, String> mesAchats) {
         this.mesAchats = mesAchats;
     }
     public HashMap<Produit, String> getMesAchats() {
         return mesAchats;
     }
     

     


    

    
}
