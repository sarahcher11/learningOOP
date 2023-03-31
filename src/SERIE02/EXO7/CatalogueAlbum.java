package SERIE02.EXO7;

import java.util.ArrayList;
public class CatalogueAlbum implements Catalogue{

     private ArrayList<Categories> categories; 


    public CatalogueAlbum(ArrayList<Categories> categories) {
        this.categories=categories;
    }

    public void ajouterProduit(Produit album1)
    {
        Album album=(Album) album1;
        int[] tab= new int[2];
        Categories categorie;
         tab = existeAlbum(album);
        if(tab[0]==-1)
        {
            ArrayList<Album> albums=new ArrayList<Album>();
            albums.add(album);
            Categories categories=new Categories(albums,album.getStyle());
            this.categories.add(categories);
        }
        else
        {
            if(tab[0]!=-1 && tab[1]==(-1))
            {
                categorie=this.categories.get(tab[0]);
                categorie.getLesAlbums().add(album);
            }
        }
    }

    /*public boolean existeAlbum(Album album)
    {
        boolean existe=false,stop=false;
        ArrayList<Album> myAlbums;
        int i=0;
       while(i<catalogueAlbum.size() && stop==false)
       {
          myAlbums=catalogueAlbum.keySet(style);
          if(myAlbums.getTitre().equals(album.getTitre()))
          {
            existe=true;
            stop=true;
          }
       }
       return existe;

    }*/


    public void consulter()
    {
        for (int i=0;i<this.categories.size();i++)
        {
            System.out.println("Style  :"+this.categories.get(i).getStyle());
            System.out.println("----------------------------------------");
            this.categories.get(i).afficherAlbum();
            System.out.println("________________________________________");
        }
    }

    public int[] existeAlbum(Album album)
    {
        int i=0,j=0;
        int indexI=-1;
        int indexJ=-1;
        boolean stop=false,trouv=false;
        String titre;
        int[] tab=new int[2];

        while(i<this.categories.size() && stop==false)
        {
            if(this.categories.get(i).getStyle().equals(album.getStyle()))
            {
                while(j<this.categories.get(i).getLesAlbums().size() && trouv==false)
                {
                    titre=this.categories.get(i).getLesAlbums().get(j).getTitre();
                    if(titre.equals(album.getTitre()))
                    {
                        trouv=true;
                        indexJ=j;
                       
                       
                    }
                    j++;
                }
               indexI=i;
               stop=true;
               
            }
            i++;
        }
       
        tab[0]=indexI;
        tab[1]=indexJ;

        return tab;
    }

    public void supprimerProduit(Produit produit)
    {
       
        int tab[];
        Categories categorie;
        Album album;
         tab = existeAlbum((Album) produit);
         if (tab[0]!=-1 && tab[1]!=-1)
         {
              categorie=this.categories.get(tab[0]);
              album=categorie.getLesAlbums().get(tab[1]);
              categorie.getLesAlbums().remove(album);

         }
    
       
    }

    
    
}

    

