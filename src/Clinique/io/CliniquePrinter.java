package Clinique.io;

import java.util.Vector;
import Clinique.anim.*;

/**
 * Cette classe permet d'imprimer des informations sur les animaux dans la clinique.
 */
public class CliniquePrinter {

    /**
     * Affiche les détails de chaque animal dans le tableau.
     *
     * @param tableau Le tableau d'animaux à afficher.
     */
    public static void afficherUnTableau(Vector<Animal> tableau) {
        for (Animal animal : tableau) {
            animal.afficherLAnimal();
        }
        System.out.println();
    }

    /**
     * Recherche un animal par son nom dans le tableau et affiche ses détails s'il est trouvé.
     *
     * @param tableau Le tableau d'animaux à rechercher.
     */
    public static void rechercherUnAnimal(Vector<Animal> tableau) {
        System.out.print("\nNom de l'animal :");
        String name = Animal.saisie_chaine();
        for (Animal animal : tableau) {
            if (animal.getNom().equals(name)) {
                animal.afficherLAnimal();
                return; 
            }
        }
        System.err.println("Pas d'animal à ce nom");; 
    }

    /**
     * Compte le nombre d'animaux d'une espèce spécifique dans le tableau.
     *
     * @param tableau Le tableau d'animaux à compter.
     */
    public static void compterUneEspece(Vector<Animal> tableau) {
        System.out.print("\nNom de l'espece :");
        String name = Animal.saisie_chaine();
        int count = 0;
        for (Animal animal : tableau) {
            if (animal instanceof AnimalCompanie) {
                if (((AnimalCompanie)animal).getRace().equals(name)){
                    count++;
                }
            }
        }
        System.out.println("Il y a "+count+" "+name);; 
    }

    /**
     * Affiche le menu d'options pour l'utilisateur.
     */
    public static void afficherMenu(){
        System.out.println("\nQue voulez-vous faire ? :\n");
        System.out.println("Ajouter un animal : 1");
        System.out.println("Afficher les animaux : 2");
        System.out.println("Sauvegarder dans un fichier : 3");
        System.out.println("Trouver un animal avec son nom : 4");
        System.out.println("Compter le nombre d'individus : 5");
        System.out.println("Quitter : 6");
    }
}
