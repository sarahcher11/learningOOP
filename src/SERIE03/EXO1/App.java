package SERIE03.EXO1;

public class App {
    public static void main(String[] args) throws Exception{
int i=0;
        try {
             i=Integer.parseInt(args[0]);
          if (i<0) throw new NegativeException(); 
     
             

            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Veuillez entrer une autre valeur");
        }
        catch (NumberFormatException e){
            System.out.println(" L’argument doit  être un entier");
        }
        

        int fact=1;
        if (i==0 || i==1)
        {
            fact=1;
        }
        else
        {
           for(int j=1;j<=i;j++)
           {
               fact=(fact*j);
           }
        }
        System.out.println("le fact est :"+fact);

    }
}
