package SERIE01.Point;

class Point{
    private int x;
    private int y;
public Point(int absc, int ord){
x = absc;
y = ord;
}
public void deplacer (int dx, int dy){
    x = x + dx;
    y = y + dy;
}
public void afficher(){
    System.out.println("Mes coordonnées sont x = "+x+" et y ="+y);
}
}
