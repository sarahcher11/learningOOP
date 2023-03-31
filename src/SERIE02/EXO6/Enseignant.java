package SERIE02.EXO6;

public class Enseignant extends Personne implements Comparable<Enseignant>{

    private long numeroDelaSecuriteSocial;
    private String[] modules;


    public Enseignant(String nom, String prenom, int age,long numeroDelaSecuriteSocial,String[] modules) {
        super(nom, prenom, age);
        this.numeroDelaSecuriteSocial=numeroDelaSecuriteSocial;
        this.modules=modules;
    }

    public  void afficher()
    {
       super.afficher();
       System.out.println("numéro de la securité sociale :" + numeroDelaSecuriteSocial);
       System.out.println("*************");
       for (int i=0;i<modules.length;i++)
       {
         System.out.println("module :"+ modules[i]);
       }
    }
    public void afficherType()
    {
        System.out.println(getClass());
    }


    @Override
    public int compareTo(Enseignant o) {

        int i=(this.nom+this.prenom).compareTo(o.nom+o.prenom);
        
        return i;
    }



}
