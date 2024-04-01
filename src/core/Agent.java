
package core;

import java.util.Date;

public class Agent extends Contact {
    private double salaire;
    private String categorie;
    private String statut;
    private int indiceSalaire;
    private String occupation;

    public Agent(String code, String nom, Date dateNaissance, String adresse, String email, String telNumber, double salaire, String categorie, String statut, int indiceSalaire, String occupation) {
        super(code, nom, dateNaissance, adresse, email, telNumber);
        this.salaire = salaire;
        this.categorie = categorie;
        this.statut = statut; // vacataire, permanent
        this.indiceSalaire = indiceSalaire;
        this.occupation = occupation;
    }

    // Getters and Setters
    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public int getIndiceSalaire() {
        return indiceSalaire;
    }

    public void setIndiceSalaire(int indiceSalaire) {
        this.indiceSalaire = indiceSalaire;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }



    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
