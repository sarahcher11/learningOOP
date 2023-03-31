package SERIE01.EXO08;

public class Seance {
    private String nomDuModule;
    private String date;
    private String heure;
    private Etudiant[] absences;
     
     public Seance(Etudiant[] absences,String nomDuModule,String date,String heure)
     {
              this.absences=absences; 
              this.date=date;
              this.nomDuModule=nomDuModule;
              this.heure=heure;
     }
     public Seance(){
        
     }

     public void ajouterUnAbsent(Etudiant[] e)
     {
        this.absences=e;
     }

     public void afficherSeance(){
          System.out.println("Date   : "  + this.date);
          System.out.println("Heure  : "  +  this.heure);
          System.out.println("Module : "  + this.nomDuModule);
          for(int i=0;i<absences.length;i++)
          {
            System.out.println(i+1+ "-"+ this.absences[i]);
          }
     }

     public String getNomDuModule()
     {
        return this.nomDuModule;
     }

     public String getHeure(){
        return this.heure;
     }

     public String getDate(){
        return this.date;
     }



}
