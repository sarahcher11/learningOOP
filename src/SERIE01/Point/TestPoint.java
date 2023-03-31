package SERIE01.Point;

import java.util.Scanner;
public class TestPoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entrer le point en axe des abscices : ");
        int x=sc.nextInt();
        System.out.print("Entrer le point en axe des ordonnees : ");
        int y=sc.nextInt();
        Point p=new Point(x,y);
        p.afficher();
        sc.close();
    }
    
}
