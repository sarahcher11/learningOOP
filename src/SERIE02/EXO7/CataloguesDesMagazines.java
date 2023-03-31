package SERIE02.EXO7;

import java.util.ArrayList;

public class CataloguesDesMagazines implements Catalogue{

   private ArrayList<Magazine> magazines;

public CataloguesDesMagazines(ArrayList<Magazine> magazines) {
    this.magazines = magazines;
}
  
public ArrayList<Magazine> getMagazines() {
    return magazines;
}

@Override
public void ajouterProduit(Produit produit) {
    if(!rechercherMagazine((Magazine)produit))
    {
        this.magazines.add( (Magazine) produit);
    }
    else
    {
        System.out.println("Ce magazine existe déjà");
    }
    
}

@Override
public void supprimerProduit(Produit produit) {
    if(rechercherMagazine((Magazine) produit))
    {
        this.magazines.remove((Magazine)produit);
    }
    else
    {
        System.out.println("Ce magazine n'existe pas");
    }
    
}
@Override
public void consulter() {
    
    for(int i=0;i<this.magazines.size();i++)
    {
        System.out.println("----------------------------------");
        this.magazines.get(i).afficherMagazine();
    }
}

public boolean rechercherMagazine(Magazine magazine)
{
    boolean existe=false;
    int i=0;
    while(i<this.magazines.size() && existe==false)
    {
        if(this.magazines.get(i).getTitre().equals(magazine.getTitre()))
        {
            existe=true;
        }
    }
    return existe;
}
   

}
