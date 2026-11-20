import java.util.Scanner;

public class Produit {

    private String reference;
    private String designation;
    private double prixHT;
    private int quantiteStock;

    public Produit () {
    }

    public Produit(String reference, String designation, double prixHT, int quantiteStock) {
        this.reference = reference;
        this.designation = designation;
        this.prixHT = prixHT;
        this.quantiteStock = quantiteStock;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public int getquantiteStock() {
        return quantiteStock;
    }

    public void setquantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public void afficher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner references :");
        String reference = sc.nextLine();
        System.out.println("Donner designation:");
        String designation = sc.nextLine();
        System.out.println("Donner prix :");
        double prixHT = sc.nextDouble();
        System.out.println("Donner Qte:");
        int quantiteStock = sc.nextInt();
        System.out.println("Reference : " + reference);
        System.out.println("Designation : " + designation);
        System.out.println("Prix HT : " + prixHT);
        System.out.println("Quantite Stock : " + quantiteStock);
        sc.close();
    }

    public void afficherProduit() {
        System.out.println("reference : " + reference);
        System.out.println("designation : " + designation);
        System.out.println("Prix HT : " + prixHT);
        System.out.println("Quantite Stock : " + quantiteStock);
    }

    public void choix() {
    }
}