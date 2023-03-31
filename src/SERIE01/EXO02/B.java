package SERIE01.EXO02;

class B extends A {
    protected int b = 6;
    public B(int b) {
    super(2 * b);
    a = b;
    }
    public void afficherClasse() {
    super.afficherClasse();
    System.out.println("Classe B");
    }
    public void afficherVariables() {
    super.afficherVariables();
    System.out.println("b = " + b);
    }
   }
