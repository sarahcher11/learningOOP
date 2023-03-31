package SERIE01.EXO07;

public class App {

    public static void main(String[] args) throws Exception {
        Etudiant et1=new Etudiant("nkjkkk","kkk","123",12,44,22);
        Etudiant et2=new Etudiant("nkjkkk","kkk","123",12,44,22);
        Etudiant et3=new Etudiant("nkjkkk","kkk","123",12,44,22);
        Etudiant et4=new Etudiant("nkjkkk","kkk","123",12,44,22);
        Scolarite sc= new Scolarite();

        sc.inscrire(et4);
        sc.inscrire(et1);
        sc.inscrire(et2);
        sc.inscrire(et3);

        sc.afficher();




        



    }
}
