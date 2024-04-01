
package core;
import java.util.Date;


public class Etudiant extends Contact {
    private String cycle;
    private String niveau;

    public Etudiant(String code, String nom, Date dateNaissance, String adresse, String email, String telNumber, String cycle, String niveau) {
        super(code, nom, dateNaissance, adresse, email, telNumber);
        this.cycle = cycle; // licence ingénieur
        this.niveau = niveau;
    }

    // Getters and Setters
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
    @Override
    public String toString() {
        return super.toString() + ", Cycle: " + cycle + ", Niveau: " + niveau;
    }



    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
