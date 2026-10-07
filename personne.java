import java.util.Scanner;

public class Personne {
    public static void main(String[] args) {
        Scanner s2 = new Scanner(System.in);

        System.out.println("Saisir votre nom :");
        String nom = s2.next();

        System.out.println("Saisir votre CIN :");
        int cin = s2.nextInt();

        System.out.println("Saisir votre prénom :");
        String prenom = s2.next();

        System.out.println("Saisir votre ville :");
        String ville = s2.next();

        System.out.println("Nom: " + nom);
        System.out.println("CIN: " + cin);
        System.out.println("Prénom: " + prenom);
        System.out.println("Ville: " + ville);

        s2.close();
    }
}