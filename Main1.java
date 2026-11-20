import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Produit p = new Produit("ref1", "ordinateur", 750.5, 25);
        Produit p1 = new Produit("ref2", "clavier", 500.4, 10);
        Scanner sc = new Scanner(System.in);
        int choix;
        System.out.println("Donner votre choix :");
        choix = sc.nextInt();
        switch (choix) {
            case 1:
                System.out.println("Produit p");
                p.afficherProduit();
                System.out.println("Produit p1");
                p1.afficherProduit();
                break;
            case 2:
                System.out.println("Produit p1");
                p1.afficherProduit();
                break;
            case 3:
                int pr;
                System.out.print("Choisir un produit à modifier (1 pour p, 2 pour p1) : ");
                pr = sc.nextInt();
                sc.nextLine();
                System.out.print("Donner la nouvelle référence : ");
                String nouvelleRef = sc.nextLine();
                if (pr == 1) {
                    p.setReference(nouvelleRef);
                    System.out.println("Référence mise à jour avec succès pour le produit p !");
                } else if (pr == 2) {
                    p1.setReference(nouvelleRef);
                    System.out.println("Référence mise à jour avec succès pour le produit p1 !");
                } else {
                    System.out.println("Ce produit n'existe pas !");
                }
                break;
            case 4:
                System.out.println("Au revoir !");
                break;
            default:
                System.out.println("Choix invalide !");
        }
    }
}

