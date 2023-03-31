package SERIE02.EXO9;

public class Assiduite {

    private final int MAX_ETUDIANT=500;
    private Etudiant[] etudiants=new Etudiant[MAX_ETUDIANT];
    private Seance[] seance;

    public Assiduite(Etudiant[] etudiants,Seance[] seance)
    {
        this.etudiants=etudiants;
        this.seance=seance;
    }
    public void afficherAssiduite()
    {
        System.out.println(this.etudiants);
        System.out.println(this.seance);
    }
    public Etudiant[] getEtudiants(){
        return this.etudiants;
    }
    public Seance[] getSeances(){
        return this.seance;
    }
    
}
