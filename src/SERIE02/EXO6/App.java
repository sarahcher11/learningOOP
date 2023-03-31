package SERIE02.EXO6;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String[] modules ={"","",""};
        Enseignant enseignant=new Enseignant("djndcc", "dcdf;cdf", 55, 0,modules);
        Enseignant enseignant1=new Enseignant("aeded", "dcdc", 55, 0,modules);
        Enseignant enseignant2=new Enseignant("dccd", "dcd", 55, 0,modules);
        Enseignant enseignant3=new Enseignant("dcd", "ddc", 55, 0,modules);
        Enseignant enseignant4=new Enseignant("aaab", "bchdj", 55, 0,modules);
        Enseignant enseignant5=new Enseignant("hjui", "poli", 55, 0,modules);
        Enseignant enseignant6=new Enseignant("ert", "VF", 55, 0,modules);

        Enseignant[] enseignants={enseignant,enseignant1,enseignant2,enseignant3,enseignant4,enseignant5,enseignant6};
        Arrays.sort(enseignants);
        for (int i=0;i<enseignants.length;i++)
        {
            System.out.println(i + " "+ enseignants[i].nom + " ; " + enseignants[i].prenom);
        }

        enseignant.afficherType();
        Etudiant etudiant=new Etudiant();
        etudiant.afficherType();

    }
}
