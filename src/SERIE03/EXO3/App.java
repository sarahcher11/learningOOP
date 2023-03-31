package SERIE03.EXO3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        HashSet<Animal> animaux=new HashSet<Animal>();
        Animal animal1=new Animal("Lion");
        Animal animal2=new Animal("Chat");
        Animal animal3=new Animal("vache");
        Animal animal4=new Animal("Chien");
        animaux.add(animal1);
        animaux.add(animal2);
        animaux.add(animal3);
        animaux.add(animal4);
        Animal animal;
        Iterator<Animal> it=animaux.iterator();
        Animal animal5=new Animal("Chien");
        Animal animal6=new Animal("Chien");
        Animal animal7=new Animal("Chien");

        animaux.add(animal7);
        animaux.add(animal6);
        animaux.add(animal5);
        animaux.add(new Animal("cheval"));
       Set<Animal> animals=new TreeSet<Animal>(animaux);
       it=animaux.iterator();
       while(  it.hasNext())
       {
           animal=it.next();
           animal.afficher();
       }
       ArrayList<Animal> animals2=new ArrayList<Animal>();
       animals2.add(animal7);
       animals2.add(animal1);
       animals2.add(animal2);
       animals2.add(animal3);
       animals2.add(animal4);
       animals2.add(animal6);

    

    }
}
