
package core;
import java.util.Date;

public class Enseignant extends Contact {
    private String statut;

    public Enseignant(String code, String nom, Date dateNaissance, String adresse, String email, String telNumber, String statut) {
        super(code, nom, dateNaissance, adresse, email, telNumber);
        this.statut = statut;
    }

    // Getters and Setters
    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }


    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
