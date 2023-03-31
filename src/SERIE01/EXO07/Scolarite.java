package SERIE01.EXO07;

public class Scolarite {
    private Etudiant[] etudiants; 
    private int nbEtudiants;
    private final int NOMBRE_MAXIMUM=500;
    public Scolarite(){
    this.etudiants=new Etudiant[NOMBRE_MAXIMUM];
    this.nbEtudiants=0;
    }
    public int nbEtudiants(){ 
    return this.nbEtudiants;
    }
    public void inscrire(Etudiant etudiant){
        
    if(this.nbEtudiants < this.NOMBRE_MAXIMUM){
    this.etudiants[this.nbEtudiants] = etudiant;
    this.nbEtudiants++;
    }
    }

    public void afficher(){
        for(int i=0 ; i<nbEtudiants;i++){
        etudiants[i].afficher();
        }
    }
    public void afficher(float moyenne){
        for(int i=0 ; i<nbEtudiants;i++){
        if(etudiants[i].calculerMoyenne()>moyenne || 
         etudiants[i].calculerMoyenne()==moyenne)
        etudiants[i].afficher();
        }
    }
}
