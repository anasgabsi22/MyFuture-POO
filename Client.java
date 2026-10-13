public class Client {
    private String cin;
    private String nom;
    private String prenom;
    private String telephone;
    // constructeur
    public Client(String cin, String nom, String prenom, String telephone) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;

    }
    public String getcin() {
        return cin;
    }
    public void setcin(String cin) {
        this.cin = cin;
    }    
    public String getnom(){
        return nom;
    }
    public void setnom(String nom) {
        this.nom = nom;
    }
    
    public String getprenom(){
        return prenom;
    }
    public void setprenom(String prenom) {
        this.prenom = prenom;
    }
    public String gettelephone(){
        return telephone;
    }
    public void settelephone(String telephone) {
        this.telephone = telephone;
    }
    // affichage client
    public void afficherClient() {
        System.out.println("[CIN: " +cin + "] Nom & Prénom: " + nom + " " + prenom + "| tél:" + telephone + ".");
    }
}
