package SERIE01.EXO08;

public class App {
    public static void main(String[] args) throws Exception {
        String[] modules={"SINF","PRST","ANG","POO","ARCHI","OPT","ANA4","LOGM"};
        String[] absenceParmodules={"POO","ARCHI","OPT","ANA4"};
        Niveau niveau1=new Niveau(modules,"2CP-G03");
        Etudiant e1=new Etudiant("Cherchem","sarah", "4900", niveau1,absenceParmodules);
        System.out.println(e1.toString());
        Etudiant e2=new Etudiant("Cherchem","sonia", "4900", niveau1,absenceParmodules);
        Etudiant e3=new Etudiant("Cherchem","sofiane", "4900",niveau1,absenceParmodules);
        Etudiant e4=new Etudiant("Cherchem","katia", "4900", niveau1,absenceParmodules);
        Etudiant e5=new Etudiant("Cherchem","lydia", "4900", niveau1,absenceParmodules);
       
        Etudiant[] absencEtudiants={e1,e2,e3};
        Seance tdTpSeance1=new Seance(absencEtudiants,"archi","18/02/2023","09am");
        Seance tdTpSeance2=new Seance(absencEtudiants,"archi","18/02/2023","09am");
        Seance tdTpSeance3=new Seance(absencEtudiants,"archi","18/02/2023","09am");
        Seance tdTpSeance4=new Seance(absencEtudiants,"archi","18/02/2023","09am");


        Etudiant[] listeEtudiants={e1,e2,e3,e4,e5};
        Seance[] listeSeances={tdTpSeance2,tdTpSeance1,tdTpSeance3,tdTpSeance4};
        Assiduite assiduiteService=new Assiduite(listeEtudiants,listeSeances);
        Etudiant[] etudiants=assiduiteService.getEtudiants();
        for (int i=0;i<etudiants.length;i++){
                etudiants[i].afficher();
        }
         //List<String> testList = new ArrayList<String>();

         System.out.println("Les modules enseiges en deuxième année");
         for(int i=0;(i<niveau1.getModules().length);i++)
         {
            System.out.print(niveau1.getModules()[i] +",");

         }





    }
}
