
package core;

import java.util.ArrayList;
import java.util.List;

public class Repertoire {
    private ArrayList<Contact> listeContacts;

    // Constructeur
    public Repertoire() {
        listeContacts = new ArrayList<>();
    }

    // Méthode pour ajouter un contact
    public void ajouterContact(Contact contact) {
        listeContacts.add(contact);
    }

    // Méthode pour supprimer un contact
    public void supprimerContact(Contact contact) {
        listeContacts.remove(contact);
    }

    // Méthode pour modifier un contact
    public void modifierContact(Contact contactModifie) {
        for (int i = 0; i < listeContacts.size(); i++) {
            Contact contact = listeContacts.get(i);
            if (contact.getCode().equals(contactModifie.getCode())) {
                listeContacts.set(i, contactModifie);
                return; // Contact modifié, on quitte la méthode
            }
        }
        // Si on arrive ici, le contact n'a pas été trouvé dans la liste
        System.out.println("Contact non trouvé pour la modification.");
    }

    // Méthode pour rechercher un contact par son code
    public Contact rechercherContactParCode(String code) {
        for (Contact contact : listeContacts) {
            if (contact.getCode().equals(code)) {
                return contact;
            }
        }
        return null; // Contact non trouvé
    }

    // Getters et Setters
    public ArrayList<Contact> getListeContacts() {
        return listeContacts;
    }

    public void setListeContacts(ArrayList<Contact> listeContacts) {
        this.listeContacts = listeContacts;
    }


        
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
