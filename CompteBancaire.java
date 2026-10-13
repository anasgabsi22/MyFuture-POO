public class CompteBancaire {
    private String numeroCompte;
    private double solde;
    private Client titulaire;
    private static int nombreComptes = 0;
    

// constructeur
public CompteBancaire(String numeroCompte, double soldeInitial, Client titulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = soldeInitial;
        this.titulaire = titulaire;
        nombreComptes++; // Incrémentation du compteur de comptes créés
    }

    // Getters et Setters
    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public Client getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Client titulaire) {
        this.titulaire = titulaire;
    }

    public static int getNombreComptes() {
        return nombreComptes;
    }

    // Méthodes métier
    public void deposer(double montant) {
        if (montant > 0) {
            this.solde += montant;
            System.out.println("Dépôt de " + montant + " TND effectué sur le compte " + numeroCompte + ".");
        } else {
            System.out.println("Montant de dépôt invalide !");
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            this.solde -= montant;
            System.out.println("Retrait de " + montant + " TND effectué sur le compte " + numeroCompte + ".");
        } else {
            System.out.println("Échec\nSolde insuffisant sur le compte " + numeroCompte + " (Solde actuel: " + solde + " TND).");
        }
    }

    public void virement(CompteBancaire destination, double montant) {
        System.out.println("Tentative de virement de " + montant + " TND vers le compte " + destination.getNumeroCompte() + "...");
        if (montant > 0 && this.solde >= montant) {
            this.retirer(montant);
            destination.deposer(montant);
            System.out.println("Virement réussi !");
        } else {
            System.out.println("Échec du virement : solde insuffisant.");
        }
    }

    public void afficherDetails() {
        System.out.println("Compte N°: " + numeroCompte);
        System.out.print("Titulaire : ");
        if (titulaire != null) {
            titulaire.afficherClient();
        }
        System.out.println("Solde Actuel : " + solde + " TND");
    }
}