package SERIE02.EXO7;

import java.util.ArrayList;

public class Categories {

    private ArrayList<Album> lesAlbums;
    private Style style;

    // Constructeur des catégories
    public Categories(ArrayList<Album> lesAlbums, Style style) {
        this.lesAlbums = lesAlbums;
        this.style = style;
    }


    //ajouter un album à la liste des albums (lesAlbums)
    
    public void ajouterUnAlbum(Album album)
    {
        if(!existeAlbum(album))
        {
            this.lesAlbums.add(album);
        }
    }


    // Verifier si un album existe bien dans la liste des albumes (lesAlbums)
    public boolean existeAlbum(Album album)
    {
        boolean existe=false,stop=false;
        Album myAlbum;
        if(this.style.compareTo(album.getStyle())==0)
        {
            int i=0;
            while(i<lesAlbums.size() && stop==false)
            {
               myAlbum=lesAlbums.get(i);
               if(myAlbum.getTitre().equals(album.getTitre()))
               {
                 existe=true;
                 stop=true;
               }
            }
        }
       
       return existe;

    }


    //getters et setters

    public Style getStyle() {
        return style;
    }


    public void setStyle(Style style) {
        this.style = style;
    }


    public ArrayList<Album> getLesAlbums() {
        return lesAlbums;
    }

    // Afficher les albums d'une catégories (leurs titres)
    public void afficherAlbum()
    {
        for (int i=0;i<this.lesAlbums.size();i++)
        {
            System.out.println(" le titre de l'album "+ (i+1) + " "+ this.lesAlbums.get(i).getTitre());
        }
    }

    
    
}
