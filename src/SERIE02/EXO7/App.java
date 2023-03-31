package SERIE02.EXO7;
import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {

        


        //CREATION DES CLIENTS POUR INITIALISATION DE NETMUSIC 

        Client client1 = new Client("Cherif", "Sarah", "Azazga 15300");
        Client client2 = new Client("John", "Doe", "123 Main St");
        Client client3 = new Client("Jane", "Doe", "456 Elm St");
        Client client4 = new Client("Bob", "Smith", "789 Oak Ave");
        Client client5 = new Client("Alice", "Jones", "10 Pine St");
        Client client6 = new Client("David", "Lee", "321 Cedar St");
        Client client7 = new Client("Emily", "Davis", "555 Maple Ave");
        Client client8 = new Client("Jack", "Brown", "777 Oak St");
        Client client9 = new Client("Karen", "Wilson", "999 Elm St");
        Client client10 = new Client("Mark", "Johnson", "444 Pine Ave");

        // CREATION DES COMPTES NETMUSIC

        CompteNetMusic compte1=   new CompteNetMusic("sarahCherif11", "admin1234", 35000, client1);
        CompteNetMusic compte2 = new CompteNetMusic("johndoe123", "password123", 500, client2);
        CompteNetMusic compte3 = new CompteNetMusic("janedoe456", "secret123", 20000, client3);
        CompteNetMusic compte4 = new CompteNetMusic("bobsmith789", "qwerty123", 100000, client4);
        CompteNetMusic compte5 = new CompteNetMusic("alicejones10", "letmein123", 75000, client5);
        CompteNetMusic compte6 = new CompteNetMusic("davidlee321", "azerty123", 90000, client6);
        CompteNetMusic compte7 = new CompteNetMusic("emilydavis555", "password321", 60000, client7);
        CompteNetMusic compte8 = new CompteNetMusic("jackbrown777", "abc123", 80000, client8);
        CompteNetMusic compte9 = new CompteNetMusic("karenwilson999", "mypassword", 45000, client9);
        CompteNetMusic compte10 = new CompteNetMusic("markjohnson444", "letmein321", 65000, client10);


        //INTIALISATION DU ARRAYLIST DU NETMUSIC 
        ArrayList<CompteNetMusic> comptes=new ArrayList<CompteNetMusic>();

        NetMusic netMusic=new NetMusic(comptes);

        // Ajouter tous les comptes à NetMusic tout en vérifiant à chaque fois si le compte existe déjà

        netMusic.ajouterCompteNetMusic(compte1);
        netMusic.ajouterCompteNetMusic(compte2);
        netMusic.ajouterCompteNetMusic(compte3);
        netMusic.ajouterCompteNetMusic(compte4);
        netMusic.ajouterCompteNetMusic(compte5);
        netMusic.ajouterCompteNetMusic(compte6);
        netMusic.ajouterCompteNetMusic(compte7);
        netMusic.ajouterCompteNetMusic(compte8);
        netMusic.ajouterCompteNetMusic(compte9);
        netMusic.ajouterCompteNetMusic(compte10);




        /*** I. Gestion des clients ***/
//A. Création de Compte


//1. Création d'un client qui n'existe pas
System.out.println("----------------------------------------------------");
System.out.println("1. Création d'un client qui n'existe pas");
Client client11=new Client("ado", "william", "dg st sat");
CompteNetMusic compte12=   new CompteNetMusic("sarahCherif11", "admin1234", 35000, client11);

netMusic.ajouterCompteNetMusic(compte12);


 //2. Test de création d'un client qui existe
 System.out.println("------------------------------------------------------");
 System.out.println("2. Test de création d'un client qui existe");
 Client client12 = new Client("Bob", "Smith", "789 Oak Ave");
 CompteNetMusic compte13=   new CompteNetMusic("alia134", "admin1234", 35000, client12);
 netMusic.ajouterCompteNetMusic(compte13);




 //3. Test de création d'un compte avec un nom d'utilisateur existant
 System.out.println("------------------------------------------------------------------");
 System.out.println("3. Test de création d'un compte avec un nom d'utilisateur existant");
 Client client13 = new Client("Bob", "Wilson", "785 Oak Ave");
 CompteNetMusic compte14=   new CompteNetMusic("bobsmith789", "admin1234", 35000, client13);
 netMusic.ajouterCompteNetMusic(compte14);





 //4. Création d'un compte avec un nom d'utilisateur différent
 System.out.println("-----------------------------------------------------------");
 System.out.println("4. Création d'un compte avec un nom d'utilisateur différent");
 Client client15 = new Client("Katy", "Wilson", "784 Oak Ave");
 CompteNetMusic compte15=   new CompteNetMusic("katy123", "admin1234", 35000, client15);
 netMusic.ajouterCompteNetMusic(compte15);


 //B. Authentification

System.out.println("B. Authentification");


 //1. Test d’authentification d'un client qui n'existe pas
 System.out.println("-------------------------------------------");
 System.out.println("1. Test d'authentification d'un client qui n'existe pas");
 CompteNetMusic compte16=netMusic.authentifier("HADJSAIDThanina", "admin1234");

 //2. Test d’authentification d'un client qui existe mais mot de passe incorrecte
 System.out.println("-------------------------------------------");
 System.out.println("2. Test d'authentification d'un client qui existe mais mot de passe incorrecte");
 compte16=netMusic.authentifier("sarahCherif11", "admin12");

 
 //3. Test d’authentification d'un client qui existe avec mot de passe correcte
 System.out.println("-------------------------------------------");
 System.out.println("3. Test d'authentification d'un client qui existe avec mot de passe correcte");
 compte16=netMusic.authentifier("sarahCherif", "admin1234");



 /*** II. Gestion du catalogue d'Album***/
 System.out.println("-------------------------------------------");
 System.out.println("*** II. Gestion du catalogue d'Album***\n");
//A. Création et affichage des albums

//1. Ajouter des albums physiques et numériques au catalogue
System.out.println("1. Ajouter des albums physiques et numériques au catalogue");

// Creation d'un album numérique 
String[] sons = {"DKR", "Pitbull", "Validée", "92i Veyron", "Friday", "Tombé pour elle", "Scarface", "Ma couleur", "Salside", "Gotham"};
Produit boobaNumerique = new Numerique("Trône", "Booba", "Universal Music", 2017, sons, 9990, Style.RAP, "https://example.com/booba/trone");

String[] son = {"Für Elise", "Moonlight Sonata", "Symphony No. 5", "Turkish March", "Symphony No. 9"};
Produit beethovenNumerique = new Numerique("Greatest Hits", "Ludwig van Beethoven", "Deutsche Grammophon", 2020, son, 1299.0, Style.CLASSIQUE, "https://example.com/beethoven/greatesthits");

String[] sons20 = {"Take Five", "Blue Rondo à la Turk", "Unsquare Dance", "In Your Own Sweet Way", "The Duke", "It's a Raggy Waltz"};
Produit daveBrubeckNumerique = new Numerique("Time Out", "Dave Brubeck Quartet", "Columbia Records", 1959, sons20, 999, Style.JAZZ, "https://example.com/davebrubeck/timeout");


String[] sons2 = {"Shape of You", "Castle on the Hill", "Galway Girl", "Perfect", "Happier", "New Man", "What Do I Know?", "How Would You Feel (Paean)", "Supermarket Flowers"};
Produit edSheeranNumerique = new Numerique("÷ (Divide)", "Ed Sheeran", "Asylum Records", 2017, sons2, 10099, Style.POP, "https://example.com/edsheeran/divide");


String[] sons6 = {"Crazy in Love", "Irreplaceable", "If I Were a Boy", "Halo", "Love on Top", "Drunk in Love", "Formation"};
Produit beyonceNumerique = new Numerique("Dangerously in Love", "Beyoncé", "Columbia Records", 2003, sons6, 11990, Style.RNB, "https://example.com/beyonce/dangerouslyinlove");

// creation d'un album physique
String[] sons1 = {"Au DD", "Blanka", "Zoulou Tchaing", "Deux Frères", "91's", "Kutaubia", "Celsius", "Menace", "Déconnecté", "Autre Monde"};
Produit pnlPhysique = new Physique("Deux Frères", "PNL", "QLF Records", 2019, sons1, 1219, Style.RAP,5,20);

String[] sons5 = {"Lunatic", "Paname", "Je sais", "Maître Gims", "Bella", "J'me tire"};
Produit maitreGimsPhysique = new Physique("Subliminal", "Maître Gims", "Jive Epic", 2013, sons5, 799, Style.RAP, 7,20);

String[] sons4 = {"Stairway to Heaven", "Whole Lotta Love", "Kashmir", "Black Dog", "Rock and Roll", "Immigrant Song"};
Produit ledZeppelinPhysique = new Physique("IV", "Led Zeppelin", "Atlantic Records", 1971, sons4, 899, Style.ROCK, 4,20);


// creation d'une catégorie de styles 

ArrayList<Album>  albums=new ArrayList<Album>();
albums.add((Album)boobaNumerique);
albums.add((Album)pnlPhysique);
Categories categorie=new Categories(albums,Style.RAP);

// Creation d'un catalogue

ArrayList<Categories> catalogueAlbums=new ArrayList<Categories>();
catalogueAlbums.add(categorie);
CatalogueAlbum catalogueDesAlbums= new CatalogueAlbum(catalogueAlbums);

// Ajout des albums physiques et numériques 



System.out.println("-------------------------------------------");
System.out.println("AJOUT des albums physiques et numériques");

catalogueDesAlbums.ajouterProduit(ledZeppelinPhysique);
catalogueDesAlbums.ajouterProduit(daveBrubeckNumerique);
catalogueDesAlbums.ajouterProduit(maitreGimsPhysique);
catalogueDesAlbums.ajouterProduit(beyonceNumerique);
catalogueDesAlbums.ajouterProduit(beethovenNumerique);

//2. Consulter le catalogue d’album
System.out.println("-------------------------------------------");
System.out.println("2. Consulter le catalogue d’album");

 // Ajouter un album d'un autre style 
 catalogueDesAlbums.ajouterProduit(edSheeranNumerique);

 // affichage des albums
catalogueDesAlbums.consulter();

//B. Achat et Remboursement des albums

HashMap<Produit,String> mesAchats=new HashMap<Produit,String>();
compte1.setMesAchats(mesAchats);
//1. Achat de deux albums physique

System.out.println("-------------------------------------------");
System.out.println("1. Achat de deux albums physique");
boolean achatEffectue;

achatEffectue=compte1.acheter((Album) pnlPhysique, "18/03/2023");
if(achatEffectue==true)
{
    System.out.println("Votre achat a bien été effectué");
}
else
{
    System.out.println("Votre crédit est insuffisant ");

}
achatEffectue=compte1.acheter((Album) maitreGimsPhysique, "18/03/2023");
if(achatEffectue==true)
{
    System.out.println("Votre achat a bien été effectué");
}
else
{
    System.out.println("Votre crédit est insuffisant ");

}


//2. Achat d'un album numérique
System.out.println("-------------------------------------------");
System.out.println("1. Achat de deux albums physique");

achatEffectue=compte2.acheter((Album) boobaNumerique, "18/03/2023");
if(achatEffectue==true)
{
    System.out.println("Votre achat a bien été effectué");
}
else
{
    System.out.println("Votre crédit est insuffisant ");

}

//3. Remboursement d'un album physique dans un délai >7 jours 
System.out.println("-------------------------------------------");
System.out.println("3. Remboursement d'un album physique dans un délai >7 jours");
Physique physique=(Physique) pnlPhysique;
physique.rembourser(compte1, 9);
if(physique.rembourser(compte1, 9))
{
    System.out.println("Le remboursement a ete fait");
}
else
{
    System.out.println("Le delai a ete depasse ou vous n'avez jamais achete ce produit");
}


//4. Remboursement d'un album physique dans un délai de 7 jours 
System.out.println("-------------------------------------------");
System.out.println("4. Remboursement d'un album physique dans un délai de 7 jours");
physique.rembourser(compte1, 7);
if(physique.rembourser(compte1, 7))
{
    System.out.println("Le remboursement a ete fait");
}
else
{
    System.out.println("Le delai a ete depasse ou vous n'avez jamais achete ce produit");
}
       
/*** III. Gestion du catalogue de magazines***/
System.out.println("-------------------------------------------");
System.out.println("*** III. Gestion du catalogue de magazines***");

//A. Création et affichage des magazines

//1. Ajouter des magazines au catalogue
System.out.println("-------------------------------------------");
System.out.println("1. Ajouter des magazines au catalogue");
ArrayList<Magazine> magazines=new ArrayList<Magazine>();
Produit mag1 = new Magazine("Magazine 1", 356600,1, "Sommaire 1", 2021, "https://magazine1.com");
Produit mag2 = new Magazine("Magazine 2", 1000,2, "Sommaire 2", 2022, "https://magazine2.com");
Produit mag3 = new Magazine("Magazine 3", 12,3, "Sommaire 3", 2023, "https://magazine3.com");
Produit mag4 = new Magazine("Magazine 4", 300,4, "Sommaire 4", 2024, "https://magazine4.com");
Produit mag5 = new Magazine("Magazine 5", 4000,5, "Sommaire 5", 2025, "https://magazine5.com");
Produit mag6 = new Magazine("Magazine 6", 500,6, "Sommaire 6", 2026, "https://magazine6.com");
Produit mag7 = new Magazine("Magazine 7", 3000,7, "Sommaire 7", 2027, "https://magazine7.com");
Produit mag8 = new Magazine("Magazine 8", 5000,8, "Sommaire 8", 2028, "https://magazine8.com");
Produit mag9 = new Magazine("Magazine 9",1000 ,9, "Sommaire 9", 2029, "https://magazine9.com");
Produit mag10 = new Magazine("Magazine 10",600, 10, "Sommaire 10", 2030, "https://magazine10.com");


magazines.add((Magazine) mag1);
magazines.add((Magazine)mag2);
magazines.add((Magazine)mag3);
magazines.add((Magazine)mag4);
magazines.add((Magazine)mag5);
magazines.add((Magazine)mag6);
magazines.add((Magazine)mag7);
magazines.add((Magazine)mag8);
magazines.add((Magazine)mag9);
magazines.add((Magazine)mag10);


CataloguesDesMagazines catalogueMagazines=new CataloguesDesMagazines(magazines);
compte2.setMesAchats(mesAchats);
//2. Consulter le catalogue de magazines
System.out.println("-------------------------------------------");
System.out.println("2. Consulter le catalogue de magazines");
catalogueMagazines.consulter();


//B. Achat et Remboursement des magazines


//1. Achat d’un magazine sans avoir le solde suffisant pour le faire 
System.out.println("-------------------------------------------");
System.out.println("1. Achat d’un magazine sans avoir le solde suffisant pour le faire");
compte2.acheter(mag1, "19/03/2022");
if(!compte2.acheter(mag1, "19/03/2022"))
{
     System.out.println("Votre solde est insuffisant");
}
else
{
    System.out.println("Votre achat a bien été effectué");
}

//2. Créditer le compte avec 50000 DA
System.out.println("-------------------------------------------");
System.out.println("2. Créditer le compte avec 50000 DA");
compte2.crediter(50000);

//3. Achat de deux magazines


System.out.println("-------------------------------------------");
System.out.println("3. Achat de deux magazines");
compte2.acheter(mag3, "19/03/2022");
if(!compte2.acheter(mag3, "19/03/2022"))
{
     System.out.println("Votre solde est insuffisant pour acheter le magazine " +mag3.getTitre());
}
else
{
    System.out.println("Votre achat du magazine "+ mag3.getTitre()+ " a bien été effectué");
}
compte2.acheter(mag4, "18/03/2023");
if(!compte2.acheter(mag4, "18/03/2023"))
{
     System.out.println("Votre solde est insuffisant pour acheter le magazine " +mag4.getTitre());
}
else
{
    System.out.println("Votre achat du magazine "+ mag4.getTitre()+ " a bien été effectué");
}
//4. Remboursement d'un magazine dans un délai >7 jours 


System.out.println("-------------------------------------------");
System.out.println("4. Remboursement d'un magazine dans un délai >7 jours");
Magazine magazine1=(Magazine)mag3;
magazine1.rembourser(compte2, 11);
if(magazine1.rembourser(compte2, 11))
{
    System.out.println("Votre remboursement suur l'achat du magazine "+magazine1.getTitre()+ " a bien été effectué");
}
else
{
    System.out.println(magazine1.getTitre() +" magazine's ne figure pas dans vos achat ou vous avez dépassé les delais");
}

//5. Remboursement d'un magazine dans un délai de 7 jours
System.out.println("-------------------------------------------");
System.out.println("5. Remboursement d'un magazine dans un délai de 7 jours");
magazine1.rembourser(compte2, 7);     
if(magazine1.rembourser(compte2, 7))
{
    System.out.println("Votre remboursement suur l'achat du magazine "+magazine1.getTitre()+ " a bien été effectué");
}
else
{
    System.out.println(magazine1.getTitre() +" magazine's ne figure pas dans vos achat ou vous avez dépassé les delais");
}



}
}
