
package mini_projet;

import java.util.ArrayList;
import java.util.Date;
import core.Contact;
import core.Etudiant;
import core.Enseignant;
import core.Agent;
import core.Repertoire;

public class MainApplication {

   
    public static void main(String[] args) {
        // Création d'un répertoire
        Repertoire repertoire = new Repertoire();

        // Ajout de quelques contacts pour tester
        repertoire.ajouterContact(new Etudiant("ET001", "John Doe", new Date(), "123 Rue de la Paix", "john.doe@example.com", "1234567890", "Licence", "1"));
        repertoire.ajouterContact(new Enseignant("ENS001", "Jane Smith", new Date(), "456 Avenue des Champs", "jane.smith@example.com", "0987654321", "Permanent"));
        repertoire.ajouterContact(new Agent("AG001", "Alice Johnson", new Date(), "789 Boulevard du Temps", "alice.johnson@example.com", "6789012345", 2500.0, "Permanent", "Catégorie A", 1, "Secrétaire"));

        // Test des méthodes du répertoire
        System.out.println("=== Liste des contacts ===");
        for (Contact contact : repertoire.getListeContacts()) {
            System.out.println(contact.getNom());
        }

        // Recherche d'un contact par son code
        String codeRecherche = "ET001";
        Contact contactRecherche = repertoire.rechercherContactParCode(codeRecherche);
        if (contactRecherche != null) {
            System.out.println("Contact trouvé: " + contactRecherche.getNom());
        } else {
            System.out.println("Contact non trouvé pour le code: " + codeRecherche);
        }

        // Modification d'un contact
        Etudiant etudiantModifie = new Etudiant("ET001", "John Doe Modifié", new Date(), "456 Rue des Fleurs", "john.doe@example.com", "987654321", "Licence", "2");
        repertoire.modifierContact(etudiantModifie);
        
        // Suppression d'un contact
        repertoire.supprimerContact(repertoire.rechercherContactParCode("ENS001"));

        // Affichage de la liste des contacts après modification
        System.out.println("=== Liste des contacts après modification ===");
        for (Contact contact : repertoire.getListeContacts()) {
            System.out.println(contact.getNom());
        }
    }
}



    
   
