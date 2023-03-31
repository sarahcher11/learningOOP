package SERIE01.EXO02;

class C extends B {
    protected int b = 7;
    protected int c = 8;
    public C(int c) {
    super(3 * c);
    b = c;
    }
    public void afficherClasse() {
    super.afficherClasse();
    System.out.println("Classe C");
    }
    public void afficherVariables() {
    super.afficherVariables();
    System.out.println("c = " + c);
    } 
   }
