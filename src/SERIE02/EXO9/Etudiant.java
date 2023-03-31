package SERIE02.EXO9;

public class Etudiant
{
     private String nom;
     private String prenom;
     private String matricule;
     private Niveau niveau;
     private String [] absenceParModule;
     public void afficher()
     {
        System.out.println(this.nom);
        System.out.println(this.prenom);
        System.out.println(this.matricule);
        System.out.println(this.niveau);
        for (int i=0;i<absenceParModule.length;i++){
        System.out.println(i+1+"-"+absenceParModule[i]);
        }
        System.out.println("****************************");


     }
     public Etudiant(String nom,String prenom,String matricule,Niveau niveau,String[] absenceParModule)
     {
        this.nom=nom;
        this.prenom=prenom;
        this.matricule=matricule;
        this.niveau=niveau;
        this.absenceParModule=absenceParModule;
        
     }
     public String[] getAbsenceParModule()
     {
      return this.absenceParModule;
     }

     

}