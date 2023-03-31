package SERIE01.EXO07;

public class Etudiant {
    private String nom,prenom,matricule;
    private double mod1,mod2,mod3;
    private int[] module =new int[]{10,10,10};

    public Etudiant(String nom,String prenom,String matricule,int mod1,int mod2,int mod3)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.matricule=matricule;
        this.mod1=mod1;
        this.mod2=mod2;
        this.mod3=mod3;
    }
    public Etudiant(String nom,String prenom,String matricule){
        this.nom=nom;
        this.prenom=prenom;
        this.matricule=matricule;
  
    }
    public void afficher(){
        System.out.println("le nom  : " + this.nom);
        System.out.println("le prenom : " + this.prenom);
        System.out.println("le matricule : " + this.matricule);
        System.out.println("le moyenne en mod1 : " + this.mod1);
        System.out.println("le moyenne en mod2 : " + this.mod2);
        System.out.println("le moyenne en mod3 : " + this.mod3);
        System.out.println("----------------------------");

    }

    public double calculerMoyenne(){
        Double result=0.0;
        for (int i=0;i<=2;i++)
        {
         result=result+module[i];
        }
         return result/3;

    }



    
}
