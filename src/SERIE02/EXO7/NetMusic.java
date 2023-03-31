package SERIE02.EXO7;
import java.util.ArrayList;

public class NetMusic {
    private  ArrayList<CompteNetMusic>  comptes;



    public NetMusic(ArrayList<CompteNetMusic>  comptes)
    {
        this.comptes=comptes;
       
    }


    public CompteNetMusic authentifier(String userID,String Password)
    {
        boolean stop=false;
        CompteNetMusic compte=null;
        int i=0;
         while( i<this.comptes.size() && stop==false)
         {
            if(comptes.get(i).getUserID().equals(userID))
            {
                if(comptes.get(i).getPassword().equals(Password))
                {

                    compte=comptes.get(i);
                    stop=true; 
                }
                else
                {
                    System.out.println("Le mot de passe est incorrect");
                }
            }
            i++;
         }
         if(compte==null)
         {
            System.out.println("Le compte est innexistant");
         }
         return compte;
    }
   

    public void ajouterCompteNetMusic(CompteNetMusic compteNetMusic)
    {
        
           if(existeClient(compteNetMusic.getClient()))
           {
            System.out.println("Ce client existe dejà");
            
           }
           else
           {
              if(existeUserID(compteNetMusic))
              {
                System.out.println("Le nom d'utilisateur "+ compteNetMusic.getUserID() +" exite déjà");
              }
              else
              {
                this.comptes.add(compteNetMusic);
                System.out.println("Le compte a bien été creer");
              }
           }

    }

    public void afficherComptes()
    {
        for(int i=0;i<comptes.size();i++)
        {
            System.out.println("userID :"+comptes.get(i).getUserID()+ "\n");
            System.out.println("Nom du client :"+comptes.get(i).getClient().getNom()+ "\n");
            System.out.println("Prenom du client :"+ comptes.get(i).getClient().getPrenom());
            System.out.println("------------------------------------------------");
            
        }
        
    }


    public void supprimerCompteNetMusic(CompteNetMusic CompteNetMusic)
    {
        this.comptes.remove(CompteNetMusic);
    }

    public boolean existeClient(Client client)
    {
        boolean existe=false,stop=false;
        CompteNetMusic monCompte;
        int i=0;
        while(i<this.comptes.size() && stop==false)
        {
            monCompte=this.comptes.get(i);
            if(monCompte.getClient().getNom().equals(client.getNom()))
            {
                if(monCompte.getClient().getPrenom().equals(client.getPrenom()) && monCompte.getClient().getAdresse().equals(client.getAdresse()))
                {
                   existe=true;
                   stop=true;
                }
            }
            i++;
        }
        return existe;
    }
    
    public boolean existeUserID(CompteNetMusic compte)
    {
        boolean existe=false,stop=false;
        CompteNetMusic monCompte;
        int i=0;
       while(i<this.comptes.size() && stop==false)
        {
            monCompte=this.comptes.get(i);
            if(monCompte.getUserID().equals(compte.getUserID()))
            {
             
                   existe=true;
                   stop=true;
          
            }
            i++;
        }
        return existe;
    }
    
}
