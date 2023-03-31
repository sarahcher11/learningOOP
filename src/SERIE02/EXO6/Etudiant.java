package SERIE02.EXO6;

public class Etudiant extends Personne implements Comparable<Etudiant>{
    int matricule;
    double[] notes;
    public double calculMoyenne(double[] notes )
    {
        double res=0;
        for(int i=0;i<notes.length;i++)
        {
           res=res+notes[i]; 
        }
        return res;
    }

    
    public void afficherType()
    {
        System.out.println(getClass());
    }
    @Override
    public int compareTo(Etudiant o) {
        int i=0;
        if(calculMoyenne(this.notes)>o.calculMoyenne(o.notes))
        {
            i=1;
        }
        else
        {
          if(calculMoyenne(this.notes)<o.calculMoyenne(o.notes))
          {
            i=-1;
          }
          else
          {
            i=0;
          }
        }
        return i;
    }


}
