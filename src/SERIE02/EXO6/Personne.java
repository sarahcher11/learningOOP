package SERIE02.EXO6;

public abstract class Personne{
    protected String nom;
    protected  String prenom;
    protected int age;
    public Personne(String nom,String prenom,int age){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;


    }
    public Personne(){}
    public void afficher(){
        System.out.println(this.nom);
        System.out.println(this.prenom);
        System.out.println(this.age);
    }

    public abstract void afficherType();
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    

}