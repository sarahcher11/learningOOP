package SERIE03.EXO3;

public class Animal implements Comparable<Animal>{
    private String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public void afficher()
    {
        System.out.println(this.nom);
    }


    @Override 
    public boolean equals(Object animal)
    {
        return(this.nom.equals( ((Animal)animal).getNom()));
        
    }

    @Override
    public int hashCode()
    {
       return this.nom.hashCode();
    }

    public String getNom() {
        return nom;
    }
    @Override
    public int compareTo(Animal animal)
    {
        return this.nom.compareTo( animal.getNom());
    }

}
